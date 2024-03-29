package com.ensaj.pfa2023.Controller;

import com.ensaj.pfa2023.Model.Users;
import com.ensaj.pfa2023.Repository.UserRepository;
import jakarta.websocket.server.PathParam;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    UserRepository userRepository;
    @PostMapping("/getuser")
    public Users getall(@RequestBody Users user){

        Users user1 =userRepository.findUsersByEmailAndAndPassword(user.getEmail(),user.getPassword());
        return user1;
    }
    public void sendSimpleEmail(String toEmail, String subject,String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("elhadirefki2001@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("Mail Send...");
    }
    @GetMapping("getusers")
    public List<Users> getAllusers(@PathParam("id") String id){

        List<String> list = new ArrayList<>();
        list.add(id);


        Iterable<String> iterable = list;

        return   userRepository.findAllById(iterable);
    }
    @PostMapping("saveuser")
    public Users getAllusers(@RequestBody Users users){
        sendSimpleEmail(users.getEmail(), users.getPrenom(),"this is your password" +users.getPassword());
        return  userRepository.save(users);
    }
}
