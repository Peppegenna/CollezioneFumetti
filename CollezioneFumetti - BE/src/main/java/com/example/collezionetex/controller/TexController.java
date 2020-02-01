package com.example.collezionetex.controller;

import com.example.collezionetex.dto.RicercaDto;
import com.example.collezionetex.model.Tex;
import com.example.collezionetex.service.TexService;
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
public class TexController {
    
    @Autowired
    TexService texService;
    
    @RequestMapping(value = {"/aggiungi-tex", "/modifica-tex"})
    @ResponseBody
    List<Tex> confermaAggiungi(@RequestBody Tex t) {
        System.out.println("TEX AGGIUNTO " + t);
        return texService.aggiungiTex(t);
    }
    
    @RequestMapping(value = {"/rimuovi-tex"})
    @ResponseBody
    List<Tex> confermaRimuovi(@RequestBody Tex t) {
        System.out.println("TEX ELIMINATO " + t);
        return texService.rimuoviTex(t);
    }
    
    @RequestMapping(value = {"/trova-tutti-tex"})
    @ResponseBody
    List<Tex> trovaTuttiTex() {
        System.out.println("TROVATI TUTTI");
        return texService.trovaTuttiTex();
    }
    
    @RequestMapping(value = {"/cerca-tex"})
    @ResponseBody
    List<Tex> cercaTex(@RequestBody RicercaDto dto) {
        if (dto != null) {
            System.out.println("Dto corretto, eseguo ricerca con criterio " + dto.getCriterio() + dto.getCriterioNum());
            return texService.trovaTexByCriterio(dto.getCriterio(), dto.getCriterioNum());
        } else {
            System.out.println("Ricevuto dto null in cercaTex");
            return new ArrayList<>();
        }
    }
    
}
