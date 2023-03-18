package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.RelationSousCriteres;
import com.ensaj.pfa2023.Model.SousCritere;
import com.ensaj.pfa2023.Model.Users;
import com.ensaj.pfa2023.Repository.RelationSousCriteresRepository;
import com.ensaj.pfa2023.Repository.SousCritereRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class RelationSrousCritereController {
    @Autowired
    RelationSousCriteresRepository relationSousCriteresRepository;

    @GetMapping("getSousCritereRelation")
    public List<RelationSousCriteres> getAllSousCriteresRelation(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   relationSousCriteresRepository.findAll();
    }
    @PostMapping("saveSousCritereRelation")
    public RelationSousCriteres saveSousCritereRelation(@RequestBody RelationSousCriteres affectation){
        return  relationSousCriteresRepository.save(affectation);
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
