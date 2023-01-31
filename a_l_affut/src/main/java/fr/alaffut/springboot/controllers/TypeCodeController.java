package fr.alaffut.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.alaffut.springboot.dto.TypeCodeDto;
import fr.alaffut.springboot.services.TypeCodeService;

@RestController
@RequestMapping("/typecode")
public class TypeCodeController {
    
    @Autowired
    private TypeCodeService service;
    
    @PostMapping(value="/add", consumes="application/json", produces="application/json")
    public TypeCodeDto ajoutEvenement(@RequestBody TypeCodeDto typeCodeDto) { 
      return service.saveOrUpdate(typeCodeDto);
  }
    
    
//
//@RestController
//@RequestMapping("/event")
//public class EvenementController {
//    
//    @Autowired
//    private EvenementService service;
//  
//    
//    @PostMapping(value="/add", consumes="application/json", produces="application/json")
//    public EvenementDto ajoutEvenement(@RequestBody EvenementDto evenementDto) { 
//        return service.saveOrUpdate(evenementDto);
//    }
//    
//
//    @GetMapping(value="/all", produces="application/json")
//    public List<EvenementDto> getAllEvents(){
//        return service.getAllEvents(Pageable.unpaged());
//    }
//    
//    @PutMapping(value="/update/{id}", consumes="application/json", produces="application/json")
//    public EvenementDto updateEvent(@PathVariable long id,@RequestBody EvenementDto evenementDto) {
//        evenementDto.setId(id);
//        return service.saveOrUpdate(evenementDto);
//    }
//    
//
//    @DeleteMapping(value="/delete/{id}", produces="text/plain")
//    public ResponseEntity<String> deleteEvent( @PathVariable long id) {
//        try {
//            service.deleteEvent(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//       
//    }

}
