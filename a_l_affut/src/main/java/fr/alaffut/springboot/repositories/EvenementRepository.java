package fr.alaffut.springboot.repositories;

import java.awt.print.Pageable;
import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.alaffut.springboot.entities.Evenement;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    
    List<Evenement> findByDate(LocalDate date);
    
    Evenement deleteByNom(String nom);
    
   // List<Evenement> findAll(Pageable page);
    

}
