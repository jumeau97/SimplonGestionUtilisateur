package com.example.backendSimplonGU.controller;

import com.example.backendSimplonGU.Service.UtilisateurService;
import com.example.backendSimplonGU.model.Response;
import com.example.backendSimplonGU.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class UtilisateurController {
    
    @Autowired
    UtilisateurService utilisateurService;
    
    @GetMapping("/utilisateur/list")
    public ResponseEntity<?> listUser(){
    return new ResponseEntity<>(utilisateurService.allUtilisateur(),HttpStatus.OK);
    }

    @PostMapping("/utilisateur/save")
    public @ResponseBody ResponseEntity<?> saveUser(@RequestBody Utilisateur user){
        return new ResponseEntity<>(utilisateurService.saveUtilisateur(user),HttpStatus.OK);
    }

    @DeleteMapping("/utilisateur/delete/{id}")
    public @ResponseBody ResponseEntity<?> deleteUser(@RequestBody @PathVariable(name = "id") Long id){
        return new ResponseEntity<>(utilisateurService.DeleteUser(id),HttpStatus.OK);
    }

    @PutMapping("/utilisateur/update/{id}")
    public @ResponseBody ResponseEntity<?> updateUser(@RequestBody Utilisateur user,@PathVariable(name ="id") Long id){
        return new ResponseEntity<>(utilisateurService.UpdateUser(user, id),HttpStatus.OK);
    }
    
    @GetMapping("/utilisateur/{id}")
    public @ResponseBody  ResponseEntity<?> utilisateurByid(@RequestBody @PathVariable(name = "id") Long id){
        return new ResponseEntity<>(utilisateurService.findUserById(id), HttpStatus.OK);
    }

    @PostMapping("/utilisateur/statut")
    public @ResponseBody ResponseEntity<?> userByStatut(@RequestBody Utilisateur u){
        return new ResponseEntity<>(utilisateurService.findByStatut(u.getStatut()), HttpStatus.OK);
    }

}
