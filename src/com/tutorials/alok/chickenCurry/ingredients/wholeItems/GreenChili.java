package com.tutorials.alok.chickenCurry.ingredients.wholeItems;

import com.tutorials.alok.chickenCurry.Preparation;
import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class GreenChili extends Ingredient implements Preparation {
    public GreenChili(int quantity) {
        super(quantity);
    }

    @Override
    public Boolean prepare() {
        System.out.println("Splitting the chillis...");
        return true;
    }
}
