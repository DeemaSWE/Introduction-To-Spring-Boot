package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(path = "/name")
    public String getName(){
        return "My name is Deema";
    }

    @GetMapping(path = "/age")
    public String getAge(){
        return "My age is 23";
    }

    @GetMapping(path = "/check/status")
    public String getStatus(){
        return "Everything OK";
    }

    @GetMapping(path = "/health")
    public String getHealth(){
        return "Server health is up and running";
    }

    @GetMapping(path = "/names")
    public String[] getNames(){
        String[] names = {"Deema", "Sara", "Noura"};
        return names;
    }
}
