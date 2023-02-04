package fr.alaffut.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.alaffut.springboot.entities.Administrateur;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

    
     
}
