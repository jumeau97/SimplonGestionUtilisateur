import { Component, OnInit } from '@angular/core';
import { PresenceService } from 'src/app/services/presence.service';

@Component({
  selector: 'app-presence-mois',
  templateUrl: './presence-mois.component.html',
  styleUrls: ['./presence-mois.component.css']
})
export class PresenceMoisComponent implements OnInit {
Presence={mois:""};
  listPresenceMonth: any;
  constructor(private presenceService:PresenceService) { }

  ngOnInit(): void {
    
  }

  listByMonth(presence:any){
    console.log("....",presence.value);
    
    this.presenceService.PresenceByMonth(presence.value).subscribe((data:any)=>{
      this.listPresenceMonth=data.object;
    })
  }

}
