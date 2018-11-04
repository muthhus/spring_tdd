package com.poc.tdd.spring.practise.repository;

import com.poc.tdd.spring.practise.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {
    Optional<Book> findByTitle(String title);
    Page<Book> findByGenre(String bookGenre, Pageable pageable);
    List<Book> findAll();
}
