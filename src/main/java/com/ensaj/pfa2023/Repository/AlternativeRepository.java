package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Alternative;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativeRepository extends MongoRepository<Alternative,String> {
}
