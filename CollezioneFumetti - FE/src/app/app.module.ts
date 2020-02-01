import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TexComponent } from './tex/tex.component';
import {FormsModule } from '@angular/forms';
import { OnepieceComponent } from './onepiece/onepiece.component';
import { RatmanComponent } from './ratman/ratman.component';
import { HomeComponent } from './home/home.component';



@NgModule({
  declarations: [
    AppComponent,
    TexComponent,
    OnepieceComponent,
    RatmanComponent,
    HomeComponent   
  ],
  
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
