package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Alternative;
import com.ensaj.pfa2023.Model.AnalyseSens;
import com.ensaj.pfa2023.Model.Projet;
import com.ensaj.pfa2023.Repository.AlternativeRepository;
import com.ensaj.pfa2023.Repository.AnalyseSensRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class AnaluseSensController {
    @Autowired
    AnalyseSensRepository analyseSensRepository;

    @GetMapping("getAnaluseSensbyid")
    public List<AnalyseSens> getAnaluseSensById(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   analyseSensRepository.findAll();
    }
    @PostMapping("saveAnaluseSens")
    public AnalyseSens saveAnaluseSens(@RequestBody AnalyseSens affectation){
        return  analyseSensRepository.save(affectation);
    }
    @GetMapping("getAnaluseSensbyId")
    public List<AnalyseSens> findAnaluseSensById(@PathParam("id") String id){
        return analyseSensRepository.findAnalyseSensByProjet(new Projet(id));
    }
}
