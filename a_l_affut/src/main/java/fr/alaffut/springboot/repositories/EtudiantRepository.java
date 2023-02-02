package fr.alaffut.springboot.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.alaffut.springboot.entities.Etudiant;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    
    //List<Etudiant> addEtudiants (Etudiant etudiant);
    
    List<Etudiant> deleteEtudiantsByNom (Long id);
    
//  List<Etudiant> findAllByNom (String nom);
    
    List<Etudiant> findEtudiantsById (Long id);
     
    List<Etudiant> deleteEtudiantsById (Long id);

    

    
    
     
     
        
     
    
    
    
    
    
    
    
    
    
    
}