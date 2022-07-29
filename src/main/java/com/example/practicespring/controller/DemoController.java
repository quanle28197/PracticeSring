package com.example.practicespring.controller;


import com.example.practicespring.model.City;
import com.example.practicespring.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DemoController {
    @Autowired
    ICityService cityService;
    
    //    RequestMapping de anh xa toi phuong thuc controller
    @RequestMapping("/hello")

//    ResponseBody de lien ket phan than phan hoi HTTP voi mot doi tuong

    public String helloWorld() {
        return "Hello World";
    }

    //tra du lieu ve dang JSON

    @RequestMapping("/list")
    public List<City> findCities() {
        List<City> cities = cityService.findAll();
        return cities;
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping(value="/test1/{id}")
    @ResponseBody
    public String test1(@PathVariable("id") int id){
        return "test1 with id="+id;
    }



    @RequestMapping(value="/method9")
    @ResponseBody
    public String method9(@RequestParam("id") int id){
        return "method9 with id= "+id;
    }

    @PostMapping("/createCity")
    public @ResponseBody ResponseEntity<String> createCity() {
        return new ResponseEntity<String>("Response from POST method", HttpStatus.OK);
    }

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<String> createCity2() {
        return new ResponseEntity<String>("Response from POST method", HttpStatus.OK);
    }

    @PutMapping("/city")
    public @ResponseBody ResponseEntity<String> putPerson() {
        return new ResponseEntity<String>("Response from PUT method", HttpStatus.OK);
    }

    @DeleteMapping("/city")
    public @ResponseBody ResponseEntity<String> deletePerson() {
        return new ResponseEntity<String>("Response from DELETE method", HttpStatus.OK);
    }
}
