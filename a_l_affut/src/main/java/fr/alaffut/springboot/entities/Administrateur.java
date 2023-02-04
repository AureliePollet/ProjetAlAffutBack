package fr.alaffut.springboot.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="administrateurs")
public class Administrateur implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    

    @Column(length = 50, nullable=false)
    private String nom;
    

    @Column(length = 100, nullable=false)
    private String email;
    
    @Column(length = 50, nullable=false)
    private String password;

    public Administrateur() {
    }

    public Administrateur(long id, String nom, String email, String password) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.password = password;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

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
    
    

    @Override
    public String toString() {
        return "Administrateur [id=" + id + ", nom=" + nom + ", email=" + email + ", password="
                + password + "]";
    }
    
    
    
    
    
    
    
    

}
