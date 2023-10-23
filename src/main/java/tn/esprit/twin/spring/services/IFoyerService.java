package tn.esprit.twin.spring.services;


import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Foyer;

import java.util.List;

@Service
public interface IFoyerService {

    List<Foyer> retrieveAllFoyer();
    Foyer AddFoyer(Foyer e);
    Foyer EditFoyer(Foyer e);
    Foyer RetrieveFoyer(Long idFoyer );
    void removeFoyer(Long idFoyer);
}
