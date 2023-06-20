package com.HelloWord.Cameron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
//1. Annotation
@RestController
public class HelloWorldApplication {
     public static void main(String[] args) {
             SpringApplication.run(HelloWorldApplication.class, args);
     }
     
     // 1. Annotation
     @RestController
     @RequestMapping("/hello")
     public class HomeController {
             @RequestMapping("")
             public String hello() {
                     return "Hello World!";
             }
             @RequestMapping("/world")
             public String world() {
                     return "Class level annotations are cool too!";
             }
     }
}