package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Critere;
import com.ensaj.pfa2023.Model.RelationCriters;
import com.ensaj.pfa2023.Repository.CritereRepository;
import com.ensaj.pfa2023.Repository.RelationCritereRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RelationCritereController {
    @Autowired
    RelationCritereRepository relationCritereRepository;

    @GetMapping("getRcritere")
    public List<RelationCriters> getAllcritere(){
        return   relationCritereRepository.findAll();
    }
    @GetMapping("getRelationCbyid")
    public List<RelationCriters> getAllcriterebyid(@PathParam("id") String id){
        List<String> list = new ArrayList<>();
        list.add(id);
        Iterable<String> iterable = list;
        return   relationCritereRepository.findAllById(iterable);
    }
    @PostMapping("saveRC")
    public RelationCriters savecritere(@RequestBody RelationCriters relationCriters){
        return  relationCritereRepository.save(relationCriters);
    }
}
