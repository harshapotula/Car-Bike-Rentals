package com.shashank.platform.carrental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class davidsonfinal extends AppCompatActivity {
    TextView fdate,tdate;
    Button confirmbooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_davidsonfinal);

        fdate = findViewById(R.id.davidsonfdatedisplay);
        tdate = findViewById(R.id.davidsontdatedisplay);

        String fromdate = getIntent().getStringExtra("Keyfromdate");
        String todate = getIntent().getStringExtra("Keytodate");

        fdate.setText(fromdate);
        tdate.setText(todate);
        confirmbooking = findViewById(R.id.davidsonconfirmbooking);

        confirmbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),splashscreen.class);
                startActivity(intent);
            }
        });


    }
}