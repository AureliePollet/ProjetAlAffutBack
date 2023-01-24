package fr.alaffut.springboot.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="evenements")
public class Evenement implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 250, nullable=false)
    private String nom;
    
    
    private LocalDate date;
    
    @Column(length = 250, nullable=false)
    private String adresse;
    
    @Column(nullable=false)
    private String descriptif;
    
    @Column(name="nb_places")
    private int nbPlaces;
    
    @Lob
    private byte [] image;
    
    @ManyToMany(mappedBy = "evenements")
    private List<Etudiant> etudiants=new ArrayList<>();

    public Evenement() {
    }

    public Evenement(long id, String nom, LocalDate date, String adresse, String descriptif, int nbPlaces) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.adresse = adresse;
        this.descriptif = descriptif;
        this.nbPlaces = nbPlaces;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    @Override
    public String toString() {
        return "Evenement [id=" + id + ", nom=" + nom + ", date=" + date + ", adresse=" + adresse + ", descriptif="
                + descriptif + ", nbPlaces=" + nbPlaces + "]";
    }
    
    
    
    
    
    
    
    

}
