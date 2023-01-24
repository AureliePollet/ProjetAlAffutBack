package fr.alaffut.springboot.dto;

public class TypeCodeDto {
    
    public long id;
    
    public String nom;

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

    @Override
    public String toString() {
        return "TypeCodeDto [id=" + id + ", nom=" + nom + "]";
    }
    

}
