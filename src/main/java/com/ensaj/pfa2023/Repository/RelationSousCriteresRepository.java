package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Critere;
import com.ensaj.pfa2023.Model.RelationSousCriteres;
import com.ensaj.pfa2023.Model.SousCritere;
import com.ensaj.pfa2023.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationSousCriteresRepository extends MongoRepository<RelationSousCriteres,String> {

    List<RelationSousCriteres> findRelationSousCriteresByUsers(Users users);


}
