package com.tutorials.alok.chickenCurry.ingredients.masalas;

import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class Masala extends Ingredient {
    String colour;
    public Masala(double gm,String colour) {
        super(gm);
        this.colour=colour;
    }

}
