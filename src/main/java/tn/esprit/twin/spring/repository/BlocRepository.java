package tn.esprit.twin.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.spring.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc , Long> {

Bloc findByNomBloc(String nomBloc);
}
