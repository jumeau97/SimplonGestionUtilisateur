package com.example.backendSimplonGU.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PresenceUtilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean etat;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Presence presence;

    public PresenceUtilisateur() {
    }

    public PresenceUtilisateur(boolean etat, Utilisateur utilisateur, Presence presence) {
        this.etat = etat;
        this.utilisateur = utilisateur;
        this.presence = presence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Presence getPresence() {
        return presence;
    }

    public void setPresence(Presence presence) {
        this.presence = presence;
    }
}
