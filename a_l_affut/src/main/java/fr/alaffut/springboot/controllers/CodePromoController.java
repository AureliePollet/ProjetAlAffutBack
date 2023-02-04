package fr.alaffut.springboot.controllers;

import java.time.LocalDate;
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

import fr.alaffut.springboot.dto.CodePromoDto;
import fr.alaffut.springboot.services.CodePromoService;

@RestController
@RequestMapping("/codepromo")
@CrossOrigin(origins = "http://localhost:3000")
public class CodePromoController {
    
    @Autowired
    CodePromoService service;
    

    @PostMapping(value="/add", consumes="application/json", produces="application/json")
    public CodePromoDto ajoutCodePromo(@RequestBody CodePromoDto codePromoDto) { 
        return service.saveOrUpdate(codePromoDto);
    }
    

    @GetMapping(value="/all", produces="application/json")
    public List<CodePromoDto> getAllCodePromo(){
        return service.getAllCodePromo(Pageable.unpaged());
    }
    
    @PutMapping(value="/update/{id}", consumes="application/json", produces="application/json")
    public CodePromoDto updateCodePromo(@PathVariable long id,@RequestBody CodePromoDto codePromoDto) {
        codePromoDto.setId(id);
        return service.saveOrUpdate(codePromoDto);
    }
    

    @DeleteMapping(value="/delete/{id}", produces="text/plain")
    public ResponseEntity<String> deleteCodePromo( @PathVariable long id) {
        try {
            service.deleteCodePromo(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
       
    }
    

    

}
