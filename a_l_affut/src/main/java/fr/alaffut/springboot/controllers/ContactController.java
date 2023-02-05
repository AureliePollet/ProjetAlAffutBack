package fr.alaffut.springboot.controllers;

import fr.alaffut.springboot.dto.ContactDto;
import fr.alaffut.springboot.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {
    @Autowired
    private EmailService emailService;

    @PostMapping(value = "/request", produces = "application/json")
    public ResponseEntity demandeContact(@RequestBody ContactDto contactDto) {
        emailService.sendContactRequest(contactDto);
        return ResponseEntity.ok().build();
    }
}
