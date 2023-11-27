package tn.esprit.twin.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Bloc;
import tn.esprit.twin.spring.entities.Chambre;
import tn.esprit.twin.spring.entities.TypeChambre;
import tn.esprit.twin.spring.repository.BlocRepository;
import tn.esprit.twin.spring.repository.ChambreRepository;

import java.util.List;
import java.util.Set;

@Service
public class ChambreService implements IChambreService{

    @Autowired
    ChambreRepository chambreRepository;
    @Autowired
    BlocRepository blocRepository;

    @Override
    public List<Chambre> retrieveAllChambers() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre updateChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }
    public Chambre retrieveChambreByNumero(Long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    public Set<Chambre> getChambresParNomBloc(String nomBloc) {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);

        return bloc.getChambres();
    }
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {

        Bloc bloc = blocRepository.findById(idBloc).get();

        long count = 0;
        for (Chambre chambre : bloc.getChambres()) {
            if (chambre.getTypeC() == type) {
                count++;
            }
        }

        return count;
    }
}