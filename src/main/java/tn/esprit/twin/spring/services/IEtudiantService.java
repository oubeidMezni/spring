package tn.esprit.twin.spring.services;

import tn.esprit.twin.spring.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiant();
    Etudiant AddEtudiant(Etudiant e);
    Etudiant EditEtudiant(Etudiant e);
    Etudiant RetrieveEtudiant(Long IdEtudiant);
    void removeEtudiant(Long idEtudiant);
}
