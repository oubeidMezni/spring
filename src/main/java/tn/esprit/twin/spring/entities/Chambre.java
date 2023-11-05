package tn.esprit.twin.spring.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Chambre")
public class Chambre implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;

    @OneToMany
    List<Reservation> Reservations;

    @ManyToOne
    Bloc bloc;


}
