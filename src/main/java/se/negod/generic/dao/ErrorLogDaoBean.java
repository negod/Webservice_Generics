/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.negod.generic.dao;

import javax.ejb.Stateless;
import se.negod.generic.control.Response;
import se.negod.generic.dto.ErrorLogDto;
import se.negod.generic.entity.ErrorLog;
import se.negod.generic.error.GenericError;

/**
 * 
 *
 * @author Joakim Johansson (joakimjohansson@outlook.com)
 */
@Stateless
public class ErrorLogDaoBean extends BaseDaoBean<ErrorLog, ErrorLogDto> implements ErrorLogDao<ErrorLog, ErrorLogDto> {

    public ErrorLogDaoBean() {
        super(ErrorLog.class, ErrorLogDto.class);
    }

    @Override
    public Response<String> create(ErrorLogDto dto) {
        return Response.error(GenericError.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public Response<String> update(ErrorLogDto dto, String extId) {
        return Response.error(GenericError.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public Response createLog(ErrorLogDto dto) {
        try {
            Response<ErrorLog> log = super.getMapper().mapFromDtoToEntity(dto);
            if (log.hasNoErrors) {
                Response createdLog = super.create(log.getData());
            }
            return Response.error(dto.getCode());
        } catch (Exception e) {
            return Response.error(dto.getCode());
        }
    }

}
