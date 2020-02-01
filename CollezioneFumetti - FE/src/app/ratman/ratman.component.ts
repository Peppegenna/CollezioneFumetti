import { Component, OnInit } from '@angular/core';
import { Ratman } from './ratman';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ratman',
  templateUrl: './ratman.component.html',
  styleUrls: ['./ratman.component.css']
})
export class RatmanComponent implements OnInit {

  listaRatman: Ratman[] = [];
  ratman: Ratman = new Ratman();
  testoRicerca: string;

  constructor(private http: HttpClient) {
    
  }

  ngOnInit() {
  }

  aggiungi(){
    this.http.post<Ratman[]>("http://localhost:8080/aggiungi-ratman", this.ratman)
    .subscribe(r => {
      this.listaRatman = r;
    })
  }

  elimina(){
    this.http.post<Ratman[]>("http://localhost:8080/rimuovi-ratman", this.ratman)
    .subscribe(r => {
      this.listaRatman = r;
    });
  }

  cerca(){
    this.http.post<Ratman[]>("http://localhost:8080/cerca-ratman", {criterio: this.testoRicerca} )
    .subscribe(r => {
      this.listaRatman = r;
    });
  }

  trovaTuttiRatMan(){
    this.http.post<Ratman[]>("http://localhost:8080/trova-tutti-ratman", this.ratman)
    .subscribe(r => {
      this.listaRatman = r;
    });
  }

  seleziona(r : Ratman){
    this.ratman = r;
  }
}
