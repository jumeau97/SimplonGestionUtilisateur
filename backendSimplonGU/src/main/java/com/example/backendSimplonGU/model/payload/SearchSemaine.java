package com.example.backendSimplonGU.model.payload;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SearchSemaine {
    private String semaine;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM")
    private String dateAppel;

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    public String getDateAppel() {
        return dateAppel;
    }

    public void setDateAppel(String dateAppel) {
        this.dateAppel = dateAppel;
    }
}
