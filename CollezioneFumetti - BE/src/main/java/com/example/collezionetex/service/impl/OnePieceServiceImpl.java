package com.example.collezionetex.service.impl;

import com.example.collezionetex.model.OnePiece;
import com.example.collezionetex.repository.OnePieceRepository;
import com.example.collezionetex.service.OnePieceService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnePieceServiceImpl implements OnePieceService {
    
    @Autowired
    OnePieceRepository onePieceRepository;

    @Override
    public List<OnePiece> aggiungiOnePiece(OnePiece op) {
        op = onePieceRepository.save(op);
        System.out.println("AGGIUNGI ONE PIECE " + op);
        List<OnePiece> tuaVariabile = onePieceRepository.findAll();
        Collections.sort(tuaVariabile);
        return tuaVariabile;
    }

    @Override
    public List<OnePiece> rimuoviOnePiece(OnePiece op) {
        onePieceRepository.delete(op);
        return onePieceRepository.findAll();
    }

    @Override
    public List<OnePiece> trovaTuttiOnePiece() {
        return onePieceRepository.findAll();
    }

    @Override
    public List<OnePiece> trovaOnePieceByCriterio(int n, String s) {
        n = n;
        s = "%" + s + "%";
        return onePieceRepository.findByNumeroLikeOrTitoloLike(n, s);
    }
    
}
