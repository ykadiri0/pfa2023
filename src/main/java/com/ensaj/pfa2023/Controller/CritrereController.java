package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Critere;
import com.ensaj.pfa2023.Model.Projet;
import com.ensaj.pfa2023.Repository.CritereRepository;
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
public class CritrereController {
    @Autowired
    CritereRepository critereRepository;
    @Autowired
    ProjetRepository projetRepository;

    @GetMapping("getcritere")
    public List<Critere> getAllcritere(){
        return   critereRepository.findAll();
    }
    @GetMapping("getprojetsbyid")
    public List<Critere> getAllcriterebyid(@PathParam("id") String id){
        List<String> list = new ArrayList<>();
        list.add(id);
        Iterable<String> iterable = list;
        return   critereRepository.findAllById(iterable);
    }

    @GetMapping("getbyproject")
    public List<Critere> getAllcriterebyProjet(@PathParam("id") String id){
        return critereRepository.getCritereByProjetId(id);
    }
    @GetMapping("setnumsc")
    public Critere setnumsc(@PathParam("id") String id,@PathParam("nsc") int nsc ){
        List<Critere> l=getAllcriterebyid(id);
        l.get(0).setNumSoucritere(nsc);
        Critere c=l.get(0);
        return critereRepository.save(c);
    }

    @GetMapping("getbyid")
    public Critere getcriterebyId(@PathParam("id") String id){
        return critereRepository.findAllById(id);
    }


    @PostMapping("savecritere")
    public Critere savecritere(@RequestBody Critere critere){
        return  critereRepository.save(critere);
    }
}
