import { Component, OnInit } from '@angular/core';
import { Tex } from './tex';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-tex',
  templateUrl: './tex.component.html',
  styleUrls: ['./tex.component.css']
})
export class TexComponent implements OnInit {

  listaTex: Tex[] = [];
  tex: Tex = new Tex();
  testoRicercaPerTitolo: string;
  testoRicercaPerNumero: number;

  constructor(private http: HttpClient) {
    
  }

  ngOnInit() {
  }

  aggiungi(){
    this.http.post<Tex[]>("http://localhost:8080/aggiungi-tex", this.tex)
    .subscribe(r => {
      this.listaTex = r;
    })
  }

  elimina(){
    this.http.post<Tex[]>("http://localhost:8080/rimuovi-tex", this.tex)
    .subscribe(r => {
      this.listaTex = r;
    });
  }

  cerca(){
    this.http.post<Tex[]>("http://localhost:8080/cerca-tex", {criterio: this.testoRicercaPerTitolo})
    .subscribe(r => {
      this.listaTex = r;
    });
  }

  trovaTuttiTex(){
    this.http.post<Tex[]>("http://localhost:8080/trova-tutti-tex", this.tex)
    .subscribe(r => {
      this.listaTex = r;
    });
  }

  seleziona(t : Tex){
    this.tex = t;
  }
}
