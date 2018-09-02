package com.example.jasenkokrejic.decider;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class showtime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtime);






        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            Log.i("ttt"," mounted true");
        }
        else{Log.i("ttt"," mounted false");}


        Log.i("ttt",Environment.getExternalStorageDirectory().getAbsolutePath());
        Log.i("ttt",Environment.getExternalStorageDirectory().getPath());

        File sdCardDir = Environment.getExternalStorageDirectory();
        File txtFile = new File(sdCardDir, "decider.txt");
        Log.i("ttt ",txtFile.getAbsolutePath());

        StringBuilder textstring = new StringBuilder();
       // Log.i("ttt ",textstring.toString());

        try {

           BufferedReader reader = new BufferedReader(new FileReader(txtFile));
       //     BufferedReader reader = new BufferedReader(new FileReader("/storage/6B86-8815/decider.txt"));
            String line;
            Log.i("ttt "," reader read");

            while ((line = reader.readLine()) != null) {
                textstring.append(line + '\n');
                Log.i("ttt",line);
            }
            reader.close();
        } catch (IOException e) {
            Log.e("ttt", "Error occured while reading text file!!");
        }

        Log.i("text is",textstring.toString());





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
        Log.i("myTag result is: ",result.toString());
        String todo_now=result.get(0);
        Log.i("myTag","todo is "+todo_now);
        Log.i("myTag size of result ",String.valueOf(result.size()));

        List<String> result2 = result.subList(1, result.size());
        Log.i("myTag result2 is: ",result2.toString());
        Log.i("myTag size of result2 ",String.valueOf(result2.size()));

        Log.i("myTag size of list ",String.valueOf(result.size()));
        Log.i("myTag removed 0",result.toString());
        String todo_now2=result.get(1);
        Log.i("myTag","todo is "+todo_now2);

        Integer randy2=new Random().nextInt(result2.size());
        String duration=result2.get(randy2);
        Log.i("myTag duration is",duration);

        Log.i("myTag",todox);


        TextView text2=(TextView)findViewById(R.id.textView2);
        text2.setText(todo_now);
        TextView text=(TextView)findViewById(R.id.textView);
        text.setText(duration);



        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(showtime.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
