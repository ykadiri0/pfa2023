package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Affectation;
import com.ensaj.pfa2023.Model.Projet;
import com.ensaj.pfa2023.Repository.AffectationRepository;
import com.ensaj.pfa2023.Repository.ProjetRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class AffectationController {
    @Autowired
    AffectationRepository affectationRepository;

    @GetMapping("getaffectation")
    public List<Affectation> getAllproject(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   affectationRepository.findAll();
    }
    @PostMapping("saveaffectation")
    public Affectation getAllusers(@RequestBody Affectation affectation){
        return  affectationRepository.save(affectation);
    }
}


