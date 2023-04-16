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


    public CalculeAHP(String id, FuzzyNumber[] fn, Projet projet) {
        this.id = id;
        this.fn = fn;
        this.projet = projet;
    }


    public FuzzyNumber[] getFn() {
        return fn;
    }

    public void setFn(FuzzyNumber[] fn) {
        this.fn = fn;
    }

}
