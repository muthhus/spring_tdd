package com.poc.tdd.spring.practise.rest;

import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.request.BookRequest;
import com.poc.tdd.spring.practise.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookShopController {

    private static Logger LOG = LoggerFactory.getLogger(BookShopController.class);

    private BookService bookService;

    @Autowired
    public BookShopController(BookService bookService){
        this. bookService = bookService;
    }

    @GetMapping("/home")
    public String welcome() throws Exception {
        return "Hello, Welcome to world BookShop!";
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<Book>> getBookByTitle(@PathVariable String title) throws Exception{
        LOG.info("Find Book by title >>>" + title);

       return new ResponseEntity<>(bookService.getBookDetailsByTitle(title), HttpStatus.OK);

    }

    @PostMapping
    public Book saveBook(@Valid @RequestBody BookRequest bookRequest) throws Exception {
        LOG.info("Adding new book to store..");
        BookRequest request = new BookRequest();
        request.setTitle(bookRequest.getTitle());
        request.setSubTitle(bookRequest.getSubTitle());
        request.setPrice(bookRequest.getPrice());
        request.setAuthor(bookRequest.getAuthor());
        request.setPublication(bookRequest.getPublication());
        request.setIsbn(bookRequest.getIsbn());
        request.setGenre(bookRequest.getGenre());
        request.setFirstRelease(bookRequest.getFirstRelease());
        LOG.info("Request", request.toString());
        return bookService.save(request);
    }

}
