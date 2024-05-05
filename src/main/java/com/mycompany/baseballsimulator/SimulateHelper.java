/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baseballsimulator;

import java.util.HashMap;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author Jinnerfield
 */
public class SimulateHelper {
    private static final HashMap<String, Double> teamWobas = new HashMap<>();
    private static HashMap<String, Integer[]> teamRecords = new HashMap<>();
    private static JTextField[] teamRankings = new JTextField[30];
    private static String winner;
    private static String loser;
    



    public static String postSeasonSimulation(String first, String second, String third, String fourth, String fifth, String sixth, String seventh, String eighth, String ninth, String tenth){
        String[] teams = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Random rand = new Random();
        int i = rand.nextInt(10);
        return teams[i];
    }
    
    public static HashMap addYourTeam(String teamName, Double teamWoba){
        //Adds the user's team to the list of teams based on what the user chooses
        teamWobas.put("Dodgers", 0.337);
        teamWobas.put("Yankees", 0.327);
        teamWobas.put("Blue Jays", 0.331);
        teamWobas.put("Cardinals", 0.326);
        teamWobas.put("Mets", 0.326);
        teamWobas.put("Astros", 0.324);
        teamWobas.put("Braves", 0.330);
        teamWobas.put("Brewers", 0.317);
        teamWobas.put("Guardians", 0.306);
        teamWobas.put("Mariners", 0.310);
        teamWobas.put("Philles", 0.322);
        teamWobas.put("Padres", 0.308);
        teamWobas.put("Twins", 0.315);
        teamWobas.put("Diamondbacks", 0.303);
        teamWobas.put("Orioles", 0.305);
        teamWobas.put("Rays", 0.302);
        teamWobas.put("Red Sox", 0.319);
        teamWobas.put("Cubs", 0.307);
        teamWobas.put("Giants", 0.311);
        teamWobas.put("Rangers", 0.305);
        teamWobas.put("White Sox", 0.306);
        teamWobas.put("Angels", 0.300);
        teamWobas.put("Royals", 0.302);
        teamWobas.put("Marlins", 0.290);
        teamWobas.put("Rockies", 0.312);
        teamWobas.put("Nationals", 0.303);
        teamWobas.put("Pirates", 0.289);
        teamWobas.put("Athletics", 0.277);
        teamWobas.put("Reds", 0.299);
        teamWobas.put("Tigers", 0.279);
        for (HashMap.Entry<String, Double> teamsWoba : teamWobas.entrySet()) {
            if (teamName.equals(teamsWoba.getKey())){
                teamWobas.replace(teamName, teamWoba);
            }
        }
        return teamWobas;
    }
    
    public static HashMap simulateSeason(){
       //Simulates the season
       teamRecords.put("Dodgers", new Integer[]{0,0});
       teamRecords.put("Yankees", new Integer[]{0,0});
       teamRecords.put("Blue Jays", new Integer[]{0,0});
       teamRecords.put("Cardinals", new Integer[]{0,0});
       teamRecords.put("Mets", new Integer[]{0,0});
       teamRecords.put("Astros", new Integer[]{0,0});
       teamRecords.put("Braves", new Integer[]{0,0});
       teamRecords.put("Brewers", new Integer[]{0,0});
       teamRecords.put("Guardians", new Integer[]{0,0});
       teamRecords.put("Mariners", new Integer[]{0,0});
       teamRecords.put("Philles", new Integer[]{0,0});
       teamRecords.put("Padres", new Integer[]{0,0});
       teamRecords.put("Twins", new Integer[]{0,0});
       teamRecords.put("Diamondbacks", new Integer[]{0,0});
       teamRecords.put("Orioles", new Integer[]{0,0});
       teamRecords.put("Rays", new Integer[]{0,0});
       teamRecords.put("Red Sox", new Integer[]{0,0});
       teamRecords.put("Cubs", new Integer[]{0,0});
       teamRecords.put("Giants", new Integer[]{0,0});
       teamRecords.put("Rangers", new Integer[]{0,0});
       teamRecords.put("White Sox", new Integer[]{0,0});
       teamRecords.put("Angels", new Integer[]{0,0});
       teamRecords.put("Royals", new Integer[]{0,0});
       teamRecords.put("Marlins", new Integer[]{0,0});
       teamRecords.put("Rockies", new Integer[]{0,0});
       teamRecords.put("Nationals", new Integer[]{0,0});
       teamRecords.put("Pirates", new Integer[]{0,0});
       teamRecords.put("Athletics", new Integer[]{0,0});
       teamRecords.put("Reds", new Integer[]{0,0});
       teamRecords.put("Tigers", new Integer[]{0,0});
        Random rand = new Random(); 
        for(int i=0; i<4; i++){
            for (HashMap.Entry<String, Double> homeTeams : teamWobas.entrySet()) {
                for(HashMap.Entry<String, Double> awayTeams : teamWobas.entrySet()){
                    if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 163 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 163){                 
                        if (homeTeams.getValue() > awayTeams.getValue()){ //If the home team has a higher woba it gives them the advantage
                            if (homeTeams.getValue() > awayTeams.getValue() + .2f){
                                float changeValue = rand.nextFloat(); 
                                if (changeValue <= .73f){ //If the random number is below .73 then the home team wins giving them a 73% chance of victory
                                   winner = homeTeams.getKey();
                                   loser = awayTeams.getKey();
                                   if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                       teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                       teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});
                                   }
                                   }else{ //27% chance of victory for the away team
                                       winner = awayTeams.getKey();
                                       loser = homeTeams.getKey();
                                       if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                            teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                            teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});      
                                       }
                                   }
                                }else{
                                    float changeValue = rand.nextFloat(); 
                                    if (changeValue <= .6f){ //If the random number is below .6 then the home team wins giving them a 60% chance of victory
                                        winner = homeTeams.getKey();
                                        loser = awayTeams.getKey();
                                        if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                        teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                        teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});
                                    }
                                    }else{ //40% chance of victory for the away team
                                        winner = awayTeams.getKey();
                                        loser = homeTeams.getKey();
                                        if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                        teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                        teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});      
                                    }
                                }
                            }
                        }else if (homeTeams.getValue() < awayTeams.getValue()){//If the away team has a higher woba it gives them the advantage
                            if (homeTeams.getValue() < awayTeams.getValue() + .2f){
                                float changeValue = rand.nextFloat(); 
                                if (changeValue >= .73f){ //If the random number is above .6 then the home team wins giving them a 60% chance of victory
                                    winner = homeTeams.getKey();
                                    loser = awayTeams.getKey();
                                    if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                        teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                        teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});

                                    }
                                }else{ //40% chance of victory for the away team
                                    winner = awayTeams.getKey();
                                    loser = homeTeams.getKey();
                                    if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                        teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                        teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});
                                    }
                                }
                            }else{
                                float changeValue = rand.nextFloat(); 
                                if (changeValue >= .6f){ //If the random number is above .6 then the home team wins giving them a 60% chance of victory
                                    winner = homeTeams.getKey();
                                    loser = awayTeams.getKey();
                                    if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                        teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                        teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});
                                    }
                                }else{ //40% chance of victory for the away team
                                    winner = awayTeams.getKey();
                                    loser = homeTeams.getKey();
                                    if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                        teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                        teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});

                                    }
                                }
                            }
                        } else{//If they have the same woba it's a 50/50
                            float changeValue = rand.nextFloat(); 
                            if (changeValue <= .5f){ //If the random number is below .5 then the home team wins giving them a 60% chance of victory
                                winner = homeTeams.getKey();
                                loser = awayTeams.getKey();
                                if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                    teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                    teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});
                                }
                            }else{ //40% chance of victory for the away team
                                winner = awayTeams.getKey();
                                loser = homeTeams.getKey();
                                if (teamRecords.get(homeTeams.getKey())[0] + teamRecords.get(homeTeams.getKey())[1] < 162 && teamRecords.get(awayTeams.getKey())[0] + teamRecords.get(awayTeams.getKey())[1] < 162){
                                    teamRecords.replace(winner, new Integer[] {teamRecords.get(winner)[0] + 1, teamRecords.get(winner)[1] + 0});
                                    teamRecords.replace(loser, new Integer[] {teamRecords.get(loser)[0] + 0, teamRecords.get(loser)[1] + 1});
                                }
                            }
                        }
                    }
                }        
            }
        }
        return teamRecords;
    }
}
