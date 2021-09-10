package com.tutorials.alok.chickenCurry;

import com.tutorials.alok.chickenCurry.ingredients.masalas.*;
import com.tutorials.alok.chickenCurry.ingredients.wholeItems.*;

public class Main {

    public static void main(String[] args) {
        // create ingredients
        Chicken chicken =new Chicken(750.0);
        Oil musteredOil = new Oil(300);
        CuminSeed cuminSeed = new CuminSeed(15);
        BayLeaf bayLeaf =new BayLeaf(3);
        Cinnamon cinnamon = new Cinnamon(10);
        Onion onion= new Onion(300.0);
        GreenChili greenChili= new GreenChili(7);
        Ginger ginger = new Ginger(50.0);
        Garlic garlic =new Garlic(15.0);
        Tomato tomato = new Tomato(5);
        Salt salt = new Salt(13);
        Water water = new Water(600);
//        masalas
        TurmericPowder turmeric = new TurmericPowder(7.0);
        RedChiliPowder redChiliPowder = new RedChiliPowder(5);
        CuminPowder cuminPowder = new CuminPowder(10);
        CorianderPowder corianderPowder = new CorianderPowder(8);
        GaramMasala garamMasala = new GaramMasala(5);
        // prepare each ingredient
        onion.prepare();
        greenChili.prepare();
        ginger.prepare();
        garlic.prepare();
        tomato.prepare();
        chicken.prepare();

        // heat the pan
        Pan myPan= new Pan();
        myPan.heat();
        // pour oil & wait till oil is heat up
        myPan.add(musteredOil);
        // add cumin seed,bay leaf,cinnamon
        myPan.add(cuminSeed);
        myPan.add(bayLeaf);
        myPan.add(cinnamon);
        // add onion, green chili, ginger-garlic paste
        myPan.add(onion);
        myPan.add(greenChili);
        System.out.println("Onion Colour has changed...");
        myPan.add(ginger);
        myPan.add(garlic);
        // cook till oil released
        System.out.println("Oil is released...");
        // add tomato, salt,chicken
        myPan.add(tomato);
        myPan.add(salt);
        myPan.add(chicken);
        // add masala(turmeric, red-chili powder,cumin powder, coriander powder)
        myPan.add(turmeric);
        myPan.add(redChiliPowder);
        myPan.add(cuminPowder);
        myPan.add(corianderPowder);

        // stir
        myPan.stir();
        // add water
        myPan.add(water);
        // cover the lead on
        myPan.cover();
        // add garam masala
        myPan.open();
        myPan.add(garamMasala);
        // turn the gas off
        System.out.println("Turning the gas off...");
        System.out.println("Chicken curry is ready...");
    }
}
