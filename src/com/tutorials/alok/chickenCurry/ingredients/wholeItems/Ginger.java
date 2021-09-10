package com.tutorials.alok.chickenCurry.ingredients.wholeItems;

import com.tutorials.alok.chickenCurry.Preparation;
import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class Ginger extends Ingredient implements Preparation {
    public Ginger(int quantity) {
        super(quantity);
    }

    public Ginger(double gm) {
        super(gm);
    }

    @Override
    public Boolean prepare() {
        System.out.println("Pasting ginger");
        return true;
    }
}
