package com.it_talends_goodreads.goodreads.models.entities;

import java.util.List;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String aboutMe;
    private String link;
    private char gender;
    private String email;
    private List<Challenge> challenge;
    private String profilePhoto;
    private List<User> followers;
    private List<User> friend;
    private List<Shelf> shelves;

}
