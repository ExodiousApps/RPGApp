package com.example.andrew.rpgapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView mainTitleView;
    private String titleName;
    public final static String MAIN_MESSAGE = "com.example.andrew.rpgapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainTitleView = (TextView) findViewById(R.id.mainTextView);
        titleName = "Lets make everything colourful! Fuck the brits and there 'colours'!";   //just for funzzz xox
        mainTitleView.setText(titleName);



    }

    public void sendBuildMenu(View view) {

        Intent intent = new Intent(this, CharBuildMenu.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_char_build_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in Andro idManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
