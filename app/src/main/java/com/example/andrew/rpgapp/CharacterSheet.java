package com.example.andrew.rpgapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class CharacterSheet extends ActionBarActivity {


    private ListView listView;
    private TextView textTest;
    private String titleName;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_array);


        Intent intent = getIntent();
        ArrayList<String> array_list = intent.getStringArrayListExtra(MainActivity.MAIN_MESSAGE);
        // String message = intent.getStringExtra(MainActivity.MAIN_MESSAGE);


        listView = (ListView) findViewById(R.id.mainListView);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, array_list);

        textTest = (TextView) findViewById(R.id.textViewTest);
        titleName = array_list.get(0);   //just for funzzz xox
        textTest.setText(titleName);


        listView.setAdapter(adapter);
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
