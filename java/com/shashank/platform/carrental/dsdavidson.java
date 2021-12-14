package com.shashank.platform.carrental;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class dsdavidson extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private Button frombutton,tobutton,cbookingbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsdavidson);

        initFromDatePicker();
        initToDatePicker();

        frombutton = findViewById(R.id.davidsonfromdatebutton);
        frombutton.setText(getTodayDate1());
        tobutton = findViewById(R.id.davidsontodatebutton);
        frombutton.setText(getTodayDate2());

        cbookingbtn = findViewById(R.id.davidsoncontinuebooking);
        cbookingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fromdate = frombutton.getText().toString();
                String todate = tobutton.getText().toString();

                Intent intent = new Intent(getApplicationContext(),davidsonfinal.class);
                intent.putExtra("Keyfromdate",fromdate);
                intent.putExtra("Keytodate",todate);
                startActivity(intent);
            }
        });
    }

    private String getTodayDate1() {

        Calendar cal = Calendar.getInstance();
        int  year = cal.get(Calendar.YEAR);
        int  month = cal.get(Calendar.MONTH);
        month = month+1;
        int  day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString1(day,month,year);
    }

    private  void initFromDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener =  new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                month = month+1;
                String date = makeDateString1(day, month, year);
                frombutton.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int  year = cal.get(Calendar.YEAR);
        int  month = cal.get(Calendar.MONTH);
        int  day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this,style,dateSetListener,year,month,day);


    }

    private String makeDateString1(int day,int month, int year)
    {
        return getMonthFormat1(month)+" "+day+" "+year;

    }

    private String getMonthFormat1(int month) {
        if(month==1)
            return "JAN";
        if(month==2)
            return "FEB";
        if(month==3)
            return "MAR";
        if(month==4)
            return "APR";
        if(month==5)
            return "MAY";
        if(month==6)
            return "JUN";
        if(month==7)
            return "JUL";
        if(month==8)
            return "AUG";
        if(month==9)
            return "SEP";
        if(month==10)
            return "OCT";
        if(month==11)
            return "NOV";
        if(month==12)
            return "DEC";
        return "JAN";
    }

    public void openFromDatePicker(View view) {
        datePickerDialog.show();

    }



    /////////////////////////////////////////////////////////////



    private String getTodayDate2() {

        Calendar cal = Calendar.getInstance();
        int  year = cal.get(Calendar.YEAR);
        int  month = cal.get(Calendar.MONTH);
        month = month+1;
        int  day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString1(day,month,year);
    }





    private void initToDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener =  new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                month = month+1;
                String date = makeDateString2(day, month, year);
                tobutton.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int  year = cal.get(Calendar.YEAR);
        int  month = cal.get(Calendar.MONTH);
        int  day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this,style,dateSetListener,year,month,day);



    }
    private String makeDateString2(int day,int month, int year)
    {
        return getMonthFormat2(month)+" "+day+" "+year;

    }

    private String getMonthFormat2(int month) {
        if(month==1)
            return "JAN";
        if(month==2)
            return "FEB";
        if(month==3)
            return "MAR";
        if(month==4)
            return "APR";
        if(month==5)
            return "MAY";
        if(month==6)
            return "JUN";
        if(month==7)
            return "JUL";
        if(month==8)
            return "AUG";
        if(month==9)
            return "SEP";
        if(month==10)
            return "OCT";
        if(month==11)
            return "NOV";
        if(month==12)
            return "DEC";
        return "JAN";
    }

    public void openToDatePicker(View view) {
        datePickerDialog.show();
    }
}