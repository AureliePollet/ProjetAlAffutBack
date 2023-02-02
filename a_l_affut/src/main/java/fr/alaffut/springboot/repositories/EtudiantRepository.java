package fr.alaffut.springboot.repositories;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.alaffut.springboot.entities.Etudiant;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    
   //List<Etudiant> addEtudiants (Etudiant etudiant);
    
    Etudiant deleteByNom (String nom);
    
//  List<Etudiant> findAllByNom (String nom);
         


    

    
    
     
     
        
     
    
    
    
    
    
    
    
    
    
    
}