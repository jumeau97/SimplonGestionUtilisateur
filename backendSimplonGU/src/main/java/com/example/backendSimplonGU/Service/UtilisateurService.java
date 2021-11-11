package com.example.backendSimplonGU.Service;

import com.example.backendSimplonGU.model.Response;
import com.example.backendSimplonGU.model.Utilisateur;
import com.example.backendSimplonGU.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    //Lister les utilisateurs
    public Response allUtilisateur(){

        List<Utilisateur> listU=new ArrayList<>();
        listU=utilisateurRepository.findAll();
        try{
            if(listU==null){
               return Response.error("Liste non trouvé");
            }
        }catch(Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
        }
        return Response.with(listU,"Liste retrouvée avec succès");
    }

    //Enregistrer un nouveau utilisateur
    public Response saveUtilisateur(Utilisateur user){

        try{
            utilisateurRepository.save(user);

        }catch(Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
        }
        return Response.success("utilisateur enregistrer avec succès");
    }


    //Supprimer un utilisateur
    public Response DeleteUser(Long id){



        try{
            utilisateurRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur est survenu");
        }
        return Response.success("Utilisateur supprimé avec succès");
    }

    //Modifier l'information d'un utilisateur
    public Response UpdateUser(Utilisateur user, Long id1){
        try{ utilisateurRepository.updateUtilisateur(
                    user.getNom(),user.getPrenom(),user.getContact(),user.getAdresse(),user.getStatut(),user.getAge(),
                    id1
            );
        }catch (Exception e){
            e.printStackTrace();
            return Response.error("Une erreur s'est produite");
        }
        return Response.success("Modification reussie");
    }


    public Response findUserById(Long id){
        Optional a;

        try{
            a=utilisateurRepository.findById(id);
            if(a==null){
                return  Response.error("utilisateur n'existe pas");
            }

        }catch(Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
        }

        return Response.with(a,"utilisateur retourné");
    }


    //Afficher l'utilisateur par statut

    public Response findByStatut(String statut){
        List<Utilisateur> u= new ArrayList<>();


        try{
            u=utilisateurRepository.findAllByStatut(statut);
            if (u==null){
                return Response.error("Aucune donnée");
            }
        }catch (Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
        }

        return Response.with(u,"Liste retrouvée avec succès");
    }

}
