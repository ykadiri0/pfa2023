package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Affectation;
import com.ensaj.pfa2023.Model.Projet;
import com.ensaj.pfa2023.Model.Users;
import com.ensaj.pfa2023.Repository.AffectationRepository;
import com.ensaj.pfa2023.Repository.ProjetRepository;
import com.ensaj.pfa2023.Repository.UserRepository;
import jakarta.websocket.server.PathParam;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AffectationController {
    @Autowired
    AffectationRepository affectationRepository;

    @Autowired
    UserRepository userRepository;


    @GetMapping("getaffectation")
    public List<Affectation> getAllproject(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   affectationRepository.findAll();
    }
    @GetMapping("getaffectationbyProject")
    public List<Affectation> getAllusersbyproject(@PathParam("id") String id){


        return   affectationRepository.findAffectationByProjet(new Projet(id));
    }

    @GetMapping("getaffectationbyUser")
    public List<Affectation> getAllProjectsbyUser(@PathParam("id") String id){

        return   affectationRepository.findAffectationByUsers(new Users(id));
    }
    @PostMapping("saveaffectation")
    public Affectation getAllusers(@RequestBody Affectation affectation){
        return  affectationRepository.save(affectation);
    }
}


