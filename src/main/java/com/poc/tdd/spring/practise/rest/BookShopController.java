package com.poc.tdd.spring.practise.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookShopController {

    @GetMapping
    public String welcome() throws Exception {
        return "Hello, Welcome to world BookShop!";
    }

}
