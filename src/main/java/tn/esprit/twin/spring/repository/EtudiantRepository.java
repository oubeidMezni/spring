package tn.esprit.twin.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.spring.entities.Etudiant;

public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {

}
