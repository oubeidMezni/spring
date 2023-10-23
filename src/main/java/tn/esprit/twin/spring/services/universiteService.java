package tn.esprit.twin.spring.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Foyer;
import tn.esprit.twin.spring.entities.Universite;
import tn.esprit.twin.spring.repository.FoyerRepository;
import tn.esprit.twin.spring.repository.UniversiteRepository;

import java.util.List;

@Service
public class universiteService implements IUniversityService{

    @Autowired
    UniversiteRepository ur;
    @Autowired
    FoyerRepository fr;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return ur.findAll();
    }

    @Override
    public Universite AddUniversite(Universite e) {
        return ur.save(e);
    }

    @Override
    public Universite EditUniversite(Universite e) {
        return  ur.save(e);
    }

    @Override
    public Universite RetrieveUniversite(Long idUniversite) {
        return ur.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        ur.deleteById(idUniversite);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite uni = ur.findByNomUniversite(nomUniversite);
        Foyer foyer = fr.findById(idFoyer).get();
        uni.setFoyer(foyer);
       return ur.save(uni);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite uni = ur.findById(idUniversite).get();
        uni.setFoyer(null);
        return ur.save(uni);
    }

}
