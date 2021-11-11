import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  utilisateur: any;

  constructor(private router:Router) { }

  ngOnInit() {
    this.Userconnecte();
  }

  logout(){
    // this.router.navigate(["/login"]);
   
  }

  Userconnecte(){
   this.utilisateur=JSON.parse(localStorage.getItem('user')||'');
   console.log("utilisateur connecté", this.utilisateur);
   
  }

}
