package com.tutorials.alok.chickenCurry;

import com.tutorials.alok.chickenCurry.ingredients.Ingredient;

public class Pan {
    public void add(Ingredient ingredient){
        String item=ingredient.getClass().getName();
        item=item.substring(item.lastIndexOf('.')+1);
        System.out.println(item+" Added...");
        switch (item){
            case "Oil": System.out.println("Oil has been heated..."); break;
            case "Onion": System.out.println("Onion Changed colour...");break;
            case "Cinnamon": System.out.println("mmm.. we can smell cinnamon's aroma... ");break;
            case "BayLeaf": System.out.println("Look at those leaves...");break;
            case "Salt": System.out.println("Salt is getting the juices out...");break;
            default: 
        }

    }
    public void stir(){
        for (int i = 0; i <5; i++) {
            System.out.println("Stirring...");
        }
    }
    public void heat(){
        System.out.println("Pan is heated....");
    }
    public void cover(){
        System.out.println("Covering the lead");
    }
    public void open(){
        System.out.println("Opening the lead");
    }
}
