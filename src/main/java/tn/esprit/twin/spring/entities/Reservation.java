package tn.esprit.twin.spring.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private long idReservation;

    @Temporal(TemporalType.DATE)
    private Date AnneeUniversitaire;

    private boolean isValid;

    @ManyToMany(mappedBy = "Reservations")
    List<Etudiant> Etudiants;

    public Reservation() {
    }

    public Reservation(Long idReservation, Date anneeUniversitaire, boolean isValid) {
        this.idReservation = idReservation;
        AnneeUniversitaire = anneeUniversitaire;
        this.isValid = isValid;
    }

    public Reservation(Date anneeUniversitaire, boolean isValid) {
        AnneeUniversitaire = anneeUniversitaire;
        this.isValid = isValid;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(long idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return AnneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        AnneeUniversitaire = anneeUniversitaire;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}