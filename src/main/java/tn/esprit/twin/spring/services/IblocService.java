package tn.esprit.twin.spring.services;


import org.springframework.stereotype.Service;
import tn.esprit.twin.spring.entities.Bloc;

import java.util.List;

@Service
public interface IblocService {

    List<Bloc> retrieveAllBlocs();
    Bloc AddBloc(Bloc b);
    Bloc EditBloc(Bloc b);
    Bloc RetrieveBloc(Long idBloc);
    void removeBloc(Long idBloc);
//    public Bloc affecterChambresABloc (List<Long> numChambre, String nomBloc) ;
}
