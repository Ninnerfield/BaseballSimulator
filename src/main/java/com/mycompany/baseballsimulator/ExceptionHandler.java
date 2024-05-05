/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baseballsimulator;

import javax.swing.JTextField;

/**
 *
 * @author Jinnerfield
 */
public class ExceptionHandler {
    


public static boolean lineupFilled(JTextField[] textFields){
    //Makes sure everything is filled in on the first screen
    for (JTextField textField : textFields){
        if (textField.getText().equals("Empty") || textField.getText().equals("Choose_Player")){
            return false;
        }
    }
    return true;
}
}