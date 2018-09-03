package com.codecool.krk.restcookbook.model;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int rating;

    private String opinion;

    @ManyToOne
    private User author;

    @ManyToOne
    private Recipe recipe;

    public Review() {
    }

    public Review(int rating, String opinion, User author, Recipe recipe) {
        this.rating = rating;
        this.opinion = opinion;
        this.author = author;
        this.recipe = recipe;
    }

    public Review(Long id, int rating, String opinion, User author, Recipe recipe) {
        this(rating, opinion, author, recipe);
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

    public Recipe getRecipe() {
        return recipe;
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

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
