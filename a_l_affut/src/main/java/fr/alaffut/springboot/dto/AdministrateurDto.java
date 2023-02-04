package fr.alaffut.springboot.dto;

public class AdministrateurDto {
    
    private int version;
    private long id;
    private String nom;

    private String email;
    private String password;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }
    @Override
    public String toString() {
        return "AdministrateurDto [id=" + id + ", nom=" + nom + ", email=" + email
                + ", password=" + password + "]";
    }
    
    

}
