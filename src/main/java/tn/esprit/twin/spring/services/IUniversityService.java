package tn.esprit.twin.spring.services;


import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Universite;

import java.util.List;

@Service
public interface IUniversityService {
    List<Universite> retrieveAllUniversite();
    Universite AddUniversite(Universite e);
    Universite EditUniversite(Universite e);
    Universite RetrieveUniversite(Long idUniversite);
    void removeUniversite(Long idUniversite);
    Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite);
    Universite desaffecterFoyerAUniversite (long idUniversite);

}
