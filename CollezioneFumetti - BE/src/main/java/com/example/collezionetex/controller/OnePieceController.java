package com.example.collezionetex.controller;

import com.example.collezionetex.dto.RicercaDto;
import com.example.collezionetex.model.OnePiece;
import com.example.collezionetex.service.OnePieceService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class OnePieceController {
    
    @Autowired
    OnePieceService onePieceService;
    
    @RequestMapping(value = {"/aggiungi-onepiece", "/modifica-onepiece"})
    @ResponseBody
    List<OnePiece> confermaAggiungi(@RequestBody OnePiece op) {
        System.out.println("ONE PIECE AGGIUNTO " + op);
        return onePieceService.aggiungiOnePiece(op);
    }
    
    @RequestMapping(value = {"/rimuovi-onepiece"})
    @ResponseBody
    List<OnePiece> confermaRimuovi(@RequestBody OnePiece op) {
        System.out.println("ONE PIECE ELIMINATO " + op);
        return onePieceService.rimuoviOnePiece(op);
    }
    
    @RequestMapping(value = {"/trova-tutti-onepiece"})
    @ResponseBody
    List<OnePiece> trovaTuttiOnePiece() {
        System.out.println("TROVATI TUTTI");
        return onePieceService.trovaTuttiOnePiece();
    }
    
    @RequestMapping(value = {"/cerca-onepiece"})
    @ResponseBody
    List<OnePiece> cercaOnePiece(@RequestBody RicercaDto dto) {
        if (dto != null) {
            System.out.println("Dto corretto, eseguo ricerca con criterio " + dto.getCriterio());
            return onePieceService.trovaOnePieceByCriterio(dto.getCriterioNum(), dto.getCriterio());
        } else {
            System.out.println("Ricevuto dto null in cercaTex");
            return new ArrayList<>();
        }
    }
    
}
