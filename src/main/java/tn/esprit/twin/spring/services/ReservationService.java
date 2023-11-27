package tn.esprit.twin.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Reservation;
import tn.esprit.twin.spring.repository.ReservationRepository;

import java.util.Date;
import java.util.List;
import org.hibernate.query.Query;
@Service
public class ReservationService implements  IReservationService{

    @Autowired
    ReservationRepository reservationRespository;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRespository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation e) {
        return reservationRespository.save(e);
    }

    @Override
    public Reservation updateReservation(Reservation e) {
        return reservationRespository.save(e);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRespository.findById(idReservation).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRespository.deleteById(idReservation);

    }
    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin) {

        Query query = reservationRespository.createQuery(jpql);

        query.setParameter("dateDebut", dateDebut);
        query.setParameter("dateFin", dateFin);

        List<Reservation> reservations = query.getResultList();


        return reservations;
    }
}
