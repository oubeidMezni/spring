package tn.esprit.twin.spring.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable{
    @Id
    @Column(name="idReservation")
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date AnneeUniversitaire;

    private boolean isValid;

    @ManyToMany(mappedBy = "Reservations")
    List<Etudiant> Etudiants;





}