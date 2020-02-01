import { Component, OnInit } from '@angular/core';
import { Onepiece } from './onepiece';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-onepiece',
  templateUrl: './onepiece.component.html',
  styleUrls: ['./onepiece.component.css']
})
export class OnepieceComponent implements OnInit {

  listaOnepiece: Onepiece[] = [];
  onepiece: Onepiece = new Onepiece();
  testoRicerca: string;
  testoRicercaPerNumero: number;

  constructor(private http: HttpClient) {
    
  }

  ngOnInit() {
  }

  aggiungi(){
    this.http.post<Onepiece[]>("http://localhost:8080/aggiungi-onepiece", this.onepiece)
    .subscribe(r => {
      this.listaOnepiece = r;
    })
  }

  elimina(){
    this.http.post<Onepiece[]>("http://localhost:8080/rimuovi-onepiece", this.onepiece)
    .subscribe(r => {
      this.listaOnepiece = r;
    });
  }

  cerca(){
    this.http.post<Onepiece[]>("http://localhost:8080/cerca-onepiece", {criterio: this.testoRicerca} )
    .subscribe(r => {
      this.listaOnepiece = r;
    });
  }

  trovaTuttiOnePiece(){
    this.http.post<Onepiece[]>("http://localhost:8080/trova-tutti-onepiece", this.onepiece)
    .subscribe(r => {
      this.listaOnepiece = r;
    });
  }

  seleziona(o : Onepiece){
    this.onepiece = o;
  }
}
