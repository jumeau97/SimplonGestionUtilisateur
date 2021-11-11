package com.example.backendSimplonGU.controller;

import com.example.backendSimplonGU.Service.AdminService;
import com.example.backendSimplonGU.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/auth")
    public @ResponseBody ResponseEntity<?> Auth(@RequestBody Admin a){
        return new ResponseEntity<>(adminService.authentication(a.getLogin(),a.getMotDePasse()), HttpStatus.OK);
    }
}
