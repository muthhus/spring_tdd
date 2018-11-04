package com.poc.tdd.spring.practise.ut;

import com.poc.tdd.spring.practise.component.BookShopDAO;
import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.repository.BookRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BookShopServiceMockTest {

    @InjectMocks
    BookShopDAO bookShopDAO;

    @Mock
    BookRepository bookRepositoryMock;

    @Test
    public void getBookByTitleTest() throws Exception{
        when(bookShopDAO.getBookDetailsByTitle("Java")).thenReturn(Optional.of(new Book()));
        assertEquals(Optional.of(new Book()), bookRepositoryMock.findByTitle("Java"));
    }

    @Test
    public void getAllBooksTest() throws Exception{

        when(bookShopDAO.getAllBooks()).thenReturn(getAllBooks());
        assertEquals(2, bookRepositoryMock.findAll().size());
    }

    private List<Book> getAllBooks(){
        List<Book> bookList = new ArrayList<Book>();

        Book book = new Book();
        book.setUuid(UUID.randomUUID().toString());
        book.setTitle("Java");
        book.setSubTitle("Lamda & Stream");

        bookList.add(book);

        Book book1 = new Book();
        book1.setUuid(UUID.randomUUID().toString());
        book1.setTitle("Java");
        book1.setSubTitle("Lamda & Stream");

        bookList.add(book1);

        return bookList;
    }
}
