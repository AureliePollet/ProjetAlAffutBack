package fr.alaffut.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.alaffut.springboot.entities.TypeCode;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface TypeCodeRepository extends JpaRepository<TypeCode, Long> {
    

}
