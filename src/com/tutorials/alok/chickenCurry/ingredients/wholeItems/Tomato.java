package com.tutorials.alok.chickenCurry.ingredients.wholeItems;

import com.tutorials.alok.chickenCurry.Preparation;
import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class Tomato extends Ingredient implements Preparation {
    public Tomato(double gm) {
        super(gm);
    }

    public Tomato(int quantity) {
        super(quantity);
    }

    @Override
    public Boolean prepare() {
        System.out.println("Chopping the Tomato...");
        return true;
    }
}
