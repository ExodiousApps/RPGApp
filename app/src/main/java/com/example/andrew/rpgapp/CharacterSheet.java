package com.example.andrew.rpgapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class CharacterSheet extends ActionBarActivity {


    private ListView listView;
    private TextView textTest;
    private String titleName;
    private String randName;
    RandCharBuild charName = new RandCharBuild();
    SaveData fileName = new SaveData();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_array);


        Intent intent = getIntent();

        ArrayList<String> array_list = intent.getStringArrayListExtra(MainActivity.MAIN_MESSAGE);
        ArrayList<String> randList = charName.nameReturn();

        listView = (ListView) findViewById(R.id.mainListView);
        textTest = (TextView) findViewById(R.id.textViewTest);

        File file = getFilesDir();
        File[] files = file.listFiles();
        String out = files.toString();

        textTest.setText(out);




            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    this, android.R.layout.simple_list_item_1, array_list);  //gotta have an adaptor tho for data structures

        listView.setAdapter(adapter);
        //this will 'plug it all in'

    }


    @Override
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
