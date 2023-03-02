package com.ensaj.pfa2023.Model;

import com.ensaj.pfa2023.Fuzzy.FuzzyNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RelationCriters {
    @Id
    private String id;
    @DBRef
    private Critere critere1;
    @DBRef
    private Critere critere2;
    @DBRef
    private Users users;
    private FuzzyNumber poids;

    public FuzzyNumber getPoids() {
        return poids;
    }

    public void setPoids(FuzzyNumber poids) {
        this.poids = poids;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Critere getCritere1() {
        return critere1;
    }

    public void setCritere1(Critere critere1) {
        this.critere1 = critere1;
    }

    public Critere getCritere2() {
        return critere2;
    }

    public void setCritere2(Critere critere2) {
        this.critere2 = critere2;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }



}
