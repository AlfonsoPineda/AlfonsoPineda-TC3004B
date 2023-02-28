package com.example.demo.controller;

import com.example.demo.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldController {
    @GetMapping("/say-hello")
    public ResponseEntity<Map<String, String>> sayHello(){
        Map<String,String> response = new HashMap<>();
        response.put("message", "Hello world");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/say-hello-person")
    public ResponseEntity<Map<String, Object>> sayHelloPerson(){
        Person Jhon117 = new Person();
        Jhon117.setAge(50);
        Jhon117.setHobby("Kill covenant");
        Jhon117.setName("Master Chief");

        Map<String,Object> response = new HashMap<>();
        response.put("Person", Jhon117);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/person-list")
    public ResponseEntity<List<Person>> getPeople(){
        Person p1 = new Person();
        p1.setName("Alex");
        p1.setHobby("Fubo");
        p1.setAge(20);

        Person p2 = new Person();
        p2.setName("Emi");
        p2.setHobby("Videogames");
        p2.setAge(20);

        Person p3 = new Person();
        p3.setName("Gael");
        p3.setHobby("Music");
        p3.setAge(20);

        List<Person> peopleList= new ArrayList<>();
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        return new ResponseEntity<>(peopleList, HttpStatus.OK);
    }

    @PostMapping("/person/save")
    public ResponseEntity<Person> savePerson(@RequestBody Person p){
        p.getName();
        p.getAge();
        p.getHobby();
        //Llamada al metodo de nuestro servicio que va a guardar a una persona
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
}
