package com.example.collezionetex.service;

import com.example.collezionetex.model.RatMan;
import java.util.List;


public interface RatManService {
    
    List<RatMan> aggiungiRatMan(RatMan rm);
    
    List<RatMan> rimuoviRatMan(RatMan rm);
    
    List<RatMan> trovaTuttiRatMan();
    
    List<RatMan> trovaRatManByCriterio(String s, int n);
    
}
