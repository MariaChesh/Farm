package com.it_talends_goodreads.goodreads.models.entities;

import java.time.LocalDate;
import java.util.List;

public class Author {
    private long id;
    private String name;
    private User user;
    private String photo;
    private String bornIn;
    private LocalDate bornOn;
    private String biography;
    private List<Book> books;

}
