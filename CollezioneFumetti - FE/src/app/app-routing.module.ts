import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TexComponent } from './tex/tex.component';
import { OnepieceComponent } from './onepiece/onepiece.component';
import { RatmanComponent } from './ratman/ratman.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {path:'tex', component: TexComponent},
  {path:'onepiece', component: OnepieceComponent},
  {path:'ratman', component: RatmanComponent},
  {path:'home', component: HomeComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full' }
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
