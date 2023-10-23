package tn.esprit.twin.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.spring.entities.Universite;

public interface UniversiteRepository extends JpaRepository <Universite, Long> {
}
