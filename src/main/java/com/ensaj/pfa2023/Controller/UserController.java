package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Users;
import com.ensaj.pfa2023.Repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("getusers")
    public List<Users> getAllusers(){

        List<String> list = new ArrayList<>();
        list.add("6400ee2a4a5f0908bb7ff6e4");


        Iterable<String> iterable = list;

        return   userRepository.findAllById(iterable);
    }
    @PostMapping("saveuser")
    public Users getAllusers(@RequestBody Users users){
        return  userRepository.save(users);
    }
}
