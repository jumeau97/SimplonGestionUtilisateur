import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UtilisateurService } from '../services/utilisateur.service';

@Component({
  selector: 'app-form-utilisateur',
  templateUrl: './form-utilisateur.component.html',
  styleUrls: ['./form-utilisateur.component.css']
})
export class FormUtilisateurComponent implements OnInit {
public Utilisateur={nom:"", prenom:"", contact:"", adresse:"", statut:""}
  constructor(private userService:UtilisateurService, private router:Router) { }

  ngOnInit(): void {
  }

  createUser(user:any){
    // console.log(user.value);
    
    this.userService.CreateUtilisateur(user.value).subscribe((data:any)=>{
      // console.log("Enregistrement ...");
      if(data["status"]=="OK"){
        console.log("Insertion reussie");
        this.router.navigateByUrl("liste/utilisateur");
      }
      
    })
  }

}
