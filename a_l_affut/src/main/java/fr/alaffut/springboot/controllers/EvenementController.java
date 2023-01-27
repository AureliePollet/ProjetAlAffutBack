package fr.alaffut.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.alaffut.springboot.dto.EvenementDto;
import fr.alaffut.springboot.entities.Evenement;
import fr.alaffut.springboot.services.EvenementService;

@RestController
@RequestMapping("/api")
public class EvenementController {
    
    @Autowired
    private EvenementService service;
  
    
    @PostMapping(value="/evenement", consumes="application/json", produces="application/json")
    public EvenementDto ajoutEvenement(@RequestBody EvenementDto produitDto) { 
        return service.saveOrUpdate(produitDto);
    }

}
