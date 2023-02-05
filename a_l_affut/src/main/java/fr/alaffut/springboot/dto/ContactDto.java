package fr.alaffut.springboot.dto;

public class ContactDto {
    private String contactFirstName;
    private String contactLastName;
    private String contactEmail;
    private String contactSubject;
    private String contactContent;

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactSubject() {
        return contactSubject;
    }

    public void setContactSubject(String contactSubject) {
        this.contactSubject = contactSubject;
    }

    public String getContactContent() {
        return contactContent;
    }

    public void setContactContent(String contactContent) {
        this.contactContent = contactContent;
    }
}
