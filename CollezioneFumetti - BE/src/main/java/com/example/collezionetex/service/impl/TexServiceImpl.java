package com.example.collezionetex.service.impl;

import com.example.collezionetex.model.Tex;
import com.example.collezionetex.repository.TexRepository;
import com.example.collezionetex.service.TexService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TexServiceImpl implements TexService {
    
    @Autowired
    TexRepository texRepository;

    @Override
    public List<Tex> aggiungiTex(Tex t) {
        t = texRepository.save(t);
        System.out.println("AGGIUNGI TEX " + t);
        List<Tex> tuaVariabile = texRepository.findAll();
        Collections.sort(tuaVariabile);
        return tuaVariabile;
    }

    @Override
    public List<Tex> rimuoviTex(Tex t) {
        texRepository.delete(t);
        System.out.println("ELIMINA TEX " + t);
        return texRepository.findAll();
    }

    @Override
    public List<Tex> trovaTuttiTex() {
        return texRepository.findAll();
    }

    @Override
    public List<Tex> trovaTexByCriterio(String s, int n) {
        s = "%" + s + "%";
        n = n;
        return texRepository.findByNumeroLikeOrTitoloLike(n, s);
    }
    
}
