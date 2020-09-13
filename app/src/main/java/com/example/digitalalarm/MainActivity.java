package com.example.digitalalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView startIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startIV=findViewById(R.id.start);

        startIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });

    }

    public void start(){
        Intent i =new Intent(MainActivity.this,start.class);
        startActivity(i);
    }
    public void stop(View view){
        Intent i =new Intent(MainActivity.this,stop.class);
        startActivity(i);
    }
    public void world(View view){
        Intent i =new Intent(MainActivity.this,World.class);
        startActivity(i);
    }
    public void timer(View view){
        Intent i =new Intent(MainActivity.this,timer.class);
        startActivity(i);
    }
}