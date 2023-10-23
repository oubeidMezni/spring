package tn.esprit.twin.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Foyer;
import tn.esprit.twin.spring.repository.FoyerRepository;

import java.util.List;


@Service
public class foyerService implements IFoyerService {

    @Autowired
    FoyerRepository fr;
    @Override
    public List<Foyer> retrieveAllFoyer() {
        return fr.findAll();
    }

    @Override
    public Foyer AddFoyer(Foyer e) {
        return fr.save(e);
    }

    @Override
    public Foyer EditFoyer(Foyer e) {
        return fr.save(e);
    }

    @Override
    public Foyer RetrieveFoyer(Long idFoyer) {
        return fr.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
         fr.deleteById(idFoyer);
    }
}
