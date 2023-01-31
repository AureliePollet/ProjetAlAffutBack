package fr.alaffut.springboot.services;

import java.util.List;

import org.springframework.data.domain.Pageable;


import fr.alaffut.springboot.dto.TypeCodeDto;

public interface TypeCodeService {
    

    List<TypeCodeDto> getAllTypeCode(Pageable page);
    
    TypeCodeDto saveOrUpdate(TypeCodeDto typeCode);
    
    void deleteTypeCode(long id);
    

}
