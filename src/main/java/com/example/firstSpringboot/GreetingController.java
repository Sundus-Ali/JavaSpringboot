package com.example.firstSpringboot;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class GreetingController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome to Rest Controller";
    }

    @GetMapping("/greet/{name}")
    //pathvariable makes in url userka wax so galiyo noga so qaado param kuso shubo
    public String great(@PathVariable String name) {
        return "Welcome " + name;
    }

    ////Resonse Entity
    @GetMapping("/success")
    public ResponseEntity<String> success() {
        return ResponseEntity.ok()
                .header("Custom Header", "SpringBootSuccess")
                .body("Operation Successfull...!");
    }

    @GetMapping("/notFound")
    public ResponseEntity<String> notFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Operation not found!");
    }

    @PostMapping("/create{id}")
public ResponseEntity<String> create(){
        URI location = URI.create("/greet/newser");
        return ResponseEntity.created(location)
                .body("Resource Created");
    }
}
