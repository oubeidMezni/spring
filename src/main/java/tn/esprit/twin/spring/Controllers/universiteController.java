package tn.esprit.twin.spring.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.spring.entities.Universite;
import tn.esprit.twin.spring.services.universiteService;

import java.util.List;

@RestController
@RequestMapping("/u")
public class universiteController {

    @Autowired
    private universiteService us;

    @GetMapping("/getAllUni")
    public List<Universite> retrieveAllUniversite() {
        return us.retrieveAllUniversite() ;
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite e) {
        return us.AddUniversite(e);
    }

    @PutMapping("edit")
    public Universite updateUniversite(@RequestBody Universite e) {
        return us.EditUniversite(e);
    }

    @GetMapping("/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return us.RetrieveUniversite(idUniversite);
    }

    @DeleteMapping("/{idUniversite}")
    public void removeUniversite(@PathVariable long idUniversite) {
        us.removeUniversite(idUniversite);
    }

    @PostMapping("/affecterFoyer")
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite){
        return us.affecterFoyerAUniversite(idFoyer,nomUniversite);
    }

    @PostMapping("/desaffecterFoyer")
    public Universite desaffecterFoyerAUniversite (long idUniversite){
        return us.affecterFoyerAUniversite(idUniversite,"esprit");
    }
}
