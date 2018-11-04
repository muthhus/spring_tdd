package com.poc.tdd.spring.practise.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "bookshop_genre", type = "bookGenre")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookGenre {

    @Id
    public String uuid;
    public String name;
}
