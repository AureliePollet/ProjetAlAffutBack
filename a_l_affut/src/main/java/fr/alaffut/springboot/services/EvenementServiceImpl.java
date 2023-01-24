package fr.alaffut.springboot.services;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alaffut.springboot.dto.EvenementDto;
import fr.alaffut.springboot.repositories.EvenementRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EvenementServiceImpl implements EvenementService {
    
    
    @Autowired
    private ModelMapper mapper;
    
    private EvenementRepository eventRepo;

    @Override
    public List<EvenementDto> getAllEvents(Pageable page) {
      //  return eventRepo.findAll(page).get().map(p -> mapper.map(e, EvenementDto.class)).collect(Collectors.toList());  
        return null;
    }

}
