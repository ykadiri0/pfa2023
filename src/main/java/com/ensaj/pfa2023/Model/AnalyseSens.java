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
    private Projet projet;
    @DBRef
    private List<Alternative>  listrank;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AnalyseSens() {
    }

    public AnalyseSens(String id, Projet projet, List<Alternative> listrank) {
        this.id = id;
        projet = projet;
        this.listrank = listrank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AnalyseSens(Projet projet) {
        projet = projet;
    }

    public List<Alternative> getListrank() {
        return listrank;
    }

    public void setListrank(List<Alternative> listrank) {
        this.listrank = listrank;
    }
}
