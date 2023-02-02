package fr.alaffut.springboot.dto;

public class TypeCodeDto {
    
    private int version;
    
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
    

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "TypeCodeDto [id=" + id + ", nom=" + nom + "]";
    }
    

}
