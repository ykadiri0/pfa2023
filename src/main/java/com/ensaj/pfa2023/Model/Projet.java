package com.ensaj.pfa2023.Model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@ComponentScan
@Document
public class Projet {
    @Id
    private String id;
    private String name;
    private int numCritere;
    private int numAlternative;
    private Date date;

    public Projet(String name, int numCritere, int numAlternative, Date date) {
        this.name = name;
        this.numCritere = numCritere;
        this.numAlternative = numAlternative;
        this.date = date;
    }
    public Projet() {

    }

    public Projet(String id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumCritere() {
        return numCritere;
    }

    public void setNumCritere(int numCritere) {
        this.numCritere = numCritere;
    }

    public int getNumAlternative() {
        return numAlternative;
    }

    public void setNumAlternative(int numAlternative) {
        this.numAlternative = numAlternative;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
