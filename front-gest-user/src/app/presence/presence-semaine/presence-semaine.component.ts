import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PresenceService } from 'src/app/services/presence.service';

@Component({
  selector: 'app-presence-semaine',
  templateUrl: './presence-semaine.component.html',
  styleUrls: ['./presence-semaine.component.css']
})
export class PresenceSemaineComponent implements OnInit {
public Semaine={semaine:"", mois:""};
  listPS: any;
  constructor(private router:Router, private presenceService:PresenceService) { }

  ngOnInit(): void {
  }

  ListAppBySemaine(semaine:any){
    console.log(semaine.value);
    
    this.presenceService.PresenceBySemaine(semaine.value).subscribe((data:any)=>{
      console.log("liste de presence par semaine...", data.object);
      this.listPS=data.object;
      
    })
  }

}
