import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
host=environment.host;
  constructor(private http:HttpClient) { }

  Authentication(auth:any){
   return this.http.post(this.host+"/auth", auth);
  }
}
