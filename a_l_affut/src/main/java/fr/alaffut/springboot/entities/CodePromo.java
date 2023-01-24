package fr.alaffut.springboot.entities;

import java.io.Serializable;
import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="codes_promo")
public class CodePromo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 50, nullable=false)
    private String nom;
    
    private LocalDate dateDebut;
    
    private LocalDate datefin;
    
    @ManyToOne
    private Commerce commerce;
    
    @ManyToOne
    private TypeCode typeCode;

    public CodePromo() {
    }

    public CodePromo(long id, String nom, LocalDate dateDebut, LocalDate datefin) {
        this.id = id;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.datefin = datefin;
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

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDatefin() {
        return datefin;
    }

    public void setDatefin(LocalDate datefin) {
        this.datefin = datefin;
    }
    
    
    
    public Commerce getCommerce() {
        return commerce;
    }

    public void setCommerce(Commerce commerce) {
        this.commerce = commerce;
    }

    public TypeCode getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(TypeCode typeCode) {
        this.typeCode = typeCode;
    }

    @Override
    public String toString() {
        return "CodePromo [id=" + id + ", nom=" + nom + ", dateDebut=" + dateDebut + ", datefin=" + datefin + "]";
    }
    
    

}
