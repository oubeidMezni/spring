package tn.esprit.twin.spring.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
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

    public Chambre() {
    }

    public Chambre(Long idChambre, TypeChambre typeC) {
        this.idChambre = idChambre;
        TypeC = typeC;
    }

    public Chambre(TypeChambre typeC) {
        TypeC = typeC;
    }

    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public TypeChambre getTypeC() {
        return TypeC;
    }

    public void setTypeC(TypeChambre typeC) {
        TypeC = typeC;
    }

    public List<Reservation> getReservations() {
        return Reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        Reservations = reservations;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }
}
