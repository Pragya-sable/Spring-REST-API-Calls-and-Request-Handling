package com.greetingapp.controller;

import com.greetingapp.model.Greeting;
import org.springframework.web.bind.annotation.*;
@RestController
public class GreetingController {
    // UC1
    @GetMapping("/greet")
    public Greeting getGreeting(){
        return new Greeting("Hello from BridgeLabz");
    }

    @PostMapping("/greet")
    public Greeting postGreeting(@RequestBody Greeting greeting){
        return greeting;
    }

    @PutMapping("/greet")
    public Greeting putGreeting(@RequestBody Greeting greeting){
        return new Greeting("Updated:"+greeting.getMessage());
    }

    @DeleteMapping("/greet")
    public Greeting deleteGreeting(){
        return new Greeting("Greeting deleted");
    }

}
