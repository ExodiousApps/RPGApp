package com.example.andrew.rpgapp;

import android.widget.EditText;
import android.view.View;

/**
 * Created by Andrew Ramsier on 05/06/2015.
 */
public class GetNSet {
    private String name;
    private String age;
    private String charClass;  //can't name stuff class yo
    private String race;
    private String alignment;


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



