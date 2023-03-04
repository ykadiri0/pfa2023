package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Alternative;
import com.ensaj.pfa2023.Model.RelationSousCriteres;
import com.ensaj.pfa2023.Repository.AlternativeRepository;
import com.ensaj.pfa2023.Repository.RelationSousCriteresRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlternativeController {
    @Autowired
    AlternativeRepository alternativeRepository;

    @GetMapping("getalternativebyid")
    public List<Alternative> getAlternativeById(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   alternativeRepository.findAll();
    }
    @PostMapping("savealternative")
    public Alternative saveAlternative(@RequestBody Alternative affectation){
        return  alternativeRepository.save(affectation);
    }

}
