package fr.alaffut.springboot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.alaffut.springboot.enums.CategorieCommerce;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="commerces")
public class Commerce implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Version
	private int version;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 50, nullable=false)
	private String nom;

	@Column(length = 50)
	private String adresse;
	
	@Column(name="code_postal")
	private int codePostal;
	
	@Column(length = 70)
	private String ville;
	
    private String url;

    @Column(name="url_image")
    private String urlImage;
	
    @Column(nullable=false, length=2500)
	private String descriptif;
    
    @Enumerated(EnumType.STRING)
    private CategorieCommerce categorie;
    
    @OneToMany(mappedBy = "commerce")
    private List<CodePromo> codesPromos=new ArrayList<>();
    
	
	   public Commerce() {
	    }



    public Commerce(long id, String nom, String adresse, int codePostal, String ville, String url, String urlImage,
            String descriptif, CategorieCommerce categorie) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.url = url;
        this.urlImage = urlImage;
        this.descriptif = descriptif;
        this.categorie = categorie;

    }

    


    public String getUrlImage() {
        return urlImage;
    }



    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }



    public CategorieCommerce getCategorie() {
        return categorie;
    }



    public void setCategorie(CategorieCommerce categorie) {
        this.categorie = categorie;
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


    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
    
    

    public List<CodePromo> getCodesPromos() {
        return codesPromos;
    }

    public void setCodesPromos(List<CodePromo> codesPromos) {
        this.codesPromos = codesPromos;
    }


    @Override
    public String toString() {
        return "Commerce [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", codePostal=" + codePostal
                + ", ville=" + ville + ", url=" + url +  ", descriptif="
                + descriptif + ", categorie=" + categorie + ", codesPromos=" + codesPromos + "]";
    }



    
	   
	
	
}
