package tn.esprit.twin.spring.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.spring.entities.Bloc;
import tn.esprit.twin.spring.entities.Universite;
import tn.esprit.twin.spring.repository.BlocRepository;
import tn.esprit.twin.spring.services.blocService;

import java.util.List;

@RestController
@RequestMapping("/b")
public class blocController {

    @Autowired
    blocService bs;

    @GetMapping("/getAllBlocs")
    public List<Bloc> retrieveAllBlocs() {
        return bs.retrieveAllBlocs() ;
    }

    @PostMapping("/add")
    public Bloc AddBloc(@RequestBody Bloc e) {
        return bs.AddBloc(e);
    }

    @PutMapping("edit")
    public Bloc EditBloc(@RequestBody Bloc e) {
        return bs.EditBloc(e);
    }

    @GetMapping("/{idBloc}")
    public Bloc RetrieveBloc(@PathVariable long idBloc) {
        return bs.RetrieveBloc(idBloc);
    }

    @DeleteMapping("/{idBloc}")
    public void removeBloc(@PathVariable long idUniversite) {
        bs.removeBloc(idUniversite);
    }


//    @PostMapping("/affecterChambresABloc")
//    public Bloc affecterChambresABloc(@RequestBody List<Long> numChambre, @RequestParam String nomBloc){
//        return bs.affecterChambresABloc(numChambre,nomBloc);
//    }


}
