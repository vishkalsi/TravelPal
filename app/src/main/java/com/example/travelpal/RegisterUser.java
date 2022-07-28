package com.example.travelpal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class RegisterUser extends AppCompatActivity {

    EditText Reg_Fn,Reg_Ln,Reg_Email,Reg_Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Reg_Fn=findViewById(R.id.reg_firstname);
        Reg_Ln=findViewById(R.id.reg_lastname);
        Reg_Email=findViewById(R.id.reg_email);
        Reg_Pass=findViewById(R.id.reg_password);

    }
}