package fr.alaffut.springboot.dto;

import java.util.Arrays;

public class CommerceDto {
    
    private long id;
    
    private String nom;
    
    private String adresse;
    
    private int codePostal;
    
    private String ville;
    
    private String url;
    
    private byte[] image;
    
    private String descriptif;

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    @Override
    public String toString() {
        return "CommerceDto [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", codePostal=" + codePostal
                + ", ville=" + ville + ", url=" + url + ", descriptif="
                + descriptif + "]";
    }
    
    

}
