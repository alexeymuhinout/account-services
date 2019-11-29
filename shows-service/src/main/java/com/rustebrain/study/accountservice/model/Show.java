package com.rustebrain.study.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "shows")
public class Show {

    @Id
    private Long id;

    @Indexed(unique = true)
    private String originalName;
    private List<Season> seasons;

}
