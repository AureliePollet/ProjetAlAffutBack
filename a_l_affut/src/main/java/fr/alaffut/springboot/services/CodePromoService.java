package fr.alaffut.springboot.services;

import java.util.List;

import org.springframework.data.domain.Pageable;

import fr.alaffut.springboot.dto.CodePromoDto;



public interface CodePromoService {
    
    List<CodePromoDto> getAllCodePromo(Pageable page);
    
    CodePromoDto saveOrUpdate(CodePromoDto codePromo);
     
     void deleteCodePromo(long id);

}
