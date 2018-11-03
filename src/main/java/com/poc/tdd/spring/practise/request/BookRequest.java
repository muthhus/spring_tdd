package com.poc.tdd.spring.practise.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookRequest {
    private String title;
    private String subTitle;
    private BigDecimal price;
    private String author;
    private String publication;
    private String isbn;
    private String genre;
    private String firstRelease;

}
