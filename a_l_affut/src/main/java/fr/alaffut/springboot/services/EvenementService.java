package fr.alaffut.springboot.services;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;

import fr.alaffut.springboot.dto.EtudiantDto;
import fr.alaffut.springboot.dto.EvenementDto;

public interface EvenementService {
    
    List<EvenementDto> getAllEvents(Pageable page);
    
    EvenementDto saveOrUpdate(EvenementDto evenement);
    
    void deleteEvent(long id);
    
    EvenementDto ajoutEtudiantEvement(long idEv,long idEt) throws Exception;
    
    List<EvenementDto> getEventsByDate(int date);
}
