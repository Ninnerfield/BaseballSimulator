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
    for (JTextField textField : textFields){
        if (textField.getText().equals("Empty")){
            return false;
        }
    }
    return true;
}
}