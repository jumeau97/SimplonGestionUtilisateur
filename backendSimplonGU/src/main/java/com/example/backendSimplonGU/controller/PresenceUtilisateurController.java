package com.example.backendSimplonGU.controller;


import com.example.backendSimplonGU.Service.PresenceUtilisateurService;
import com.example.backendSimplonGU.model.Presence;
import com.example.backendSimplonGU.model.PresenceUtilisateur;
import com.example.backendSimplonGU.model.Response;
import com.example.backendSimplonGU.model.payload.SearchSemaine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class PresenceUtilisateurController {

    @Autowired
    PresenceUtilisateurService presenceUtilisateurService;

    @PostMapping("/presence/date")
    public @ResponseBody ResponseEntity<?> presenceByDate(@RequestBody Presence p){
        return new ResponseEntity<>(presenceUtilisateurService.presenceByDate(p.getDateAppel()), HttpStatus.OK);

    }

    @PostMapping("/presence/semaine")
    public @ResponseBody ResponseEntity<?> presenceBySemaine(@RequestBody Presence p){
        return new ResponseEntity<>(presenceUtilisateurService.presenceBySemaine(p.getSemaine(),p.getMois()), HttpStatus.OK);
    }

    @PostMapping("presence/mois")
    public @ResponseBody ResponseEntity<?> findByMonth(@RequestBody Presence p){
    return  new ResponseEntity<>(presenceUtilisateurService.findpresenceByMois(p.getMois()), HttpStatus.OK);
    }
}
