package com.codecool.krk.restcookbook.model;

public class Review {

    private Long id;
    private int rating;
    private String opinion;
    private User author;

    public Review() {
    }

    public Review(int rating, String opinion, User author) {
        this.rating = rating;
        this.opinion = opinion;
        this.author = author;
    }

    public Review(Long id, int rating, String opinion, User author) {
        this(rating, opinion, author);
        this.id = id;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public int getRaiting() {
        return rating;
    }

    public String getOpinion() {
        return opinion;
    }

    public User getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRaiting(int rating) {
        this.rating = rating;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
