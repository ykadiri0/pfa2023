package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Projet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProjetRepository extends MongoRepository<Projet,String> {
}
