package com.ensaj.pfa2023.Model;

import com.ensaj.pfa2023.Fuzzy.CostFuzzy;
import com.ensaj.pfa2023.Fuzzy.FuzzyNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SousCritereAlternative {
    @Id
    private String id;
    @DBRef
    private SousCritere sousCritere;
    @DBRef
    private Alternative alternative;
    @DBRef
    private Users users;

    private CostFuzzy poids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SousCritere getSousCritere() {
        return sousCritere;
    }

    public void setSousCritere(SousCritere sousCritere) {
        this.sousCritere = sousCritere;
    }

    public Alternative getAlternative() {
        return alternative;
    }

    public void setAlternative(Alternative alternative) {
        this.alternative = alternative;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public CostFuzzy getCostFuzzy() {
        return poids;
    }

    public void setCostFuzzy(CostFuzzy poids) {
        this.poids = poids;
    }
}
