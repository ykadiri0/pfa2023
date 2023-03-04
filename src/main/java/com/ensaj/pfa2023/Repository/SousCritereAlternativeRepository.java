package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.SousCritereAlternative;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousCritereAlternativeRepository extends MongoRepository<SousCritereAlternative,String> {
}
