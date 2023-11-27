package tn.esprit.twin.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.spring.entities.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {



    Chambre findByNumeroChambre(Long numeroChambre);

}
