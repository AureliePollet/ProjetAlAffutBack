package fr.alaffut.springboot.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.alaffut.springboot.enums.Civilite;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="etudiants")
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Enumerated(EnumType.STRING)
    private Civilite civilite;
    
    @Column(length = 50, nullable=false)
    private String nom;
    
    @Column(length = 50, nullable=false)
    private String prenom;
    
    @Column(nullable=false, name="date_naissance")
    private LocalDate dateNaissance;
    
    @Column(length = 250, nullable=false)
    private String email;
    
    @Column(length = 30, nullable=false)
    private String password;
    
    @Column(length = 250, nullable=false, name="etablissement_scolaire")
    private String etablissementScolaire;
    
    @ManyToMany
    private List<Evenement> evenements=new ArrayList<>();


    public Etudiant() {
    }

    public Etudiant(long id, Civilite civilite, String nom, String prenom, LocalDate dateNaissance, String email,
            String password, String etablissementScolaire) {
        super();
        this.id = id;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.password = password;
        this.etablissementScolaire = etablissementScolaire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
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

    public String getEtablissementScolaire() {
        return etablissementScolaire;
    }

    public void setEtablissementScolaire(String etablissementScolaire) {
        this.etablissementScolaire = etablissementScolaire;
    }
    
    

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }

    @Override
    public String toString() {
        return "Etudiant [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom
                + ", dateNaissance=" + dateNaissance + ", email=" + email + ", password=" + password
                + ", etablissementScolaire=" + etablissementScolaire + "]";
    }
    
    
    
    
    
    

}
