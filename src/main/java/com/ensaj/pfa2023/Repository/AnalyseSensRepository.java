package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Alternative;
import com.ensaj.pfa2023.Model.AnalyseSens;
import com.ensaj.pfa2023.Model.Projet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface AnalyseSensRepository extends MongoRepository<AnalyseSens,String> {

    List<AnalyseSens> findAnalyseSensByProjet(Projet projet);
}
