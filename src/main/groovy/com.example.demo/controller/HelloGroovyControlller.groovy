package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class HelloGroovyController {

  @RequestMapping("/groovy")
  String index() {
    return "Greetings from Spring Boot! from groovy file";
  }

  @GetMapping("/groovy/{first}/{second}")
  String sum(@PathVariable Integer first, @PathVariable Integer second){
    "Result: ${first + second} !!!"
  }


}