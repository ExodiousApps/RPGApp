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
 *
 * SCROLL DOWN LOADS WE ONLY USE THE NAMERETURN CLASS. i left the other one here to show what changed
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



    public ArrayList nameReturn() {

        ArrayList<String> randArray = new ArrayList<>();
        ArrayList<String> nameArray = new ArrayList<>();
        //ArrayList<Integer> ageArray = new ArrayList<>();
        ArrayList<String> classArray = new ArrayList<>();
        ArrayList<String> raceArray = new ArrayList<>();
        ArrayList<String> alArray = new ArrayList<>();
        ArrayList<String> charArray = new ArrayList<>();
        Random r = new Random();


        // NAMES

        nameArray.addAll(Arrays.asList("Steve", "Jordon", "Hector", "Newton", "Leonard", "Jeffery", "Cody", "Brendan", "Jacinto",
                "Mel", "Mitch", "Theodore", "Patricia", "Gerry", "Felix", "Timmy", "George", "Johnathan", "Benjamin",
                "Edwin", "Charlie", "Tommie", "Carlo", "Saul", "Carlos", "Leroy", "Courtney", "Gail", "Tyler", "Robert", "Brewhan",
                "Englebert Humperdink", "Fornos", "Jack", "Kim Jong", "Khalsie"));

        int index = r.nextInt(nameArray.size());
        String nameVal = nameArray.get(index);


        //AGES 11 THROUGH 110


        int Low = 11;
        int High = 110;
        int ageInt = r.nextInt(High - Low) + Low;
        String ageVal = "" + ageInt; //cheats lol

        //CLASS HALLS

        classArray.addAll(Arrays.asList("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Magic-User/Mage/Wizard",
                "Monk/Mystic", "Paladin", "Ranger", "Sorcerer", "Thief/Rogue", "Warlock", "Warlord/Marshall"));

        index = r.nextInt(classArray.size());
        String classVal = classArray.get(index);

        //RACISM

        raceArray.addAll(Arrays.asList("Dragonborn", "Drow", "Dwarf", "Eladrin", "Elf / High Elf", "Gnome / Rock Gnome", "Half-Elf", "Half-Orc", "Halfling / Hobbit", "Human", "Tiefling"));
        index = r.nextInt(raceArray.size());
        String raceVal = raceArray.get(index);

        //ALLIGNMENT

        alArray.addAll(Arrays.asList("Lawful Good ", "Neutral Good ", "Chaotic Good ", "Lawful Neutral ", "True Neutral ", "Chaotic Neutral ", "Lawful Evil ", "Neutral Evil ", "Chaotic Evil"));
        index = r.nextInt(alArray.size());
        String alVal = alArray.get(index);


        randArray.addAll(Arrays.asList("Uther Lightbringer", "55", "Paladin", "Human", "Lawful Good"));
        charArray.addAll(Arrays.asList(nameVal, ageVal, classVal, raceVal, alVal));


        return charArray;
    }


}





/*

 */
