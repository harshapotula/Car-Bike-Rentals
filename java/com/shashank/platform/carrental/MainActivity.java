package com.shashank.platform.carrental;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    Button audi,bmw,benz;
    Button ducati,davidson,honda;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cars
        audi = findViewById(R.id.audibooknow);
        bmw = findViewById(R.id.bmwbooknow);
        benz = findViewById(R.id.benzbooknow);

        //bikes
        ducati = findViewById(R.id.ducatibooknow);
        davidson=findViewById(R.id.davidsonbooknow);
        honda = findViewById(R.id.hondabooknow);


       //cars
        audi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dsaudi.class);
                startActivity(intent);

            }
        });

        bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dsbmw.class);
                startActivity(intent);

            }
        });

        benz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dsbenz.class);
                startActivity(intent);

            }
        });

        //bikes
        ducati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dsducati.class);
                startActivity(intent);
            }
        });

        davidson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dsdavidson.class);
                startActivity(intent);
            }
        });

        honda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dshonda.class);
                startActivity(intent);
            }
        });


    }



}
