package com.example.backendSimplonGU.Service;

import com.example.backendSimplonGU.model.PresenceUtilisateur;
import com.example.backendSimplonGU.model.Response;
import com.example.backendSimplonGU.repository.PresenceUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class PresenceUtilisateurService {

    @Autowired
    PresenceUtilisateurRepository presenceUtilisateurRepository;

    public Response presenceByDate(Date dp){
        List<PresenceUtilisateur> pu=new ArrayList<>();
        pu=presenceUtilisateurRepository.findPresenceByDate(dp);
        try{

           if (pu==null){
               return Response.error("Liste non trouvée");
           }
        }catch (Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
        }
        return Response.with(pu,"Liste retournée avec succès");
    }

    public Response presenceBySemaine( String semaine, String mois){
        List<PresenceUtilisateur> pu= new ArrayList<>();
        //Date myDate = new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
//        String endDate=sdf.format(datep);
//
//        System.out.println(endDate);
        //Date endDate=new Month(datep);
        try{
            pu=presenceUtilisateurRepository.findPresenceBySemaine(semaine, mois);
            if(pu==null){
                return Response.error("Liste nonretrouvée");
            }
        }catch (Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
      }
        return Response.with(pu,"Liste retournée avec succès");
   }

   //presence utilisateur par mois
    public Response findpresenceByMois(String mois){
        List<PresenceUtilisateur> pu= new ArrayList<>();

        try{
            pu=presenceUtilisateurRepository.findPresenceByMois(mois);
            if(pu==null){
               return Response.error("Liste non retrouvée");
            }
        }catch (Exception e){
            e.printStackTrace(System.out);
            return Response.error("Une erreur s'est produite");
        }
        return Response.with(pu,"Liste trouvée");
    }
}
