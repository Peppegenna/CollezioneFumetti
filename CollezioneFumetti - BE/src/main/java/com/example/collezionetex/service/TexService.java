package com.example.collezionetex.service;

import com.example.collezionetex.model.Tex;
import java.util.List;


public interface TexService {
   
    List<Tex> aggiungiTex(Tex t);
    
    List<Tex> rimuoviTex(Tex t);
    
    List<Tex> trovaTuttiTex();
    
    List<Tex> trovaTexByCriterio(String s, int n);
    
}
