package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Projet;
import com.ensaj.pfa2023.Model.Users;
import com.ensaj.pfa2023.Repository.ProjetRepository;
import com.ensaj.pfa2023.Repository.UserRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")

@RestController
public class ProjectController {
    @Autowired
    ProjetRepository projetRepository;


    @GetMapping("getprojets")
    public List<Projet> getproject(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);
        Iterable<String> iterable = list;
        return   projetRepository.findAllById(iterable);
    }
    @GetMapping("getprojet")
    public List<Projet> getprojectn(@RequestParam("name") String name){
        return projetRepository.findByName(name);
    }


    @GetMapping("getprojetss")
    public List<Projet> getprojectA(){

        return   projetRepository.findAll();
    }
    @PostMapping("saveprojet")
    public Projet getAllusers(@RequestBody Projet projet){
        return  projetRepository.save(projet);
    }
}
