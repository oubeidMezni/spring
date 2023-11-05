package tn.esprit.twin.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Bloc;
import tn.esprit.twin.spring.entities.Chambre;
import tn.esprit.twin.spring.repository.BlocRepository;
import tn.esprit.twin.spring.repository.ChambreRepository;

import java.util.List;

@Service
public class blocService implements IblocService{

    @Autowired
    BlocRepository br;
    @Autowired
    ChambreRepository cr;
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return br.findAll();
    }

    @Override
    public Bloc AddBloc(Bloc b) {
        return br.save(b);
    }

    @Override
    public Bloc EditBloc(Bloc b) {
        return br.save(b);
    }

    @Override
    public Bloc RetrieveBloc(Long idBloc) {
        return br.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        br.deleteById(idBloc);
    }

//    @Override
//    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
//        Bloc bloc = br.findBlocByNomBloc(nomBloc);
//        for (Long numCham : numChambre) {
//            Chambre chambre = cr.findByNumChambre(numChambre);
//            chambre.setBloc(bloc);
//            cr.save(chambre);
//        }
//        return bloc;
//    }
}
