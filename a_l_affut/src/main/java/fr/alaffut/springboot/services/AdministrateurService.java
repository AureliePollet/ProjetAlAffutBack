package fr.alaffut.springboot.services;

import java.util.List;

import org.springframework.data.domain.Pageable;

import fr.alaffut.springboot.dto.AdministrateurDto;


public interface AdministrateurService {

    List<AdministrateurDto> getAllAdministrateur(Pageable page);
    
    AdministrateurDto saveOrUpdate(AdministrateurDto administrateur);
    
    void deleteAdministrateur(long id);
}
