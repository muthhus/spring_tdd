package com.poc.tdd.spring.practise.rest;

import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
public class BookShopController {

    private BookService bookService;

    @GetMapping
    public String welcome() throws Exception {
        return "Hello, Welcome to world BookShop!";
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<Book>> getBookByTitle(@PathVariable String title) throws Exception{
       return new ResponseEntity<>(bookService.getBookDetailsByTitle(title), HttpStatus.OK);

    }

}
