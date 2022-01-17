package com.example.LDAP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String index() {
        return "Hello!";
    }
}
