package com.example.collezionetex.service.impl;

import com.example.collezionetex.model.RatMan;
import com.example.collezionetex.repository.RatManRepository;
import com.example.collezionetex.service.RatManService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatManServiceImpl implements RatManService {
    
    @Autowired
    RatManRepository ratManRepository;

    @Override
    public List<RatMan> aggiungiRatMan(RatMan rm) {
        rm = ratManRepository.save(rm);
        System.out.println("AGGIUNGI RAT MAN " + rm);
        List<RatMan> tuaVariabile = ratManRepository.findAll();
        Collections.sort(tuaVariabile);
        return tuaVariabile;
    }

    @Override
    public List<RatMan> rimuoviRatMan(RatMan rm) {
        ratManRepository.delete(rm);
        return ratManRepository.findAll();
    }

    @Override
    public List<RatMan> trovaTuttiRatMan() {
        return ratManRepository.findAll();
    }

    @Override
    public List<RatMan> trovaRatManByCriterio(String s, int n) {
        s = "%" + s + "%";
        n = n;
        return ratManRepository.findByNumeroLikeOrTitoloLike(n, s);
    }

}
