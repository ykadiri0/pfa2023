package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Critere;
import com.ensaj.pfa2023.Model.Projet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CritereRepository extends MongoRepository<Critere,String> {

    Critere[] getCritereByProjetId(String id);
}
