package com.poc.tdd.spring.practise.ut;

import com.poc.tdd.spring.practise.domain.Book;
import com.poc.tdd.spring.practise.repository.BookRepository;
import com.poc.tdd.spring.practise.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BookShopServiceMockTest {

    @InjectMocks
    BookService bookShopService;

    @Mock
    BookRepository bookRepositoryMock;

    @Test
    public void getBookByTitleTest() throws  Exception{
//        when(bookRepositoryMock.findByTitle("tiger")).thenReturn(Optional<Book.class>);
//        assertEquals(optional<Book.class>, bookShopService.getBookDetailsByTitle("tiger"));
    }
}
