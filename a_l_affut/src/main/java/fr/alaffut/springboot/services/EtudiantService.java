package fr.alaffut.springboot.services;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

import fr.alaffut.springboot.dto.EtudiantDto;
import fr.alaffut.springboot.entities.Etudiant;

public interface EtudiantService {
    
    
    List<EtudiantDto> getAllEtudiant (Pageable page);
    
    
    EtudiantDto saveOrUpdate (EtudiantDto etudiant);
    
    void deleteEtudiant(long id);
    
    Optional<EtudiantDto> login(EtudiantDto etudiant);
    
    // creation du compte etudiant
    
}