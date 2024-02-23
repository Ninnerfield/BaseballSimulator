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

    /**
     *
     * @author Jinnerfield
     * @return 
     */

        public static String PlayerGetter() {
            String jsonText = "";
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader("savant_2022Batters.json"));
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    jsonText += line + "\n";
                    System.out.println(jsonText);
                }
                bufferedReader.close();
            }catch (IOException e){
            }
            return jsonText;
        }
}
//            try {
//                File file = new File("savant_2022Batters.json");
//                URLConnection yc = file.openConnection();
//                BufferedReader in = new BufferedReader(new InputStreamReader(
//                        yc.getInputStream()));
//                String inputLine;
//                StringBuilder sb = new StringBuilder();
//                while ((inputLine = in.readLine()) != null) {
//                    System.out.println(inputLine);
//                    sb.append(inputLine);
//                }
//                in.close();
//                return sb.toString();
//            } catch (MalformedURLException ex) {
////                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
            
//            return null;
//        }
//    }



/**
 * 
 *
 * @author Jinnerfield
 */
