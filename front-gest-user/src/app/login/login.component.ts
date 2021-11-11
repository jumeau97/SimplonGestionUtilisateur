import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../services/login/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
public Auth={login:"",motDePasse:""};
  constructor(private AuthService:LoginService, private router:Router) { }

  ngOnInit(): void {
  }

  authentication(Auth:any){
    console.log("Authentificatin ...",Auth.value);
    
    this.AuthService.Authentication(Auth.value).subscribe((data:any)=>{
      // console.log("data",data);
      
      if(data["status"]==="Ok"){
        console.log("Authentification reussie...");
        console.log(data.object);
        localStorage.setItem("user",JSON.stringify(data.object));
        this.router.navigate(["/accueil"]);
        
      }
    });
  }

}
