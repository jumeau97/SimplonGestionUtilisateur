import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UtilisateurService } from 'src/app/services/utilisateur.service';

@Component({
  selector: 'app-update-utilisateur',
  templateUrl: './update-utilisateur.component.html',
  styleUrls: ['./update-utilisateur.component.css']
})
export class UpdateUtilisateurComponent implements OnInit {
  public Utilisateur={id:"", nom:"", prenom:"", adresse:"", contact:"", statut:""}
  userRecup:any;
  idUser: any;


  constructor(private activatedRoute:ActivatedRoute, private userService:UtilisateurService, 
    private router:Router) { }

  ngOnInit(): void {
    this.activatedRoute.snapshot.params.id;
    this.updateUserRe();
  }

  updateUserRe(){
    this.idUser=this.activatedRoute.snapshot.params.id;
    this.userService.UtilisateurById(this.idUser).subscribe((data:any)=>{
      console.log("utilisateur recupéré", data.object);
      this.Utilisateur=data.object;
    });
    
    
  }

        updateUser(Utilisateur:any){
         
          console.log(Utilisateur.value);
          this.userService.UpdateUtilisateur(Utilisateur.value, this.idUser).subscribe((data:any)=>{
            console.log(data);
            
            if(data["status"]=="OK"){
              console.log("modification reussie...");
              this.router.navigateByUrl("liste/utilisateur");
            }
          })
          
        }

}
