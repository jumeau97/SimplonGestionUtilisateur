package com.example.backendSimplonGU.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String contact;
    private String statut;
    private String adresse;
    private Integer age;
    @OneToMany(mappedBy = "utilisateur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<PresenceUtilisateur> presenceUtilisateurs;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String contact, String statut, String adresse, Integer age, Collection<PresenceUtilisateur> presenceUtilisateurs) {
        this.nom = nom;
        this.prenom = prenom;
        this.contact = contact;
        this.statut = statut;
        this.adresse = adresse;
        this.age = age;
        this.presenceUtilisateurs = presenceUtilisateurs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Collection<PresenceUtilisateur> getPresenceUtilisateurs() {
        return presenceUtilisateurs;
    }

    public void setPresenceUtilisateurs(Collection<PresenceUtilisateur> presenceUtilisateurs) {
        this.presenceUtilisateurs = presenceUtilisateurs;
    }
}
