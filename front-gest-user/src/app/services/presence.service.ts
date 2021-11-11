import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PresenceService {
host=environment.host;
  constructor(private http:HttpClient) { }

  // Afficher la liste de presence par jour
  PresenceByDay(dateApp:any){
   return this.http.post(this.host+"/presence/date",dateApp);
  }

  //Afficher la liste de presence par semaine
  PresenceBySemaine(semaine:any){
  return this.http.post(this.host+"/presence/semaine",semaine)
  }

  // Afficher La liste de presence par mois

  PresenceByMonth(month:any){
   return  this.http.post(this.host+"/presence/mois", month);
  }

  // Presence concernant un apprenant
  PresenceApprenant(id:any){
    this.http.get(this.host+"/presence/apprenant/"+id);
  }
}
