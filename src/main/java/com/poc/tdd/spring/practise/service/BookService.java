package com.poc.tdd.spring.practise.service;

import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.request.BookRequest;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> getBookDetailsByTitle(String title);

    Book save(BookRequest request) throws Exception;

    List<Book> getAllBooks() throws Exception;
}
