package fr.alaffut.springboot.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.alaffut.springboot.entities.CodePromo;

public interface CodePromoRepository extends JpaRepository<CodePromo, Long> {

    List<CodePromo> findByDateDebut(LocalDate date);
    
    
}
