package tn.esprit.twin.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.spring.entities.Etudiant;
import tn.esprit.twin.spring.entities.Foyer;
import tn.esprit.twin.spring.repository.FoyerRepository;
import tn.esprit.twin.spring.services.IFoyerService;
import tn.esprit.twin.spring.services.foyerService;

import java.util.List;


@RestController
@RequestMapping("/f")
public class foyerController {

    @Autowired
    private foyerService fs;

    @GetMapping("/getAllFoyers")
    public List<Foyer> retrieveAllFoyer() {
        return fs.retrieveAllFoyer() ;
    }
    @PostMapping("/add")
    public Foyer AddFoyer(@RequestBody Foyer f){
      return fs.AddFoyer(f);
    }

    @PutMapping("/edit")
    public Foyer EditFoyer(@RequestBody Foyer f){
        return fs.EditFoyer(f);
    }
    @GetMapping("/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer){
        return fs.RetrieveFoyer(idFoyer);
    }
    @DeleteMapping("/{idFoyer}")
    public void removeFoyer(@PathVariable long idFoyer){
        fs.removeFoyer(idFoyer);
    }
}
