package com.poc.tdd.spring.practise.rest;

import com.poc.tdd.spring.practise.component.BookShopDAO;
import com.poc.tdd.spring.practise.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BookShopController.class)
public class BookShopControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookShopDAO bookShopDAO;

    @Test
    public void welcomeMessageTest() throws Exception{
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                                        .get("/books/home")
                                        .accept(MediaType.TEXT_PLAIN_VALUE);

        MvcResult result = mockMvc.perform(requestBuilder)
                            .andExpect(status().isOk())
                            .andExpect(content().string("Hello, Welcome to world BookShop!"))
                            .andReturn();
    }

    @Test
    public void getBookByTitleTest() throws Exception{
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                                        .get("/books/java")
                                        .accept(MediaType.APPLICATION_JSON_VALUE);

        MvcResult result = mockMvc.perform(requestBuilder)
                            .andExpect(status().isOk())
                            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andReturn();
    }

}
