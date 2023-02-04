package fr.alaffut.springboot.controllers;

import java.util.List;
import java.util.Optional;

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

import fr.alaffut.springboot.dto.EtudiantDto;
import fr.alaffut.springboot.services.EtudiantService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    
    @Autowired
    private EtudiantService service;
    
    
    @PostMapping(value="/add", consumes="application/json", produces="application/json")
    public EtudiantDto ajoutEtudiant(@RequestBody EtudiantDto etudiantDto) { 
        return service.saveOrUpdate(etudiantDto);
    }
    

    @GetMapping(value="/all", produces="application/json")
    public List<EtudiantDto> getAllEtudiant(){
        return service.getAllEtudiant(Pageable.unpaged());
    }
    
    
    @PutMapping(value="/update/{id}", consumes="application/json", produces="application/json")
    public EtudiantDto updateEtudiant(@PathVariable long id,@RequestBody EtudiantDto etudiantDto) {
        etudiantDto.setId(id);
        return service.saveOrUpdate(etudiantDto);
    }
    

    @DeleteMapping(value="/delete/{id}", produces="text/plain")
    public ResponseEntity<String> deleteEtudiant( @PathVariable long id) {
        try {
            service.deleteEtudiant(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
       
    }
    
    @PostMapping(value="/login", consumes="application/json", produces="application/json")
    public ResponseEntity login(@RequestBody EtudiantDto etudiantDto) {
        Optional<EtudiantDto> stud =  service.login(etudiantDto);
        if (stud.isPresent()) {
            return new ResponseEntity<>(stud.get() ,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
 
}
