package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Critere;
import com.ensaj.pfa2023.Model.Projet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CritereRepository extends MongoRepository<Critere,String> {

    List<Critere> getCritereByProjetId(String id);

    Critere findAllById(String id);
}
