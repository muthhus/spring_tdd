package com.poc.tdd.spring.practise.component;

import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.repository.BookRepository;
import com.poc.tdd.spring.practise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BookShopDAO implements BookService {


    private BookRepository bookRepository;

    @Autowired
    public BookShopDAO(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> getBookDetailsByTitle(String title) {
        Optional<Book> book = bookRepository.findByTitle(title);
        return book;
    }


}
