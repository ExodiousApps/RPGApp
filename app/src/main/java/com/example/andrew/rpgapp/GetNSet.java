package com.example.andrew.rpgapp;

import android.widget.EditText;
import android.view.View;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Andrew Ramsier on 05/06/2015.
 *
 * you can ignore this or use it idc.
 * it doesnt really do anything so if you wanna change the behavior feel free
 *
 * always remember to commit the changes you make individually, not the whole project!
 * and ask if someone is using it!!!!
 *
 */
public class GetNSet {
    private String name;
    private String age;
    private String charClass;  //can't name stuff class yo
    private String race;
    private String alignment;
    private ArrayList list;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }


}



