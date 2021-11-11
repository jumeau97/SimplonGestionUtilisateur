import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UtilisateurService } from '../services/utilisateur.service';

@Component({
  selector: 'app-liste-utilisateur',
  templateUrl: './liste-utilisateur.component.html',
  styleUrls: ['./liste-utilisateur.component.css']
})
export class ListeUtilisateurComponent implements OnInit {
  User={statut:""};
  listeUser: any;
  listApprenant: any;

  constructor(private serviceUser:UtilisateurService, private router:Router) { }

  ngOnInit(): void {
    this.listUtilisateur();
  }

  listUtilisateur(){
    this.serviceUser.ListUtilisateur().subscribe((data:any)=>{
      this.listeUser=data.object;
      console.log("liste des utilisateurs", this.listeUser);
      
    },err=>{
      console.log("erreur ...", err);
      
    });
    
    
  }

  updateUser(f:any){
    console.log(f);
    // this.router.navigate(["/utilisateur/"+f.id])
    this.router.navigateByUrl("utilisateurs/"+f.id)
 
  }

  deleteUser(d:any){
    this.serviceUser.DeleteUtilisateur(d.id).subscribe((ret:any)=>{
      if(ret["status"]=="OK"){
        this.listUtilisateur();
        console.log("supression reussie..");
      }
    })
  }

  allApprenant(){
     this.listApprenant="";
    this.User.statut="apprenant";
    this.serviceUser.FindByStatut(this.User).subscribe((data:any)=>{
      this.listApprenant=data.object;
    })

  }

  allFormateur(){
    this.listApprenant="";
    this.User.statut="formateur";
    this.serviceUser.FindByStatut(this.User).subscribe((data:any)=>{
      this.listApprenant=data.object;
  })

}

}
