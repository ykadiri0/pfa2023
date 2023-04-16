package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.CalculeAHP;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CalculeRepository extends MongoRepository<CalculeAHP,String> {
    List<CalculeAHP> findAllByProjetId(String id);
}
