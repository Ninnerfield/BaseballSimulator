/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.baseballsimulator;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jinnerfield
 */
public class Simulate extends javax.swing.JFrame {
    private static Simulate instance;
    private static final HashMap<String, Double> teamWobas = new HashMap<>();
    private static HashMap<String, Integer[]> teamRecords = new HashMap<>();
    private static JTextField[] teamRankings = new JTextField[30];
    private static String winner;
    private static String loser;
    private static Integer[] teamSorted = new Integer[31];
    private static JTextField[] rankRecords = new JTextField[31];
    private static String results = null;
    /**
     * Creates new form NewJFrame
     */
    public Simulate() {
        initComponents();
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
        
        teamRankings[0]= firstPlaceTeam;
        teamRankings[1]= secondPlaceTeam;
        teamRankings[2]= thirdPlaceTeam;
        teamRankings[3]= fourthPlaceTeam;
        teamRankings[4]= fifthPlaceTeam;
        teamRankings[5]= sixthPlaceTeam;
        teamRankings[6]= seventhPlaceTeam;
        teamRankings[7]= eighthPlaceTeam;
        teamRankings[8]= ninthPlaceTeam;
        teamRankings[9]= tenthPlaceTeam;
        teamRankings[10]= eleventhPlaceTeam;
        teamRankings[11]= twelfthPlaceTeam;
        teamRankings[12]= thirteenthPlaceTeam;
        teamRankings[13]= fourteenthPlaceTeam;
        teamRankings[14]= fifteenthPlaceTeam;
        teamRankings[15]= sixteenthPlaceTeam;
        teamRankings[16]= seventeenthPlaceTeam;
        teamRankings[17]= eighteenthPlaceTeam;
        teamRankings[18]= nineteenthPlaceTeam;
        teamRankings[19]= twentiethPlaceTeam;
        teamRankings[20]= twentyfirstPlaceTeam;
        teamRankings[21]= twentysecondPlaceTeam;
        teamRankings[22]= twentythirdPlaceTeam;
        teamRankings[23]= twentyfourthPlaceTeam;
        teamRankings[24]= twentyfifthPlaceTeam;
        teamRankings[25]= twentysixthPlaceTeam;
        teamRankings[26]= twentyseventhPlaceTeam;
        teamRankings[27]= twentyeighthPlaceTeam;
        teamRankings[28]= twentyninthPlaceTeam;
        teamRankings[29]= thirtiethPlaceTeam;
        
        rankRecords[0]= firstPlaceRecord;
        rankRecords[1]= secondPlaceRecord;
        rankRecords[2]= thirdPlaceRecord;
        rankRecords[3]= fourthPlaceRecord;
        rankRecords[4]= fifthPlaceRecord;
        rankRecords[5]= sixthPlaceRecord;
        rankRecords[6]= seventhPlaceRecord;
        rankRecords[7]= eighthPlaceRecord;
        rankRecords[8]= ninthPlaceRecord;
        rankRecords[9]= tenthPlaceRecord;
        rankRecords[10]= eleventhPlaceRecord;
        rankRecords[11]= twelfthPlaceRecord;
        rankRecords[12]= thirteenthPlaceRecord;
        rankRecords[13]= fourteenthPlaceRecord;
        rankRecords[14]= fifteenthPlaceRecord;
        rankRecords[15]= sixteenthPlaceRecord;
        rankRecords[16]= seventeenthPlaceRecord;
        rankRecords[17]= eighteenthPlaceRecord;
        rankRecords[18]= nineteenthPlaceRecord;
        rankRecords[19]= twentiethPlaceRecord;
        rankRecords[20]= twentyfirstPlaceRecord;
        rankRecords[21]= twentysecondPlaceRecord;
        rankRecords[22]= twentythirdPlaceRecord;
        rankRecords[23]= twentyfourthPlaceRecord;
        rankRecords[24]= twentyfifthPlaceRecord;
        rankRecords[25]= twentysixthPlaceRecord;
        rankRecords[26]= twentyseventhPlaceRecord;
        rankRecords[27]= twentyeighthPlaceRecord;
        rankRecords[28]= twentyninthPlaceRecord;
        rankRecords[29]= thirtiethPlaceRecord;
        Simulate.seasonSimulation();
        for (int i=0; i<30; i++){
             teamRankings[i].setEditable(false);
             rankRecords[i].setEditable(false);
         }
    }
    
    // Public static method to get the single instance of the class
    public static Simulate getInstance() {
        // Lazy initialization: create the instance only if it's null
        if (instance == null) {
            instance = new Simulate();
        }
        return instance;
    }
    

    
    public static void setMVP(String mvpFullName){
        mvpText.setText(mvpFullName);
    }
    
    public static void setMVPStats (String mvpStats){
        mvpStatsText.setText(mvpStats);
    }
    
    public static void addYourTeam(String teamName, Double teamWoba){
        for (HashMap.Entry<String, Double> teamsWoba : teamWobas.entrySet()) {
            if (teamName.equals(teamsWoba.getKey())){
                teamWobas.replace(teamName, teamWoba);
            }
        }
    }
    
    public static void lineupPlayerTableInsert(String catcher, String catcherStats, String firstBase, String firstBaseStats, String secondBase, String secondBaseStats, String thirdBase, String thirdBaseStats, String shortStop, String shortStopStats, String leftField, String leftFieldStats, String centerField, String centerFieldStats, String rightField, String rightFieldStats, String dh, String dhStats){
        String[] playerNames = new String[9];
        playerNames[0] = catcher;
        playerNames[1] = firstBase;
        playerNames[2] = secondBase;
        playerNames[3] = thirdBase;
        playerNames[4] = shortStop;
        playerNames[5] = leftField;
        playerNames[6] = centerField;
        playerNames[7] = rightField;
        playerNames[8] = dh;
        
        String[] playerStats = new String[9];
        playerStats[0] = catcherStats;
        playerStats[1] = firstBaseStats;
        playerStats[2] = secondBaseStats;
        playerStats[3] = thirdBaseStats;
        playerStats[4] = shortStopStats;
        playerStats[5] = leftFieldStats;
        playerStats[6] = centerFieldStats;
        playerStats[7] = rightFieldStats;
        playerStats[8] = dhStats;
        for(int i = 0; i<9; i++){
            if (playerNames[i].equals(mvpText.getText())){
                playerStats[i] = mvpStatsText.getText();
                
            }
        }
        DefaultTableModel model = (DefaultTableModel)lineupTable.getModel();
        model.addRow(new Object[]{catcher, playerStats[0]});
        model.addRow(new Object[]{firstBase, playerStats[1]});
        model.addRow(new Object[]{secondBase, playerStats[2]});
        model.addRow(new Object[]{thirdBase, playerStats[3]});
        model.addRow(new Object[]{shortStop, playerStats[4]});
        model.addRow(new Object[]{leftField, playerStats[5]});
        model.addRow(new Object[]{centerField, playerStats[6]});
        model.addRow(new Object[]{rightField, playerStats[7]});
        model.addRow(new Object[]{dh, playerStats[8]});
    }
    
    
    public static void seasonSimulation(){
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
        int index = 0;
        for (HashMap.Entry<String, Integer[]> entry : teamRecords.entrySet()) {
                teamSorted[index] = entry.getValue()[0];
                index++;
        }
        Arrays.sort(teamSorted, Comparator.nullsLast(Comparator.reverseOrder()));
        int i = 0;
        for(int t=0; t<29; t++){
            for (HashMap.Entry<String, Integer[]> entry : teamRecords.entrySet()) {
                if (entry.getValue()[0] == teamSorted[i]){
                    System.out.println(i);
                    teamRankings[i].setText(entry.getKey());
                    rankRecords[i].setText(entry.getValue()[0].toString() + "-" + entry.getValue()[1].toString());
                    teamRecords.replace(entry.getKey(), new Integer[] {0, 0});
                    i++;
                    if( i > 29){
                        i = 29;
                    }
                }
            }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        firstPlaceTeam = new javax.swing.JTextField();
        firstPlaceRecord = new javax.swing.JTextField();
        twelfthPlaceRecord = new javax.swing.JTextField();
        twelfthPlaceTeam = new javax.swing.JTextField();
        eleventhPlaceTeam = new javax.swing.JTextField();
        eleventhPlaceRecord = new javax.swing.JTextField();
        tenthPlaceRecord = new javax.swing.JTextField();
        tenthPlaceTeam = new javax.swing.JTextField();
        ninthPlaceTeam = new javax.swing.JTextField();
        ninthPlaceRecord = new javax.swing.JTextField();
        eighthPlaceRecord = new javax.swing.JTextField();
        eighthPlaceTeam = new javax.swing.JTextField();
        seventhPlaceTeam = new javax.swing.JTextField();
        seventhPlaceRecord = new javax.swing.JTextField();
        sixthPlaceRecord = new javax.swing.JTextField();
        sixthPlaceTeam = new javax.swing.JTextField();
        fifthPlaceTeam = new javax.swing.JTextField();
        fifthPlaceRecord = new javax.swing.JTextField();
        fourthPlaceRecord = new javax.swing.JTextField();
        fourthPlaceTeam = new javax.swing.JTextField();
        thirdPlaceTeam = new javax.swing.JTextField();
        thirdPlaceRecord = new javax.swing.JTextField();
        secondPlaceRecord = new javax.swing.JTextField();
        secondPlaceTeam = new javax.swing.JTextField();
        thirteenthPlaceTeam = new javax.swing.JTextField();
        thirteenthPlaceRecord = new javax.swing.JTextField();
        fifteenthPlaceRecord = new javax.swing.JTextField();
        fifteenthPlaceTeam = new javax.swing.JTextField();
        fourteenthPlaceTeam = new javax.swing.JTextField();
        fourteenthPlaceRecord = new javax.swing.JTextField();
        sixteenthPlaceTeam = new javax.swing.JTextField();
        sixteenthPlaceRecord = new javax.swing.JTextField();
        seventeenthPlaceRecord = new javax.swing.JTextField();
        seventeenthPlaceTeam = new javax.swing.JTextField();
        eighteenthPlaceTeam = new javax.swing.JTextField();
        eighteenthPlaceRecord = new javax.swing.JTextField();
        nineteenthPlaceTeam = new javax.swing.JTextField();
        nineteenthPlaceRecord = new javax.swing.JTextField();
        twentiethPlaceRecord = new javax.swing.JTextField();
        twentiethPlaceTeam = new javax.swing.JTextField();
        twentyfirstPlaceTeam = new javax.swing.JTextField();
        twentyfirstPlaceRecord = new javax.swing.JTextField();
        twentysecondPlaceTeam = new javax.swing.JTextField();
        twentysecondPlaceRecord = new javax.swing.JTextField();
        twentythirdPlaceRecord = new javax.swing.JTextField();
        twentythirdPlaceTeam = new javax.swing.JTextField();
        twentyfourthPlaceTeam = new javax.swing.JTextField();
        twentyfourthPlaceRecord = new javax.swing.JTextField();
        twentyfifthPlaceTeam = new javax.swing.JTextField();
        twentyfifthPlaceRecord = new javax.swing.JTextField();
        twentysixthPlaceRecord = new javax.swing.JTextField();
        twentysixthPlaceTeam = new javax.swing.JTextField();
        twentyseventhPlaceTeam = new javax.swing.JTextField();
        twentyseventhPlaceRecord = new javax.swing.JTextField();
        thirtiethPlaceRecord = new javax.swing.JTextField();
        thirtiethPlaceTeam = new javax.swing.JTextField();
        twentyninthPlaceTeam = new javax.swing.JTextField();
        twentyeighthPlaceTeam = new javax.swing.JTextField();
        twentyeighthPlaceRecord = new javax.swing.JTextField();
        twentyninthPlaceRecord = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mvpText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mvpStatsText = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        lineupTable = new javax.swing.JTable();
        postSeasonSimulate = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jScrollPane1.setViewportView(jEditorPane1);

        jTextField25.setText("jTextField1");

        jTextField26.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel1.setText("Individual Results");

        jLabel2.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel2.setText("Team Results");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        firstPlaceTeam.setText("jTextField1");
        firstPlaceTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstPlaceTeamActionPerformed(evt);
            }
        });

        firstPlaceRecord.setText("jTextField1");

        twelfthPlaceRecord.setText("jTextField1");

        twelfthPlaceTeam.setText("jTextField1");

        eleventhPlaceTeam.setText("jTextField1");

        eleventhPlaceRecord.setText("jTextField1");

        tenthPlaceRecord.setText("jTextField1");

        tenthPlaceTeam.setText("jTextField1");

        ninthPlaceTeam.setText("jTextField1");

        ninthPlaceRecord.setText("jTextField1");

        eighthPlaceRecord.setText("jTextField1");

        eighthPlaceTeam.setText("jTextField1");

        seventhPlaceTeam.setText("jTextField1");

        seventhPlaceRecord.setText("jTextField1");

        sixthPlaceRecord.setText("jTextField1");

        sixthPlaceTeam.setText("jTextField1");

        fifthPlaceTeam.setText("jTextField1");

        fifthPlaceRecord.setText("jTextField1");

        fourthPlaceRecord.setText("jTextField1");

        fourthPlaceTeam.setText("jTextField1");

        thirdPlaceTeam.setText("jTextField1");

        thirdPlaceRecord.setText("jTextField1");

        secondPlaceRecord.setText("jTextField1");

        secondPlaceTeam.setText("jTextField1");

        thirteenthPlaceTeam.setText("jTextField1");

        thirteenthPlaceRecord.setText("jTextField1");

        fifteenthPlaceRecord.setText("jTextField1");

        fifteenthPlaceTeam.setText("jTextField1");

        fourteenthPlaceTeam.setText("jTextField1");

        fourteenthPlaceRecord.setText("jTextField1");

        sixteenthPlaceTeam.setText("jTextField1");

        sixteenthPlaceRecord.setText("jTextField1");

        seventeenthPlaceRecord.setText("jTextField1");

        seventeenthPlaceTeam.setText("jTextField1");

        eighteenthPlaceTeam.setText("jTextField1");

        eighteenthPlaceRecord.setText("jTextField1");

        nineteenthPlaceTeam.setText("jTextField1");

        nineteenthPlaceRecord.setText("jTextField1");

        twentiethPlaceRecord.setText("jTextField1");

        twentiethPlaceTeam.setText("jTextField1");

        twentyfirstPlaceTeam.setText("jTextField1");

        twentyfirstPlaceRecord.setText("jTextField1");

        twentysecondPlaceTeam.setText("jTextField1");

        twentysecondPlaceRecord.setText("jTextField1");

        twentythirdPlaceRecord.setText("jTextField1");

        twentythirdPlaceTeam.setText("jTextField1");

        twentyfourthPlaceTeam.setText("jTextField1");

        twentyfourthPlaceRecord.setText("jTextField1");

        twentyfifthPlaceTeam.setText("jTextField1");

        twentyfifthPlaceRecord.setText("jTextField1");

        twentysixthPlaceRecord.setText("jTextField1");

        twentysixthPlaceTeam.setText("jTextField1");

        twentyseventhPlaceTeam.setText("jTextField1");

        twentyseventhPlaceRecord.setText("jTextField1");

        thirtiethPlaceRecord.setText("jTextField1");

        thirtiethPlaceTeam.setText("jTextField1");

        twentyninthPlaceTeam.setText("jTextField1");

        twentyeighthPlaceTeam.setText("jTextField1");

        twentyeighthPlaceRecord.setText("jTextField1");

        twentyninthPlaceRecord.setText("jTextField1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("1.)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("16.)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fifteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fifteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fourteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fourteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(thirteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(thirteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(thirtiethPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(thirtiethPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(twentyninthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(twentyninthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(twentyeighthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(twentyeighthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(twelfthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(twelfthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(eleventhPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(eleventhPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(tenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(ninthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ninthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(eighthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(eighthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(seventhPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(seventhPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(sixthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sixthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fifthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fifthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(fourthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fourthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(thirdPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(thirdPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(secondPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(secondPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(firstPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(eighteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(eighteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(seventeenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(seventeenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(sixteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sixteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(twentyfirstPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(twentyfirstPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(twentiethPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(twentiethPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(nineteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(nineteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(twentyfourthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(twentyfourthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(twentythirdPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(twentythirdPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(twentysecondPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(twentysecondPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(twentyseventhPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(twentyseventhPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(twentysixthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(twentysixthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(twentyfifthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(twentyfifthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secondPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thirdPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirdPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sixteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seventeenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seventeenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eighteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eighteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fifthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fifthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sixthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nineteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentiethPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentiethPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyfirstPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyfirstPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seventhPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seventhPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eighthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eighthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ninthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ninthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentysecondPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentysecondPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentythirdPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentythirdPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyfourthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyfourthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eleventhPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eleventhPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twelfthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twelfthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyfifthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyfifthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentysixthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentysixthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyseventhPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyseventhPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thirteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fifteenthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fifteenthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyeighthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyeighthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyninthPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyninthPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thirtiethPlaceTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirtiethPlaceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        mvpText.setText("MVP Here");
        mvpText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvpTextActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MVP:");

        mvpStatsText.setText("MVP Stats Here");

        lineupTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lineupTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Stats"
            }
        ));
        jScrollPane4.setViewportView(lineupTable);

        postSeasonSimulate.setBackground(new java.awt.Color(255, 0, 0));
        postSeasonSimulate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        postSeasonSimulate.setText("Simulate Post-Season");
        postSeasonSimulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postSeasonSimulateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(mvpText, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addComponent(mvpStatsText))
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(postSeasonSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mvpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mvpStatsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(postSeasonSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(484, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(431, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstPlaceTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstPlaceTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstPlaceTeamActionPerformed

    private void mvpTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mvpTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mvpTextActionPerformed

    private void postSeasonSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postSeasonSimulateActionPerformed
        // TODO add your handling code here:
        String Champion = SimulateHelper.postSeasonSimulation(firstPlaceTeam.getText(), secondPlaceTeam.getText(), thirdPlaceTeam.getText(), fourthPlaceTeam.getText(), fifthPlaceTeam.getText(), sixthPlaceTeam.getText(), seventhPlaceTeam.getText(), eighthPlaceTeam.getText(), ninthPlaceTeam.getText(), tenthPlaceTeam.getText());
        PostSeason.getInstance();
        PostSeason pi = new PostSeason();
        pi.setVisible(true);
        PostSeason.worldSeriesChampion(Champion);
    }//GEN-LAST:event_postSeasonSimulateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eighteenthPlaceRecord;
    private javax.swing.JTextField eighteenthPlaceTeam;
    private javax.swing.JTextField eighthPlaceRecord;
    private javax.swing.JTextField eighthPlaceTeam;
    private javax.swing.JTextField eleventhPlaceRecord;
    private javax.swing.JTextField eleventhPlaceTeam;
    private javax.swing.JTextField fifteenthPlaceRecord;
    private javax.swing.JTextField fifteenthPlaceTeam;
    private javax.swing.JTextField fifthPlaceRecord;
    private javax.swing.JTextField fifthPlaceTeam;
    private javax.swing.JTextField firstPlaceRecord;
    private javax.swing.JTextField firstPlaceTeam;
    private javax.swing.JTextField fourteenthPlaceRecord;
    private javax.swing.JTextField fourteenthPlaceTeam;
    private javax.swing.JTextField fourthPlaceRecord;
    private javax.swing.JTextField fourthPlaceTeam;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private static javax.swing.JTable lineupTable;
    private static javax.swing.JTextField mvpStatsText;
    private static javax.swing.JTextField mvpText;
    private javax.swing.JTextField nineteenthPlaceRecord;
    private javax.swing.JTextField nineteenthPlaceTeam;
    private javax.swing.JTextField ninthPlaceRecord;
    private javax.swing.JTextField ninthPlaceTeam;
    private javax.swing.JButton postSeasonSimulate;
    private javax.swing.JTextField secondPlaceRecord;
    private javax.swing.JTextField secondPlaceTeam;
    private javax.swing.JTextField seventeenthPlaceRecord;
    private javax.swing.JTextField seventeenthPlaceTeam;
    private javax.swing.JTextField seventhPlaceRecord;
    private javax.swing.JTextField seventhPlaceTeam;
    private javax.swing.JTextField sixteenthPlaceRecord;
    private javax.swing.JTextField sixteenthPlaceTeam;
    private javax.swing.JTextField sixthPlaceRecord;
    private javax.swing.JTextField sixthPlaceTeam;
    private javax.swing.JTextField tenthPlaceRecord;
    private javax.swing.JTextField tenthPlaceTeam;
    private javax.swing.JTextField thirdPlaceRecord;
    private javax.swing.JTextField thirdPlaceTeam;
    private javax.swing.JTextField thirteenthPlaceRecord;
    private javax.swing.JTextField thirteenthPlaceTeam;
    private javax.swing.JTextField thirtiethPlaceRecord;
    private javax.swing.JTextField thirtiethPlaceTeam;
    private javax.swing.JTextField twelfthPlaceRecord;
    private javax.swing.JTextField twelfthPlaceTeam;
    private javax.swing.JTextField twentiethPlaceRecord;
    private javax.swing.JTextField twentiethPlaceTeam;
    private javax.swing.JTextField twentyeighthPlaceRecord;
    private javax.swing.JTextField twentyeighthPlaceTeam;
    private javax.swing.JTextField twentyfifthPlaceRecord;
    private javax.swing.JTextField twentyfifthPlaceTeam;
    private javax.swing.JTextField twentyfirstPlaceRecord;
    private javax.swing.JTextField twentyfirstPlaceTeam;
    private javax.swing.JTextField twentyfourthPlaceRecord;
    private javax.swing.JTextField twentyfourthPlaceTeam;
    private javax.swing.JTextField twentyninthPlaceRecord;
    private javax.swing.JTextField twentyninthPlaceTeam;
    private javax.swing.JTextField twentysecondPlaceRecord;
    private javax.swing.JTextField twentysecondPlaceTeam;
    private javax.swing.JTextField twentyseventhPlaceRecord;
    private javax.swing.JTextField twentyseventhPlaceTeam;
    private javax.swing.JTextField twentysixthPlaceRecord;
    private javax.swing.JTextField twentysixthPlaceTeam;
    private javax.swing.JTextField twentythirdPlaceRecord;
    private javax.swing.JTextField twentythirdPlaceTeam;
    // End of variables declaration//GEN-END:variables
}
