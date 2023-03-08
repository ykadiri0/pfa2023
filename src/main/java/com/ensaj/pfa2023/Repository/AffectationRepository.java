package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Affectation;
import com.ensaj.pfa2023.Model.Projet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AffectationRepository extends MongoRepository<Affectation,String> {

    List<Affectation> findAffectationByProjet(Projet projet);


}
