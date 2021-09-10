package com.tutorials.alok.chickenCurry.ingredients.wholeItems;

import com.tutorials.alok.chickenCurry.Preparation;
import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class Chicken extends Ingredient implements Preparation {

    public Chicken(int quantity) {
        super(quantity);
    }

    public Chicken(double gm) {
        super(gm);
    }

    @Override
    public Boolean prepare() {
        System.out.println("Chopped & cleaned the pieces...");
        return true;
    }
}
