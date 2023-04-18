package com.ensaj.pfa2023.Repository;


import com.ensaj.pfa2023.Model.CalculeAHP;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalculeRepository extends MongoRepository<CalculeAHP,String> {
    List<CalculeAHP> findAllByProjetId(String id);
}
