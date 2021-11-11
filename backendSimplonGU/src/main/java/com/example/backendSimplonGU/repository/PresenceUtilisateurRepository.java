package com.example.backendSimplonGU.repository;

import com.example.backendSimplonGU.model.PresenceUtilisateur;
import com.example.backendSimplonGU.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface PresenceUtilisateurRepository extends JpaRepository<PresenceUtilisateur, Long> {

    @Query("select pu from PresenceUtilisateur pu WHERE pu.etat=1 and pu.presence.dateAppel=:datep")
   List<PresenceUtilisateur>findPresenceByDate(@Param(value = "datep") Date datep);

    @Query("select pu from  PresenceUtilisateur pu WHERE pu.etat=1 and pu.presence.Semaine=:semaine and" +
            " pu.presence.mois=:mois")
    List<PresenceUtilisateur> findPresenceBySemaine(@Param(value = "semaine") String semaine,
                                                    @Param(value = "mois") String mois);

    @Query("select pu from PresenceUtilisateur pu where pu.etat=1 and  pu.presence.mois=:mois")
    List<PresenceUtilisateur>findPresenceByMois(@Param(value = "mois") String mois);

}
