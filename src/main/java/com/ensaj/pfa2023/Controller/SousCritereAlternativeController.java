package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.SousCritere;
import com.ensaj.pfa2023.Model.SousCritereAlternative;
import com.ensaj.pfa2023.Repository.SousCritereAlternativeRepository;
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
public class SousCritereAlternativeController {
    @Autowired
    SousCritereAlternativeRepository sousCritereAlternativeRepository;

    @GetMapping("getSousCritere")
    public List<SousCritereAlternative> getAllSousCriteresAlternative(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   sousCritereAlternativeRepository.findAll();
    }
    @PostMapping("saveSousCritere")
    public SousCritereAlternative saveSousCritereAlternative(@RequestBody SousCritereAlternative affectation){
        return  sousCritereAlternativeRepository.save(affectation);
    }
}
