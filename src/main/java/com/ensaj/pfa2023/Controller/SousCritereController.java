package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Affectation;
import com.ensaj.pfa2023.Model.SousCritere;
import com.ensaj.pfa2023.Repository.AffectationRepository;
import com.ensaj.pfa2023.Repository.CritereRepository;
import com.ensaj.pfa2023.Repository.SousCritereRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SousCritereController {
    @Autowired
    SousCritereRepository sousCritereRepository;
    @Autowired
    CritereRepository critereRepository;

    @GetMapping("getSousCritere")
    public List<SousCritere> getAllSousCriteres(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   sousCritereRepository.findAll();
    }

    @GetMapping("getSousCritereb")
    public List<SousCritere> getSousCriteresByc(@PathParam("id") String id){
        return   sousCritereRepository.findAllByCritere(critereRepository.findAllById(id));
    }

    @PostMapping("saveSousCritere")
    public SousCritere saveSousCritere(@RequestBody SousCritere affectation){
        return  sousCritereRepository.save(affectation);
    }

}
