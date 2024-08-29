package com.example.tpfinalcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @GetMapping("/")
    public Map<String, String> getInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("name", "Sandra");
        info.put("email", "sandra-delimoge@campus-eni.fr");
        info.put("date", LocalDate.now().toString());
        return info;
    }
}
