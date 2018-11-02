package com.poc.tdd.spring.practise.service;

import com.poc.tdd.spring.practise.domain.Book;

import java.util.Optional;

public interface BookService {
    Optional<Book> getBookDetailsByTitle(String title);
}
