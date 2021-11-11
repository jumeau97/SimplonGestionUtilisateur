package com.example.backendSimplonGU.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Presence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateAppel;
    private String Semaine;
    private String mois;
    @OneToMany(mappedBy = "presence")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<PresenceUtilisateur> presenceUtilisateurs;

    public Presence() {
    }

    public Presence(Date dateAppel, String semaine,String mois, Collection<PresenceUtilisateur> presenceUtilisateurs) {
        this.dateAppel = dateAppel;
        Semaine = semaine;
        this.mois=mois;
        this.presenceUtilisateurs = presenceUtilisateurs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateAppel() {
        return dateAppel;
    }

    public void setDateAppel(Date dateAppel) {
        this.dateAppel = dateAppel;
    }

    public String getSemaine() {
        return Semaine;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public void setSemaine(String semaine) {
        Semaine = semaine;
    }

    public Collection<PresenceUtilisateur> getPresenceUtilisateurs() {
        return presenceUtilisateurs;
    }

    public void setPresenceUtilisateurs(Collection<PresenceUtilisateur> presenceUtilisateurs) {
        this.presenceUtilisateurs = presenceUtilisateurs;
    }
}
