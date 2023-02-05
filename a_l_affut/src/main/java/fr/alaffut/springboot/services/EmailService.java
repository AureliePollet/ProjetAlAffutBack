package fr.alaffut.springboot.services;

public interface EmailService {
    void sendValidationEmail(String destinationAddress);
}
