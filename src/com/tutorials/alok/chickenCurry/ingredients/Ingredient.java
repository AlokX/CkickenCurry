package com.tutorials.alok.chickenCurry.ingredients;

public class Ingredient {
    int quantity;
    double weight;
    int option;

    protected Ingredient(int quantity) {
        option=1;
        this.quantity = quantity;

    }
    protected Ingredient(double gm){
        option=2;
        weight=gm;
    }
}
