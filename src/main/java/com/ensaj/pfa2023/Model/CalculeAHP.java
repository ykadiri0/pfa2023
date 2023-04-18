package com.ensaj.pfa2023.Model;

import com.ensaj.pfa2023.Fuzzy.FuzzyNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CalculeAHP {
    @Id
    private String id;

    private FuzzyNumber[]  fn;

    @DBRef
    private Projet projet;

    private int nbrl;
    private int nbrc;
    private String type;

    public CalculeAHP(FuzzyNumber[] fn, Projet projet, int nbrl, int nbrc, String type) {
        this.fn = fn;
        this.projet = projet;
        this.nbrl = nbrl;
        this.nbrc = nbrc;
        this.type = type;
    }

    public CalculeAHP() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public FuzzyNumber[] getFn() {
        return fn;
    }

    public void setFn(FuzzyNumber[] fn) {
        this.fn = fn;
    }

    public int getNbrl() {
        return nbrl;
    }

    public void setNbrl(int nbrl) {
        this.nbrl = nbrl;
    }

    public int getNbrc() {
        return nbrc;
    }

    public void setNbrc(int nbrc) {
        this.nbrc = nbrc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
