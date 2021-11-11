package com.example.backendSimplonGU.repository;

import com.example.backendSimplonGU.model.PresenceUtilisateur;
import com.example.backendSimplonGU.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    @Override
    List<Utilisateur> findAll();

    @Override
    Optional<Utilisateur> findById(Long aLong);


    @Modifying
    @Transactional
    @Query("update Utilisateur  u set u.nom=:nom, u.prenom=:prenom, u.adresse=:adresse, u.contact=:contact," +
            "u.statut=:statut, u.age=:age where u.id=:id")
    void updateUtilisateur(@Param(value = "nom") String nom, @Param(value = "prenom") String prenom,
                           @Param(value = "contact") String contact, @Param(value = "adresse") String adresse,
                           @Param(value = "statut") String statut, @Param(value = "age") Integer age, @Param(value = "id") Long id);

    //@Query("select Utilisateur from Utilisateur u where u.statut=:statut")
    List<Utilisateur> findAllByStatut(@Param(value = "statut") String statut);
}
