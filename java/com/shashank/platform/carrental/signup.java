package com.shashank.platform.carrental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText username,password,repassword;
    Button signup, signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
        repassword = findViewById(R.id.Repassword);
        signup= findViewById(R.id.Signup);
        signin = findViewById(R.id.Signin);

        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass= password.getText().toString();
                String repass = repassword.getText().toString();
                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass))
                {
                    Toast.makeText(signup.this, "All fields need to be filled", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(pass.equals(repass))
                    {
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false)
                        {
                            Boolean insert = DB.insertData(user,pass);
                            if(insert == true)
                            {
                                Toast.makeText(signup.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),login.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(signup.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }else
                        {
                            Toast.makeText(signup.this, "User Already Exists", Toast.LENGTH_SHORT).show();
                        }
                    }else
                    {
                        Toast.makeText(signup.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);

            }
        });
    }
}