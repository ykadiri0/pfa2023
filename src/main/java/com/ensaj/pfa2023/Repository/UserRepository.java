package com.ensaj.pfa2023.Repository;

import com.ensaj.pfa2023.Model.Affectation;
import com.ensaj.pfa2023.Model.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
    Users findUsersByEmailAndAndPassword(String email,String psw);



}
