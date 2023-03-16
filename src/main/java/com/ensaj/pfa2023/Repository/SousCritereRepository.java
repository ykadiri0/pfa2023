package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Critere;
import com.ensaj.pfa2023.Model.SousCritere;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SousCritereRepository extends MongoRepository<SousCritere,String> {
    List<SousCritere> findAllByCritere(Critere critere);
    List<SousCritere> findSousCriteresByCritere_Id(String id);
}
