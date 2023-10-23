package tn.esprit.twin.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.spring.entities.Etudiant;
import tn.esprit.twin.spring.services.EtudiantService;

import java.util.List;


@RestController
@RequestMapping("/e")
public class studentController {

@Autowired
    private EtudiantService etudiantService;

    @GetMapping("/getAllStudents")
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantService.retrieveAllEtudiant() ;
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.AddEtudiant(etudiant);
    }

    @PutMapping("edit")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.EditEtudiant(etudiant);
    }

    @GetMapping("/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant) {
        return etudiantService.RetrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/{idEtudiant}")
    public void removeEtudiant(@PathVariable long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
}
