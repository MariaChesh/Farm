package com.it_talends_goodreads.goodreads.models.entities;

import java.time.LocalDate;
import java.util.List;

public class Review {
    private long id;
    private Book book;
    private User writer;
    private long likes;
    private LocalDate date;
    private String content;
    private List<Comment> comments;



}
