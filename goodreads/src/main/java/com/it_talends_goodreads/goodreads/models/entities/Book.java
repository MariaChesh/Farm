package com.it_talends_goodreads.goodreads.models.entities;

import com.it_talends_goodreads.goodreads.models.entities.Author;
import com.it_talends_goodreads.goodreads.models.entities.Category;
import com.it_talends_goodreads.goodreads.models.entities.Review;

import java.time.LocalDate;
import java.util.List;

public class Book {
    private long id;
    private String title;
    private Author author;
    private LocalDate releasedDate;
    private String ISBN;
    private double rating;
    private List<Category> categories;
    private String language;
    private String format;
    private int pages;
    private String description;
    private String cover_photo;
    private List<Review> reviews;

//    @Entity
//    public class Book {
//
//        @Id
//        @GeneratedValue
//        private Long id;
//
//        @ManyToMany
//        @JoinTable(name = "book_publisher",
//                joinColumns = { @JoinColumn(name = "book_id") },
//                inverseJoinColumns = { @JoinColumn(name = "author_id") })
//        private Set<Publisher> publishers = new HashSet<Publisher>();
//
//    ...
//    }
//
}
