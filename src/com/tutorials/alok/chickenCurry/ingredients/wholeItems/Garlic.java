package com.tutorials.alok.chickenCurry.ingredients.wholeItems;

import com.tutorials.alok.chickenCurry.Preparation;
import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class Garlic extends Ingredient implements Preparation {
    public Garlic(int quantity) {
        super(quantity);
    }

    public Garlic(double gm) {
        super(gm);
    }

    @Override
    public Boolean prepare() {
        System.out.println("Pasting garlic");
        return true;
    }
}
