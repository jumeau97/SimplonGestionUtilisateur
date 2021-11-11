import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin/admin.component';
import { AccueilComponent } from './accueil/accueil.component';
import { ListeUtilisateurComponent } from './liste-utilisateur/liste-utilisateur.component';
import { MenuComponent } from './menu/menu.component';
import { AppBarComponent } from './app-bar/app-bar.component';
import { FooterComponent } from './footer/footer.component';
import { FormUtilisateurComponent } from './form-utilisateur/form-utilisateur.component';
import { ListePresenceComponent } from './liste-presence/liste-presence.component';
import { PresenceJourComponent } from './presence/presence-jour/presence-jour.component';
import { PresenceSemaineComponent } from './presence/presence-semaine/presence-semaine.component';
import { PresenceMoisComponent } from './presence/presence-mois/presence-mois.component';
import { FormsModule } from '@angular/forms';
import { UpdateUtilisateurComponent } from './updates/update-utilisateur/update-utilisateur.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    AccueilComponent,
    ListeUtilisateurComponent,
    MenuComponent,
    AppBarComponent,
    FooterComponent,
    FormUtilisateurComponent,
    ListePresenceComponent,
    PresenceJourComponent,
    PresenceSemaineComponent,
    PresenceMoisComponent,
    UpdateUtilisateurComponent
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
