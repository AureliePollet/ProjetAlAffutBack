package fr.alaffut.springboot.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import fr.alaffut.springboot.entities.Etudiant;

public class EvenementDto {
    
    private int version;

    private long id;
    
    private String nom;
    
    private LocalDate date;
    
    private String adresse;
    
    private String descriptif;
    
    private int nbPlaces;
    
    private byte [] image;
    
    //@JsonManagedReference
    private List<EtudiantDto> etudiants= new ArrayList<>();

    

    public List<EtudiantDto> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<EtudiantDto> etudiants) {
        this.etudiants = etudiants;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    


    @Override
    public String toString() {
        return "EvenementDto [id=" + id + ", nom=" + nom + ", date=" + date + ", adresse=" + adresse + ", descriptif="
                + descriptif + ", nbPlaces=" + nbPlaces + "]";
    }
    
    

}
