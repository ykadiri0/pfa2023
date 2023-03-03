package com.ensaj.pfa2023.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Critere {
    @Id
    private String id;

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    @DBRef
    private Projet projet;
    private int numSoucritere;
    private Double poids;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumSoucritere() {
        return numSoucritere;
    }

    public void setNumSoucritere(int numSoucritere) {
        this.numSoucritere = numSoucritere;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }
}
