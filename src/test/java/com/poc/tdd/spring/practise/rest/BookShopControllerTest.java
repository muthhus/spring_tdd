package com.poc.tdd.spring.practise.rest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;

@RunWith(SpringRunner.class)
@WebMvcTest(BookShopController.class)
public class BookShopControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
}
