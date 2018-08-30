package com.example.jasenkokrejic.decider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class showtime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtime);
        Integer  broj=5;
        String[] todo = new String[broj];
        todo[0] = "Prošetati";
        todo[1] = "LAMP Server";

        Integer[] duration=new Integer[broj];
    }
}
