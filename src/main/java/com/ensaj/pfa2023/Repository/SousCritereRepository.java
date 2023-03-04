package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.SousCritere;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousCritereRepository extends MongoRepository<SousCritere,String> {
}
