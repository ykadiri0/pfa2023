package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Projet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProjetRepository extends MongoRepository<Projet,String> {
    List findProjetByName(String name);
    List<Projet> findByName(String name);
}
