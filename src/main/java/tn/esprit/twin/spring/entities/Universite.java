package tn.esprit.twin.spring.entities;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite;
    private String nomUniversite;
    private String addresse;

    @OneToOne
    Foyer foyer;

    public Universite() {
    }

    public Universite(Long idUniversite, String nomUniversite, String addresse) {
        this.idUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        this.addresse = addresse;
    }

    public Universite(String nomUniversite, String addresse) {
        this.nomUniversite = nomUniversite;
        this.addresse = addresse;
    }

    public Long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversité) {
        this.nomUniversite = nomUniversité;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
}
