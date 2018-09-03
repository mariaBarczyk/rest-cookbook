package com.codecool.krk.restcookbook.model;

import java.util.Set;

public class Recipe {

    private Long id;

    private String name;

    private User author;

    private String instruction;

    private Set<Ingredient> ingredients;

    private Set<Review> reviews;

    private Set<RecipeCategory> categories;

    public Recipe() {
    }

    public Recipe(Long id, String name, User author, String instruction) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.instruction = instruction;
    }

    public Recipe(Long id, String name, User author, String instruction, Set<Ingredient> ingredients, Set<Review> reviews, Set<RecipeCategory> categories) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.instruction = instruction;
        this.ingredients = ingredients;
        this.reviews = reviews;
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<RecipeCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<RecipeCategory> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
