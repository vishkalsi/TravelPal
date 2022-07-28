package com.example.travelpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class Login extends AppCompatActivity {

    Button SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       // TextView textUsername = (TextView) findViewById(R.id.textUsername);
        //TextView textPassword = (TextView) findViewById(R.id.textPassword);

       SignUp = (Button) findViewById(R.id.textBtn_Signup);
//
//        loginBtn.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                if(textUsername.getText().toString().equals("admin") && textPassword.getText().toString().equals("admin")) {
//                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(Login.this, "Login Failed !!!", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }

    public void SignUp(View v)
    {
        Intent intent=new Intent(getApplicationContext(),RegisterUser.class);
        startActivity(intent);
    }

    //Disable Back
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}