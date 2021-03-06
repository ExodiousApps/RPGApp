package com.example.andrew.rpgapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class CharBuildMenu extends ActionBarActivity {


    public final static String MAIN_MESSAGE = "com.example.andrew.rpgapp.MESSAGE"; //just one of those things you need to have for sending messages through intent

    String nameText;

    private EditText editNameText; //declarations
    private EditText editAgeText;
    private EditText editClassText;
    private EditText editClassRace;
    private EditText editClassAlig;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_build_menu);
        // NumberSelect(); //carries out numberSelect if we make a numberselect class, but i deleted that = object orientation yooooo

    }


    public void sendMessage(View view) throws IOException { //the edit character boxes

        Intent intent = new Intent(this, CharacterSheet.class); //intents are android for go here, this is just declaring it for later

        //grabbing info from editext boxes and converting to strings
        //this involved SOO MUCH REFACTORING. it used to be half a page long of changing individual atributes
        //dont be afraid to do stuff that looks ridiculous, because it might work.


        ArrayList<String> arrayList = new ArrayList<>();

        String nameStr = (editNameText = (EditText) findViewById(R.id.edit_message)).getText().toString();
        //converting all to basic strings so we can add to an arraylist
        String ageStr = (editAgeText = (EditText) findViewById(R.id.editTextAge)).getText().toString();
        String classStr = (editClassText = (EditText) findViewById(R.id.editTextClass)).getText().toString();
        String raceStr = (editClassRace = (EditText) findViewById(R.id.editTextRace)).getText().toString();
        String aligStr = (editClassAlig = (EditText) findViewById(R.id.editTextAlignment)).getText().toString();


        arrayList.add("Name: " + nameStr); //adding to arraylist
        arrayList.add("Age: " + ageStr);
        arrayList.add("Class: " + classStr);
        arrayList.add("Race: " + raceStr);
        arrayList.add("Allignment: " + aligStr);


        intent.putExtra(MAIN_MESSAGE, arrayList); //intent.putExtra means you can package data and send it to other activities! cool yea?!

        startActivity(intent); //carries out the intent


    }

    public void sendRNGchar(View view) {
        Intent intent = new Intent(this, CharacterSheet.class);

        RandCharBuild rand = new RandCharBuild();

        ArrayList<String> randList = rand.nameReturn();

        intent.putExtra(MAIN_MESSAGE, randList);
        startActivity(intent);

    }


    @Override  //this is built by android studio - not me, so i dont worry about it
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

