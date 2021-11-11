import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { FormUtilisateurComponent } from './form-utilisateur/form-utilisateur.component';
import { ListePresenceComponent } from './liste-presence/liste-presence.component';
import { ListeUtilisateurComponent } from './liste-utilisateur/liste-utilisateur.component';
import { LoginComponent } from './login/login.component';
import { PresenceJourComponent } from './presence/presence-jour/presence-jour.component';
import { PresenceMoisComponent } from './presence/presence-mois/presence-mois.component';
import { PresenceSemaineComponent } from './presence/presence-semaine/presence-semaine.component';
import { UpdateUtilisateurComponent } from './updates/update-utilisateur/update-utilisateur.component';

const routes: Routes = [
{
  path:"",
  component:LoginComponent
},
{
  path:"accueil",
  component:AccueilComponent
},
{
  path:"liste/utilisateur",
  component:ListeUtilisateurComponent
},
{
path:"form/utilsateur",
component:FormUtilisateurComponent
},
{
  path:"liste/presence",
  component:ListePresenceComponent
  },
  {
    path:"liste/presence/jour",
    component:PresenceJourComponent
  },
  {
      path:"liste/presence/semaine",
      component:PresenceSemaineComponent
 },
 {
  path:"liste/presence/mois",
  component:PresenceMoisComponent
},
{
  path:"utilisateurs/:id",
  component:UpdateUtilisateurComponent
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
