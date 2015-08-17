package com.example.andrew.rpgapp;

import android.app.Application;
import android.content.Context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Andrew on 16-Aug-15.
 *
 *
 * THIS DOESNT WORK
 *
 * null pointer bs
 */
public class SaveData extends Application {

    public String saveData() {

        String filename = new String("save1.txt");
        String fileText = "Hello World";

        FileOutputStream fos;


        try {
            fos = openFileOutput(filename, Context.MODE_PRIVATE);
            fos.write(fileText.getBytes());
            fos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return fileText;

    }


}

