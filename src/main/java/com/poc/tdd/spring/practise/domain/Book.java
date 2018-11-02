package com.poc.tdd.spring.practise.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.Date;

@Document(indexName = "bookShop_book", type = "book")
@Data
public class Book {

    @Id
    private String uuid;

    private String title;
    private String subTitle;

    private BigDecimal price;
    private String isbn;

    @Field(type = FieldType.Nested)
    private Author writer;

    @Field(type = FieldType.Nested)
    private Publication publication;


    @Field(type = FieldType.Date)
    private Date firstRelease;


}
