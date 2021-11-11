package com.example.backendSimplonGU.Service;

import com.example.backendSimplonGU.model.Admin;
import com.example.backendSimplonGU.model.Response;
import com.example.backendSimplonGU.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Response authentication(String login, String password){
        Admin listAdmin;

        try{
            listAdmin=adminRepository.findAdminByLoginAndPassword(login,password);
            if(listAdmin==null){
                return Response.error("login ou mot de passe incorrect");
            }
        }catch(Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
        }

        return Response.with(listAdmin, "Authentification reussie");
    }


}
