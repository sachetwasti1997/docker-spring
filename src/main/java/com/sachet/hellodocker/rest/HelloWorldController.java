package com.sachet.hellodocker.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("")
    public ResponseEntity<?> getHello(){
        return new ResponseEntity<>("Hello From The Docker World", HttpStatus.OK);
    }

}
