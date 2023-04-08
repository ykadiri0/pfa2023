package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.SousCritereAlternative;
import com.ensaj.pfa2023.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SousCritereAlternativeRepository extends MongoRepository<SousCritereAlternative,String> {
    Optional<SousCritereAlternative> findSousCritereAlternativeBySousCritereId(String id);
    List<SousCritereAlternative> findSousCritereAlternativeByUsers(Users users);
}
