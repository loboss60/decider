package com.example.jasenkokrejic.decider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class showtime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtime);
        Integer  broj=5;
        String[] todo = new String[broj];
        todo[0] = "Prošetati,5,10";
        todo[1] = "LAMP Server,10,15,20";
        todo[2] = "GIT casual reading,10,15,20";
        todo[3] = "PostgreSQL,10,15";
        todo[4] = "LAMP Server,15,20,25";
        Integer randy=new Random().nextInt(todo.length);
        String todox = todo[randy];
        List<String> result = Arrays.asList(todox.split("\\s*,\\s*"));
        Log.i("myTag",result.toString());

        Log.i("myTag",todox);
    }
}
