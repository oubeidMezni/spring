package tn.esprit.twin.spring.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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