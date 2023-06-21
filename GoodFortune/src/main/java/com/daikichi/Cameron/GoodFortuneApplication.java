//this is the complete version


package com.daikichi.Cameron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoodFortuneApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodFortuneApplication.class, args);
    }
}

@RestController
@RequestMapping("/daikichi")
class HomeController {

    @RequestMapping("")
    public String welcome() {
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String today() {
        return "Today you find luck in all your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
@RequestMapping("/travel")
class TravelController {
    @RequestMapping("/{location}")
    public String location(@PathVariable("location") String location) {

    	return "Congratulations, you will soon be traveling to " + location;

    }
}

@RequestMapping("/lotto")
class LottoController {
    @RequestMapping("/{num}")
    public String lottoNumber(@PathVariable("num") double number) {
    	
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}

