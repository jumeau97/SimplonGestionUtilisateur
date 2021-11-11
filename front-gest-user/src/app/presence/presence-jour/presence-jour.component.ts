import { Component, OnInit } from '@angular/core';
import { PresenceService } from 'src/app/services/presence.service';

@Component({
  selector: 'app-presence-jour',
  templateUrl: './presence-jour.component.html',
  styleUrls: ['./presence-jour.component.css']
})
export class PresenceJourComponent implements OnInit {
  public Presence={dateAppel:""};
  listDay: any;
  constructor(private servicePresence:PresenceService) { }

  ngOnInit(): void {
  }

  listByDay(p:any){
    this.servicePresence.PresenceByDay(this.Presence).subscribe((data:any)=>{
      this.listDay=data.object;
      console.log("liste de presence par jour",this.listDay);
      
    })
  }

}
