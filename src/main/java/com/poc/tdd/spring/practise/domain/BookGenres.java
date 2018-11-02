package com.poc.tdd.spring.practise.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "bookShop_genres", type = "genres")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookGenres {

    @Id
    public String uuid;
    public String name;
}
