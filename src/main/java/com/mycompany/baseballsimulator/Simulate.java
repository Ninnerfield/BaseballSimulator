/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baseballsimulator;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Jinnerfield
 */
public class Simulate {
        // Private static variable to hold the single instance of the class
    private static Simulate instance;
    

    // Private constructor to prevent instantiation from outside
    private Simulate() {}
    

    // Public static method to get the single instance of the class
    public static Simulate getInstance() {
        // Lazy initialization: create the instance only if it's null
        if (instance == null) {
            instance = new Simulate();
        }
        return instance;
    }
    
    //Randomly increases or decreases the offensive production (xwoba) for a player randomly between .05 and -.05
    public static HashMap mvpGetter(HashMap<String, Float> map){
        Random rand = new Random(); 
        for (HashMap.Entry<String, Float> entry : map.entrySet()){
            float changeValue = rand.nextFloat() * 0.1f;   
            if (changeValue > .05f){
                System.out.println("number > .50");
                changeValue = changeValue - .05f;
                float newValueWoba = entry.getValue() - changeValue;
                map.replace(entry.getKey(), newValueWoba);
            }else{
                float newValueWoba = entry.getValue() + changeValue;
                map.replace(entry.getKey(), newValueWoba);
            }
        }
        for (HashMap.Entry<String, Float> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        return map;
    }
}
    

    
