package fr.alaffut.springboot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="type_code")
public class TypeCode implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 50, nullable=false)
    private String nom;
    
    @OneToMany(mappedBy = "typeCode")
    private List<CodePromo> codesPromos=new ArrayList<>();

    public TypeCode() {
    }

    public TypeCode(long id, String nom) {
        this.id = id;
        this.nom = nom;
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

    
    public List<CodePromo> getCodesPromos() {
        return codesPromos;
    }

    public void setCodesPromos(List<CodePromo> codesPromos) {
        this.codesPromos = codesPromos;
    }

    @Override
    public String toString() {
        return "TypeCode [id=" + id + ", nom=" + nom + "]";
    }
    
    
    
    
    

}
