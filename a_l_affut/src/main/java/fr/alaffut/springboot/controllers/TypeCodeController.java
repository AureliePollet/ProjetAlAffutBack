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

import fr.alaffut.springboot.dto.TypeCodeDto;
import fr.alaffut.springboot.services.TypeCodeService;

@RestController
@RequestMapping("/typecode")
@CrossOrigin(origins = "http://localhost:3000")
public class TypeCodeController {
    
    @Autowired
    private TypeCodeService service;
    
    @PostMapping(value="/add", consumes="application/json", produces="application/json")
    public TypeCodeDto ajoutEvenement(@RequestBody TypeCodeDto typeCodeDto) { 
      return service.saveOrUpdate(typeCodeDto);
  }
    

    @GetMapping(value="/all", produces="application/json")
    public List<TypeCodeDto> getAllTypeCode(){
        return service.getAllTypeCode(Pageable.unpaged());
    }
    
    @PutMapping(value="/update/{id}", consumes="application/json", produces="application/json")
    public TypeCodeDto updateCode(@PathVariable long id,@RequestBody TypeCodeDto typeCodeDto) {
        typeCodeDto.setId(id);
        return service.saveOrUpdate(typeCodeDto);
    }
    

    @DeleteMapping(value="/delete/{id}", produces="text/plain")
    public ResponseEntity<String> deleteCode( @PathVariable long id) {
        try {
            service.deleteTypeCode(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
       
    }
    


}
