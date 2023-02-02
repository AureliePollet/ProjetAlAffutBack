package fr.alaffut.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.alaffut.springboot.dto.CommerceDto;
import fr.alaffut.springboot.services.CommerceService;

@RestController
@RequestMapping("/commerce")
public class CommerceController {
    
    @Autowired
    private CommerceService service;
    

    @PostMapping(value="/add", consumes="application/json", produces="application/json")
    public CommerceDto ajoutCommerce(@RequestBody CommerceDto commerceDto) { 
        return service.saveOrUpdate(commerceDto);
    }
    

    @GetMapping(value="/all", produces="application/json")
    public List<CommerceDto> getAllCommerce(){
        return service.getAllCommerce(Pageable.unpaged());
    }
    
    @PutMapping(value="/update/{id}", consumes="application/json", produces="application/json")
    public CommerceDto updateCommerce(@PathVariable long id,@RequestBody CommerceDto commerceDto) {
        commerceDto.setId(id);
        return service.saveOrUpdate(commerceDto);
    }
    

    @DeleteMapping(value="/delete/{id}", produces="text/plain")
    public ResponseEntity<String> deleteCommerce( @PathVariable long id) {
        try {
            service.deleteCommerce(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
       
    }
    
    @GetMapping(value="/filtre/{nom}", produces="application/json")
    public List<CommerceDto> getCommerceBytypeCode(@PathVariable String nom){
        return service.getCommerceByTypeCode(nom);
    }
    
    
    

}
