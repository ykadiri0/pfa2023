package com.ensaj.pfa2023.Model;

import com.ensaj.pfa2023.Fuzzy.FuzzyNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RelationSousCriteres {
    @Id
    private String id;
    @DBRef
    private SousCritere sousCritere1;
    @DBRef
    private SousCritere sousCritere2;
    @DBRef
    private Users users;
    private FuzzyNumber poids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SousCritere getSousCritere1() {
        return sousCritere1;
    }

    public void setSousCritere1(SousCritere sousCritere1) {
        this.sousCritere1 = sousCritere1;
    }

    public SousCritere getSousCritere2() {
        return sousCritere2;
    }

    public void setSousCritere2(SousCritere sousCritere2) {
        this.sousCritere2 = sousCritere2;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public FuzzyNumber getPoids() {
        return poids;
    }

    public void setPoids(FuzzyNumber poids) {
        this.poids = poids;
    }
}
