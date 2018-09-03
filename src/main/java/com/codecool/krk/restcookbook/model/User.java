package com.codecool.krk.restcookbook.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cookbook_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nick_name", nullable = false, unique = true)
    private String nickName;

    @OneToOne
    private LoginData loginData;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Recipe> recipes;

    @OneToMany(mappedBy = "author")
    private Set<Review> writtenReviews;

    public User() {
    }

    public User(String nickName, LoginData loginData, Set<Recipe> recipes, Set<Review> writtenReviews) {
        this.nickName = nickName;
        this.loginData = loginData;
        this.recipes = recipes;
        this.writtenReviews = writtenReviews;
    }

    public User(Long id, String nickName, LoginData loginData, Set<Recipe> recipes, Set<Review> writtenReviews) {
        this(nickName, loginData, recipes, writtenReviews);
        this.id =id;
    }

    public Long getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public LoginData getLoginData() {
        return loginData;
    }

    public Set<Review> getWrittenReviews() {
        return writtenReviews;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setLoginData(LoginData loginData) {
        this.loginData = loginData;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setWrittenReviews(Set<Review> writtenReviews) {
        this.writtenReviews = writtenReviews;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", loginData=" + loginData +
                '}';
    }
}
