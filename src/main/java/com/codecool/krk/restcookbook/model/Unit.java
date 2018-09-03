package com.codecool.krk.restcookbook.model;

public enum Unit {

    GRAM       ("g"),
    KILOGRAM   ("kg"),
    MILILITRE  ("ml"),
    CUP        ("cup"),
    TABLESPOON ("tablespoon"),
    TEASPOON   ("teaspoon"),
    LITRE      ("l");

    private String name;

    private Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
