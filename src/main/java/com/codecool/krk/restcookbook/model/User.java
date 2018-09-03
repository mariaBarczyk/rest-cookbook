package com.codecool.krk.restcookbook.model;

public class User {

    private Long id;
    private String nickName;
    private LoginData loginData;
    private Set<Recipe> recipes;


    public User() {
    }

    public User(String nickName, LoginData loginData, Set<Recipe> recipes) {
        this.nickName = nickName;
        this.loginData = loginData;
        this.recipes = recipes;
    }

    public User(Long id, String nickName, LoginData loginData, Set<Recipe> recipes) {
        this(nickName, loginData, recipes);
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
}
