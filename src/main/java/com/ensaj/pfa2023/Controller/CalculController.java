package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.CalculeAHP;
import com.ensaj.pfa2023.Repository.CalculeRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CalculController {
    @Autowired
    CalculeRepository calculeRepository;

    @GetMapping("getcalcule")
    public List<CalculeAHP> getAllCalcules(@PathParam("id") String id){
        return   calculeRepository.findAllByProjetId(id);
    }

    @PostMapping("saveCalcule")
    public CalculeAHP savaCalcule(@RequestBody CalculeAHP calculeAHP){
        return calculeRepository.save(calculeAHP);
    }
}
