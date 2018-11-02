package com.poc.tdd.spring.practise.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

import static org.springframework.data.elasticsearch.annotations.FieldType.Date;

@Document(indexName = "bookShop_author", type = "author")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    private String uuid;

    private String firstName;
    private String lastName;
    private String middleName;

    @Field(type = FieldType.Date)
    private java.util.Date joinedDate;
}
