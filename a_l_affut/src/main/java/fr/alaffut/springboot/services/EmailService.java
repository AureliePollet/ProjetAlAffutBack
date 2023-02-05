package fr.alaffut.springboot.services;

import fr.alaffut.springboot.dto.ContactDto;

public interface EmailService {
    void sendValidationEmail(String destinationAddress);

    void sendContactRequest(ContactDto contactDto);
}
