package tn.esprit.twin.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Etudiant;
import tn.esprit.twin.spring.repository.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
     return etudiantRepository.findAll();

    }

    @Override
    public Etudiant AddEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant EditEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant RetrieveEtudiant(Long IdEtudiant) {
        return etudiantRepository.findById(IdEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

}
