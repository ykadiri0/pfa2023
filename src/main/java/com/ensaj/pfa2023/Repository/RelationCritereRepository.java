package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.RelationCriters;
import com.ensaj.pfa2023.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RelationCritereRepository extends MongoRepository<RelationCriters,String> {

    List<RelationCriters> findRelationCritersByUsers(Users users);
}
