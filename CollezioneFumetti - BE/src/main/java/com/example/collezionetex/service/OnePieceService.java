package com.example.collezionetex.service;

import com.example.collezionetex.model.OnePiece;
import java.util.List;


public interface OnePieceService {
    
    List<OnePiece> aggiungiOnePiece(OnePiece op);
    
    List<OnePiece> rimuoviOnePiece(OnePiece op);
    
    List<OnePiece> trovaTuttiOnePiece();
    
    List<OnePiece> trovaOnePieceByCriterio(int n, String s);
    
}
