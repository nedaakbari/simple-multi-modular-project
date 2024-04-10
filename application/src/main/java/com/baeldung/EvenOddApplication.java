package com.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.baeldung")
@RestController
public class EvenOddApplication {
    public static void main(String[] args) {
        SpringApplication.run(EvenOddApplication.class, args);
    }

    private final EvenOddService evenOddService;

    public EvenOddApplication(EvenOddService evenOddService) {
        this.evenOddService = evenOddService;
    }


    @GetMapping("/validate")//http://localhost:8080/validate?number=1
    public String isEvenOrOdd(@RequestParam("number") Integer number) {
        return evenOddService.isEvenOrOdd(number);
    }
}