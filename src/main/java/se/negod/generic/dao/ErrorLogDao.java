/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.negod.generic.dao;

import javax.ejb.Local;
import se.negod.generic.control.Response;
import se.negod.generic.dto.BaseDto;
import se.negod.generic.dto.ErrorLogDto;
import se.negod.generic.entity.BaseEntity;

/**
 *
 * @author Joakim Johansson (joakimjohansson@outlook.com)
 * @param <E>
 * @param <D>
 */

@Local
public interface ErrorLogDao<E extends BaseEntity, D extends BaseDto> extends BaseDao<E, D> {
    
    public Response createLog(ErrorLogDto dto);
    
}
