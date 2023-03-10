package fr.alaffut.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.alaffut.springboot.dto.AdministrateurDto;
import fr.alaffut.springboot.services.AdministrateurService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdministrateurController {
    
    
    @Autowired
    private AdministrateurService service;
    
    
    @PostMapping(value="/add", consumes="application/json", produces="application/json")
    public AdministrateurDto ajoutAdministrateur(@RequestBody AdministrateurDto administrateurDto) { 
        return service.saveOrUpdate(administrateurDto);
    }
    

    
    
    @PutMapping(value="/update/{id}", consumes="application/json", produces="application/json")
    public AdministrateurDto updateAdministrateur(@PathVariable long id,@RequestBody AdministrateurDto administrateurDto) {
        administrateurDto.setId(id);
        return service.saveOrUpdate(administrateurDto);
    }
    

    @DeleteMapping(value="/delete/{id}", produces="text/plain")
    public ResponseEntity<String> deleteAdministrateur( @PathVariable long id) {
        try {
            service.deleteAdministrateur(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
       
    }

    

}
