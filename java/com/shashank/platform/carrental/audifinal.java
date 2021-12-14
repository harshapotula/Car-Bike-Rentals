package com.shashank.platform.carrental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class audifinal extends AppCompatActivity {

    TextView fdate,tdate;
    Button confirmbooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audifinal);


        fdate = findViewById(R.id.audifdatedisplay);
        tdate = findViewById(R.id.auditdatedisplay);

        String fromdate = getIntent().getStringExtra("Keyfromdate");
        String todate = getIntent().getStringExtra("Keytodate");

        fdate.setText(fromdate);
        tdate.setText(todate);

        confirmbooking = findViewById(R.id.audicofirmbooking);

        confirmbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),splashscreen.class);
                startActivity(intent);
            }
        });

    }
}