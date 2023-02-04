package fr.alaffut.springboot.repositories;

import java.awt.print.Pageable;
import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.alaffut.springboot.entities.Evenement;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    
   // List<Evenement> findByDateMonth(LocalDate date);
    
    Evenement deleteByNom(String nom);
    
   // List<Evenement> findAll(Pageable page);
    
    
    @Query(value="SELECT * FROM evenements WHERE MONTH(date)=:date", nativeQuery=true) 
    List<Evenement> trouverEvenementParDate(@Param("date") int date);
    
    // sinon le faire en native query si ça ne fonctionne pas
    
}
