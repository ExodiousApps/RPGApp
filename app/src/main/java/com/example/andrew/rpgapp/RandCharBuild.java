package com.example.andrew.rpgapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Andrew on 15-Aug-15.
 */
public class RandCharBuild {


    public String randNameOLD() {

        String nameStr = "nameStr";
        Random rn = new Random();
        int answer = rn.nextInt(30) + 1;


        try {
            FileInputStream fs = new FileInputStream("name.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));

            for (int i = 0; i < answer; ++i) {
                br.readLine();
            }
            nameStr = br.readLine();


            //catch start
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return nameStr;

    }


    public String testReturn() {
        return "String";
    }

    public ArrayList nameReturn() {
        ArrayList<String> randArray = new ArrayList<>();


        // you can add to this directly, or just make new batches using this as a template
        // by the way... when you use this array everything that is typed fills all of the fields.

        // MAKE MORE PROFILES!!! THEN ADD A WAY TO RETURN A RANDOM ARRAY, SHOULD NOT BE HARD!


        randArray.addAll(Arrays.asList("Uther Lightbringer", "55", "Paladin", "Human", "Lawful Good", "The Alliance"));

        return randArray;
    }


}





/*

 */
