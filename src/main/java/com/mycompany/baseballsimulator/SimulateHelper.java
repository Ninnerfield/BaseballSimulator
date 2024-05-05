/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baseballsimulator;

import java.util.Random;

/**
 *
 * @author Jinnerfield
 */
public class SimulateHelper {
    


    public static String postSeasonSimulation(String first, String second, String third, String fourth, String fifth, String sixth, String seventh, String eighth, String ninth, String tenth){
        String[] teams = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Random rand = new Random();
        int i = rand.nextInt(10);
        return teams[i];
    }
}
