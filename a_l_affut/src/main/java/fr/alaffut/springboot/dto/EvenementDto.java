package fr.alaffut.springboot.dto;

import java.time.LocalDate;

public class EvenementDto {
    
    private int version;

    private long id;
    
    private String nom;
    
    private LocalDate date;
    
    private String adresse;
    
    private String descriptif;
    
    private int nbPlaces;
    
    private byte [] image;

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
