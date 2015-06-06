package com.example.andrew.rpgapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import java.util.ArrayList;
import java.util.Arrays;


public class CharBuildMenu extends ActionBarActivity {


    public final static String MAIN_MESSAGE = "com.example.andrew.rpgapp.MESSAGE"; //just one of those things you need to have for sending messages through intent

    private EditText editNameText; //declarations
    private EditText editAgeText;
    private EditText editClassText;
    private EditText editClassRace;
    private EditText editClassAlig;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_build_menu);
        // NumberSelect(); //carries out numberSelect by default = object orientation yooooo

    }


    public void sendMessage(View view) { //the edit character boxes

        Intent intent = new Intent(this, CharacterSheet.class); //intents are android for go here, this is just declaring it for later

        //grabbing info from editext boxes and converting to strings
        //this involved SOO MUCH REFACTORING. it used to be half a page long of changing individual atributes
        //dont be afraid to do stuff that looks ridiculous, because it might work.


        ArrayList<String> arrayList = new ArrayList<>();

        String nameStr = (editNameText = (EditText) findViewById(R.id.edit_message)).getText().toString(); //converting all to basic strings so we can add to an arraylist
        String ageStr = (editAgeText = (EditText) findViewById(R.id.editTextAge)).getText().toString();
        String classStr = (editClassText = (EditText) findViewById(R.id.editTextClass)).getText().toString();
        String raceStr = (editClassRace = (EditText) findViewById(R.id.editTextRace)).getText().toString();
        String aligStr = (editClassAlig = (EditText) findViewById(R.id.editTextAlignment)).getText().toString();


        arrayList.add("Name: " + nameStr); //adding to arraylist
        arrayList.add("Age: " + ageStr);
        arrayList.add("Class: " + classStr);
        arrayList.add("Race: " + raceStr);
        arrayList.add("Alignment: " + aligStr);


        intent.putExtra(MAIN_MESSAGE, arrayList); //intent.putExtra means you can package data and send it to other activities! cool yea?!

        startActivity(intent); //carries out the intent
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

   /* public void NumberSelect() {   // THIS DEALS WITH THE NUMBER WHEELS - RENDER + SET VALUES.   //I HAVE REMOVED THIS FEATURE, IT LOOKED BAD.
                        // Still a good example of applying features to multiple elements
        //arraylists are the coolest things ever. use them often as they hold objects n stuff.

        ArrayList<NumberPicker> pickerArray = new ArrayList<>();

// couldnt be bothered to make a collection of elements as styling them is hard, so i did it this way

        NumberPicker np1 = (NumberPicker) findViewById(R.id.numberPicker1);  //comment each line as per the point spec, make it easier to mod
        NumberPicker np2 = (NumberPicker) findViewById(R.id.numberPicker2); // e.g. Constitution
        NumberPicker np3 = (NumberPicker) findViewById(R.id.numberPicker3); // Intelligence
        NumberPicker np4 = (NumberPicker) findViewById(R.id.numberPicker4);
        NumberPicker np5 = (NumberPicker) findViewById(R.id.numberPicker5);

        pickerArray.addAll(Arrays.asList(np1, np2, np3, np4, np5));

        int size = pickerArray.size();

        String[] nums = new String[21];

        for (int t = 0; t < nums.length; t++) {
            nums[t] = Integer.toString(t);
        }


        for (int i = 0; i < size; i++) {

            pickerArray.get(i).setMinValue(0);
            pickerArray.get(i).setMaxValue(20);
            pickerArray.get(i).setWrapSelectorWheel(true);
            pickerArray.get(i).setDisplayedValues(nums);
            pickerArray.get(i).setValue(1);

        }

    }*/
    //END OF NUMBERSELECT()
}


// NOTE TO ANDY - you have to be able to grab the number and display points left to the side of it (outside of scrollview?)
// if points remaining == 0  possibly do not render the points remaining (maxValue)
/* if(pointsRemaining >=20){
 np.setMaxValue(20)}
 else {
 np.setMaxValue(pointsRemaining);
  */
