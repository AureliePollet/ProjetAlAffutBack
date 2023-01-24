package fr.alaffut.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
        
      //  @Value("${hellomsg}")
        private String message;
    //
        @GetMapping("/helloworld")
        public String helloWorld() {
            return "Hello";//message;
        
    }

}
