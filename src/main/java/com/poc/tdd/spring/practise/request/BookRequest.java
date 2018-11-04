package com.poc.tdd.spring.practise.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookRequest {
    private String title;
    private String subTitle;
    private String price;
    private String author;
    private String publication;
    private String isbn;
    private String genre;
    private String firstRelease;

}
