package fr.alaffut.springboot.services;


import java.util.List;

import org.springframework.data.domain.Pageable;

import fr.alaffut.springboot.dto.EtudiantDto;
import fr.alaffut.springboot.entities.Etudiant;

public interface EtudiantService {
    
    
    List<EtudiantDto> getAllEtudiant (Pageable page);
    
    
    EtudiantDto saveOrUpdate (EtudiantDto etudiant);
    
    void deleteEtudiant(long id);
    
    // creation du compte etudiant
    
}