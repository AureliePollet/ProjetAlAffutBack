package fr.alaffut.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.alaffut.springboot.entities.Commerce;

public interface CommerceRepository extends JpaRepository<Commerce, Long> {
    
    List<Commerce> findByNom (String nom);
    
    List<Commerce> findByCodesPromosTypeCodeNom(String nom);

}
