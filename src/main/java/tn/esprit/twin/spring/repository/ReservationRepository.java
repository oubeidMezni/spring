package tn.esprit.twin.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.twin.spring.entities.Reservation;

import java.util.Date;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    Reservation findByAnneeUniversitaire(Date AnneeUniversitaire);
}

