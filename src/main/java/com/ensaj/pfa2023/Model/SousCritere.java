package com.ensaj.pfa2023.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SousCritere {
    @Id
    private String id;
    @DBRef
    private Critere critere;
    private String name;

    public int getGbindex() {
        return gbindex;
    }

    public void setGbindex(int gbindex) {
        this.gbindex = gbindex;
    }

    private Double poids;
    private int index;
    private int gbindex;
private boolean costF;

    public boolean isCostF() {
        return costF;
    }

    public void setCostF(boolean costF) {
        this.costF = costF;
    }

    public SousCritere(String id) {
        this.id=id;
    }

    public SousCritere() {
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Critere getCritere() {
        return critere;
    }

    public void setCritere(Critere critere) {
        this.critere = critere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoinds(Double poids) {
        this.poids = poids;
    }
}
