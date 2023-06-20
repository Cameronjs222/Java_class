package com.daikichi.Cameron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaikichiApplication.class, args);
    }
	
    @RequestMapping("/daikichi")
    public class HomeController {
        
        @RequestMapping("")
        public String welcome() {
            return "Welcome!";
        }
        
        @RequestMapping("/today")
        public String today() {
            return "Today you find luck in all your endeavors!";
        }
        
        @RequestMapping("/Tomorrow")
        public String tomorrow() {
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
        }
    }
}
