package com.poc.tdd.spring.practise.component;

import com.poc.tdd.spring.practise.domain.Author;
import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.domain.BookGenre;
import com.poc.tdd.spring.practise.domain.Publication;
import com.poc.tdd.spring.practise.repository.BookRepository;
import com.poc.tdd.spring.practise.request.BookRequest;
import com.poc.tdd.spring.practise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
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

    @Override
    public Book save(BookRequest request) throws Exception {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setSubTitle(request.getSubTitle());
        book.setPrice(new BigDecimal(request.getPrice()));

        book.setFirstRelease(new SimpleDateFormat("dd/MM/yyyy").parse(request.getFirstRelease()));

        book.setWriter(setAuthor(request.getAuthor()));
        book.setPublication(setPublication(request.getPublication()));
        book.setGenre(setGenre(request.getGenre()));

        return bookRepository.save(book);

    }

    @Override
    public List<Book> getAllBooks() throws Exception {
        return bookRepository.findAll();
    }

    private Author setAuthor(String author){
        Author objAuthor = new Author();
        objAuthor.setUuid(UUID.randomUUID().toString());
        objAuthor.setFirstName(author);
        return objAuthor;
    }

    private Publication setPublication(String name){
        Publication objPublication = new Publication();
        objPublication.setUuid(UUID.randomUUID().toString());
        objPublication.setName(name);
        return objPublication;
    }

    private BookGenre setGenre(String bookType){
        BookGenre genre = new BookGenre();
        genre.setUuid(UUID.randomUUID().toString());
        genre.setName(bookType);
        return genre;
    }

}
