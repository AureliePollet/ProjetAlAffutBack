package fr.alaffut.springboot.services;

import java.util.List;

import org.springframework.data.domain.Pageable;

import fr.alaffut.springboot.dto.CommerceDto;

public interface CommerceService {
    
    List<CommerceDto> getAllCommerce(Pageable page);
    
   CommerceDto saveOrUpdate(CommerceDto commerce);
    
    void deleteCommerce(long id);
    
    List<CommerceDto> getCommerceByTypeCode(String nom);

}
