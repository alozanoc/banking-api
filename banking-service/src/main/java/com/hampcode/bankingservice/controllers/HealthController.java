package com.hampcode.bankingservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    static Integer counter = 1;

    @GetMapping("/counter")
    public String counter() {
        HealthController.counter += 1;
        return "<html><h1>Visitas " + HealthController.counter + "</h1></html>";
    }

    @GetMapping("/health")
    public String health() {
        return "ok";
    }
}
