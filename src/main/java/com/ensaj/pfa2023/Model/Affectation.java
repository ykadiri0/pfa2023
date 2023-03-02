package com.ensaj.pfa2023.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Affectation {
    @Id
    private String id;
    @DBRef
    private Projet projet;
    @DBRef
    private Users users;

    public Affectation() {
    }

    public Affectation(Projet projet, Users users) {
        this.projet = projet;
        this.users = users;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
