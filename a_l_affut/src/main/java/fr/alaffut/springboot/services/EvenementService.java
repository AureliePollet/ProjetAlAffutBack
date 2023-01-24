package fr.alaffut.springboot.services;

import java.awt.print.Pageable;
import java.util.List;

import fr.alaffut.springboot.dto.EvenementDto;

public interface EvenementService {
    
    List<EvenementDto> getAllEvents(Pageable page);
    
    
}
