package fr.alaffut.springboot.services;



import java.util.List;

import org.springframework.data.domain.Pageable;

import fr.alaffut.springboot.dto.EvenementDto;

public interface EvenementService {
    
    List<EvenementDto> getAllEvents(Pageable page);
    
    EvenementDto saveOrUpdate(EvenementDto evenement);
    
    void deleteEvent(long id);
    
}
