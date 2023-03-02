package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Critere;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CritereRepository extends MongoRepository<Critere,String> {
}
