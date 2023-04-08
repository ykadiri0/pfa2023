package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Alternative;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlternativeRepository extends MongoRepository<Alternative,String> {
    List<Alternative> findAlternativesByProjet_Id(String id);

}
