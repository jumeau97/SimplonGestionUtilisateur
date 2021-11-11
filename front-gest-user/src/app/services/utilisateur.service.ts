import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {
host=environment.host;
  constructor(private http:HttpClient) { }
// Listing
  ListUtilisateur(){
    return this.http.get(this.host+"/utilisateur/list");
  }

  // Utilisateur par id
  UtilisateurById(id:any){
    return this.http.get(this.host+"/utilisateur/"+id)
  }

  // creation
  CreateUtilisateur(user:any){
   return  this.http.post(this.host+"/utilisateur/save",user);
  }

  // Modification
  UpdateUtilisateur(user:any, id:any){
   return this.http.put(this.host+"/utilisateur/update/"+id, user )
  }

  // Suppression
  DeleteUtilisateur(id:any){
   return this.http.delete(this.host+"/utilisateur/delete/"+id);
  }

  // utilisateur par statut
  FindByStatut(user:any){
    return this.http.post(this.host+"/utilisateur/statut",user)
  }
}
