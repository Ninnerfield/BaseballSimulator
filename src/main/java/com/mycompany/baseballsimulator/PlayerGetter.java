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
import static java.lang.Float.parseFloat;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
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
    private static String jsonText;
    private static HashMap<String, Float> playerWobas = new HashMap<String, Float>();
    private static String results = null;
    //Gets the API File off the internet and reads it in so it is available to use
    public static String playerGetter() throws IOException {
        URL oracle = new URL("https://raw.githubusercontent.com/Ninnerfield/BaseballAPI/main/Playerstats.json");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        StringBuilder sb = new StringBuilder();          
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            sb.append(inputLine);
       }
       in.close();
       jsonText = sb.toString();
       return sb.toString();
    }

    //Used with info buttons this crafts the name that will work when I add the string onto the end of the Fox Sports Link
    public static String nameGetter(String playerLastName){
        String[] lastNameSplit = jsonText.split(playerLastName, 0);
        String[] firstName = lastNameSplit[1].split("\"");
        String fullName = (firstName[4] +"_" + playerLastName);
        String[] completedName = fullName.split(" ");
        System.out.println(completedName[1]);
        return completedName[1];
    } 
    
    public static HashMap xwobaGetter(){
        //Gets the names of the players to add to a dictionary
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String[] wobaNames = jsonText.split("last_name\":\"", 0);
        for (int i = 0; i < wobaNames.length; i++){
            String[] deleteNames = wobaNames[i].split(" ");
            sb.append(deleteNames[0].toString());
        }
        String str = sb.toString();
        String[]finalNames = str.split("\",\"", 0);
        //Gets xwoba used to calculate season performance
        String[] wobaNumbers = jsonText.split("xwoba\":", 0);
        for (int i = 1; i < wobaNumbers.length; i++){
            String[] deleteWoba = wobaNumbers[i].split(",\"xobp\"");
            sb2.append(deleteWoba[0].toString() + " ");
        }
        String str2 = sb2.toString();
        String[] finalWobaValues = str2.split(" ", 0);
        //Make hashmap for all of the players
        for (int i = 0; i < finalWobaValues.length; i++){
             playerWobas.put(finalNames[i], parseFloat(finalWobaValues[i]));
        }
        for (HashMap.Entry<String, Float> entry : playerWobas.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        return playerWobas;
    }
    
    public static String mvpGetter(HashMap<String, Float> map){
        String mvp = "";
        float mvpWoba = 0;
        for (HashMap.Entry<String, Float> entry : map.entrySet()){
            if (mvp == ""){
                mvp = entry.getKey();
                mvpWoba = entry.getValue();
            }
            else
                if (entry.getValue() > mvpWoba){
                    mvpWoba = entry.getValue();
                    mvp = entry.getKey();
                }
        }

        results = mvp +":" + results.valueOf(mvpWoba);
        System.out.println(results);
        return results;
    }
    
    public static void yourTeamWobaGetter(String catcher, String firstBase, String secondBase, String thirdBase, String shortStop, String leftField, String centerField, String rightField, String dh){
            System.out.println("Testing for Woba " + playerWobas.get(firstBase));
            // Put starting lineup in hashmap for when you give their stats
            float yourTeamWoba = (playerWobas.get(catcher) + playerWobas.get(firstBase) + playerWobas.get(secondBase) + playerWobas.get(thirdBase) + playerWobas.get(shortStop) + playerWobas.get(leftField) + playerWobas.get(centerField) + playerWobas.get(rightField) + playerWobas.get(dh)) / 9;
            System.out.println("Your Team Woba = " + yourTeamWoba);
            double yourTeamWobaDouble = yourTeamWoba;
            System.out.println(yourTeamWobaDouble);
            Simulate.addYourTeam("TeamYES", yourTeamWobaDouble);
    }
}


/**
 * 
 *
 * @author Ninnerfield
 */
