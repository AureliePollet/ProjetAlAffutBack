package fr.alaffut.springboot.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.alaffut.springboot.entities.Evenement;
import jakarta.transaction.Transactional;

@Transactional
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    
    List<Evenement> findByDate(LocalDate date);
    
    Evenement deleteByName(String name);
    

}
