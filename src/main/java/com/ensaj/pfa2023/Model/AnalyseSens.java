package com.ensaj.pfa2023.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class AnalyseSens {
    @Id
    private String id;
    @DBRef
    private String Projet;
    @DBRef
    private List<Alternative>  listrank;

    private String type;

    public AnalyseSens() {
    }

    public AnalyseSens(String id, String projet, List<Alternative> listrank) {
        this.id = id;
        Projet = projet;
        this.listrank = listrank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjet() {
        return Projet;
    }

    public void setProjet(String projet) {
        Projet = projet;
    }

    public List<Alternative> getListrank() {
        return listrank;
    }

    public void setListrank(List<Alternative> listrank) {
        this.listrank = listrank;
    }
}
