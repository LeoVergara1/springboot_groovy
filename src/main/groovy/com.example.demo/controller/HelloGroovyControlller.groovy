package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class HelloGroovyController {

  @RequestMapping("/groovy")
  String index() {
    return "Greetings from Spring Boot! from groovy file";
  }

}