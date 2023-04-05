package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.*;
import com.ensaj.pfa2023.Repository.AffectationRepository;
import com.ensaj.pfa2023.Repository.RelationSousCriteresRepository;
import com.ensaj.pfa2023.Repository.SousCritereRepository;
import com.ensaj.pfa2023.Repository.UserRepository;
import jakarta.websocket.server.PathParam;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class RelationSrousCritereController {
    @Autowired
    RelationSousCriteresRepository relationSousCriteresRepository;
    @Autowired
    AffectationRepository affectationRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    UserRepository userRepository;


    @GetMapping("getSousCritereRelation")
    public List<RelationSousCriteres> getAllSousCriteresRelation(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);



        Iterable<String> iterable = list;

        return   relationSousCriteresRepository.findAll();
    }
    @PostMapping("saveSousCritereRelation")
    public RelationSousCriteres saveSousCritereRelation(@RequestBody RelationSousCriteres affectation){
        RelationSousCriteres rt=relationSousCriteresRepository.save(affectation);

        List<String> list2 = new ArrayList<>();
        list2.add( rt.getUsers().getId());



        Iterable<String> iterable = list2;
        List<Users> users=userRepository.findAllById(iterable);
        users.get(0).setValidate(true);
        userRepository.save(users.get(0));
        Projet pj=affectation.getSousCritere1().getCritere().getProjet();
        List<Affectation> list =affectationRepository.findAffectationByProjet(pj);
        int b=0 ;
        for(Affectation i :list){
            if(i.getUsers().isValidate()){
                b++;
            }
        }
        if(b==list.size()){
            String a="";
            HttpEntity<String> entity1 = new HttpEntity<>(a);
            ResponseEntity<List<Affectation>> list1=  restTemplate.exchange(
                    "http://SERVICE-AHP/AHPmatrix/"+pj.getId(),
                    HttpMethod.GET,
                    entity1,
                    new ParameterizedTypeReference<List<Affectation>>(){});

        }
        return  rt;
    }
    @GetMapping("getSousCritereRelationbyUandC")
    public List<RelationSousCriteres> getAllSousCriteresRelationBYUANDC(@PathParam("id") String id,@PathParam("idc") String idc){

        List<RelationSousCriteres> list=relationSousCriteresRepository.findRelationSousCriteresByUsers(new Users(id));
        List<RelationSousCriteres> listtosend=new ArrayList<>();
        for(RelationSousCriteres i:list){
            if(Objects.equals(i.getSousCritere1().getCritere().getId(), idc)){
                listtosend.add(i);
            }
        }


        return listtosend;
    }


}
