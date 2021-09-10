package com.tutorials.alok.chickenCurry.ingredients.wholeItems;

import com.tutorials.alok.chickenCurry.Preparation;
import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class Onion extends Ingredient implements Preparation {
    String pieces;
    public Onion(int quantity) {
        super(quantity);
    }

    public Onion(double gm) {
        super(gm);
    }

    @Override
    public Boolean prepare() {
        System.out.println("Chopping the onions...");
        return true;
    }
}
