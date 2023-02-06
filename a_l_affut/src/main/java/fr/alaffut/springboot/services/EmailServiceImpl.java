package fr.alaffut.springboot.services;

import fr.alaffut.springboot.dto.ContactDto;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailServiceImpl implements EmailService{
    private final Session session;

    public EmailServiceImpl() {
        this.session = getSession();
    }

    private Session getSession() {
        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("alaffut59@gmail.com", "yyhuhgohntqwngmi");
            }
        });

        session.setDebug(true);
        return session;
    }

    @Override
    public void sendValidationEmail(String destinationAddress) {

        String from = "alaffut59@gmail.com";

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinationAddress));
            message.setSubject("On se retrouve bientôt!");
            message.setText("Votre inscription a bien été prise en compte, à très bientôt");
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    @Override
    public void sendContactRequest(ContactDto contactDto) {
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(contactDto.getContactEmail()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("aurelie.pollet59@gmail.com"));
            message.setSubject(contactDto.getContactSubject() + " par " + contactDto.getContactFirstName() + " " + contactDto.getContactLastName() + " - " + contactDto.getContactEmail());
            message.setText(contactDto.getContactContent());
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
