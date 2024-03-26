/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baseballsimulator;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ninnerfield
 */
public class PlayerGetter {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    

    public static String PlayerGetter(String playerLastName) {
        String jsonText = "";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ninne\\OneDrive\\Documents\\NetBeansProjects\\BaseballSimulator\\src\\main\\java\\com\\mycompany\\baseballsimulator\\savant_2022Batters.json"));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                jsonText += line + "\n";
            }
            bufferedReader.close();
        }catch (IOException e){
        }
        String[] lastNameSplit = jsonText.split(playerLastName, 0);
        String[] firstName = lastNameSplit[1].split("\"");
        String fullName = (firstName[4] +"-" + playerLastName);
        String[] completedName = fullName.split(" ");
        System.out.println(completedName[1]);
        return completedName[1];
    }
}



/**
 * 
 *
 * @author Ninnerfield
 */
