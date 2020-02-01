package com.example.collezionetex.controller;

import com.example.collezionetex.dto.RicercaDto;
import com.example.collezionetex.model.RatMan;
import com.example.collezionetex.service.RatManService;
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
public class RatManController {
    
    @Autowired
    RatManService ratManService;
    
    @RequestMapping(value = {"/aggiungi-ratman", "/modifica-ratman"})
    @ResponseBody
    List<RatMan> confermaAggiungi(@RequestBody RatMan rm) {
        System.out.println("TEX AGGIUNTO " + rm);
        return ratManService.aggiungiRatMan(rm);
    }
    
    @RequestMapping(value = {"/rimuovi-ratman"})
    @ResponseBody
    List<RatMan> confermaRimuovi(@RequestBody RatMan rm) {
        System.out.println("TEX ELIMINATO " + rm);
        return ratManService.rimuoviRatMan(rm);
    }
    
    @RequestMapping(value = {"/trova-tutti-ratman"})
    @ResponseBody
    List<RatMan> trovaTuttiRatMan() {
        System.out.println("TROVATI TUTTI");
        return ratManService.trovaTuttiRatMan();
    }
    
    @RequestMapping(value = {"/cerca-ratman"})
    @ResponseBody
    List<RatMan> cercaRatMan(@RequestBody RicercaDto dto) {
        if (dto != null) {
            System.out.println("Dto corretto, eseguo ricerca con criterio " + dto.getCriterio() + dto.getCriterioNum());
            return ratManService.trovaRatManByCriterio(dto.getCriterio(), dto.getCriterioNum());
        } else {
            System.out.println("Ricevuto dto null in cercaRatman");
            return new ArrayList<>();
        }
    }
    
}
