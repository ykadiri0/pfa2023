package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Fuzzy.CostFuzzy;
import com.ensaj.pfa2023.Fuzzy.FuzzyNumber;
import com.ensaj.pfa2023.Model.Alternative;
import com.ensaj.pfa2023.Model.SousCritere;
import com.ensaj.pfa2023.Model.SousCritereAlternative;
import com.ensaj.pfa2023.Model.Users;
import com.ensaj.pfa2023.Repository.AlternativeRepository;
import com.ensaj.pfa2023.Repository.SousCritereAlternativeRepository;
import com.ensaj.pfa2023.Repository.SousCritereRepository;
import com.ensaj.pfa2023.Repository.UserRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SousCritereAlternativeController {
    @Autowired
    SousCritereAlternativeRepository sousCritereAlternativeRepository;
    @Autowired
    SousCritereRepository sousCritereRepository;
    @Autowired
    AlternativeRepository alternativeRepository;
    @Autowired
    UserRepository userRepository;
    @GetMapping("getSousCritereA")
    public List<SousCritereAlternative> getAllSousCriteresAlternative(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   sousCritereAlternativeRepository.findAll();
    }
    @PostMapping("/saveSousCritereA")
    public SousCritereAlternative saveSousCritereAlternative(@RequestBody SousCritereAlternative affectation,
                                                             @RequestParam double low,
                                                             @RequestParam double medium,
                                                             @RequestParam double high) {
        Optional<SousCritere> sousCritere = sousCritereRepository.findById(affectation.getSousCritere().getId());
        FuzzyNumber fuzzyNumber = new FuzzyNumber();
        if(!sousCritere.isPresent()){
            SousCritere newSousCritere = new SousCritere();
            newSousCritere.setId(affectation.getSousCritere().getId());
            //set other properties of the new SousCritere object
            sousCritereRepository.save(newSousCritere);
        }
        affectation.setSousCritere(sousCritere.get());

        Optional<Alternative> alternative = alternativeRepository.findById(affectation.getAlternative().getId());
        if(!alternative.isPresent()){
            Alternative newAlternative = new Alternative();
            newAlternative.setId(affectation.getAlternative().getId());
            //set other properties of the new Alternative object
            alternativeRepository.save(newAlternative);
        }
        affectation.setAlternative(alternative.get());

        Optional<Users> user = userRepository.findById(affectation.getUsers().getId());
        if(!user.isPresent()){
            Users newUser = new Users();
            newUser.setId(affectation.getUsers().getId());
            //set other properties of the new User object
            userRepository.save(newUser);
        }
        affectation.setUsers(user.get());

        CostFuzzy costFuzzy = new CostFuzzy(new FuzzyNumber(low, medium, high), sousCritere.get().isCostF());
        affectation.setCostFuzzy(costFuzzy);
        return sousCritereAlternativeRepository.save(affectation);
    }
    @GetMapping("getSAbyUser")
    public List<SousCritereAlternative> getprojectn(@RequestParam("id") String id){
        return sousCritereAlternativeRepository.findSousCritereAlternativeByUsers(new Users(id));
    }


}
