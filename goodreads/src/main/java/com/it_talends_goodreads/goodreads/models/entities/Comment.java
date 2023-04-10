package com.it_talends_goodreads.goodreads.models.entities;

public class Comment {
    private int id;
    private Review commentedReview;
    private Comment commentedComment;
    private User writer;
    private long likes;
}
