package com.poc.tdd.spring.practise.service;

import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.request.BookRequest;

import java.util.Optional;

public interface BookService {
    Optional<Book> getBookDetailsByTitle(String title);

    public String save(BookRequest book) throws Exception;
}
