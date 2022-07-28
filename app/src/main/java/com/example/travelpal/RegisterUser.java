package com.example.travelpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterUser extends AppCompatActivity {

    TextInputEditText Reg_Fn,Reg_Ln,Reg_Email,Reg_Pass;


    MaterialButton Reg_User;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Reg_Fn=(TextInputEditText) findViewById(R.id.reg_firstname);
        Reg_Ln=(TextInputEditText)findViewById(R.id.reg_lastname);
        Reg_Email=(TextInputEditText)findViewById(R.id.reg_email);
        Reg_Pass=(TextInputEditText)findViewById(R.id.reg_password);
        Reg_User=(MaterialButton) findViewById(R.id.reg_button);
        Login=(Button) findViewById(R.id.textBtn_login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

        Reg_User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first_name=Reg_Fn.getText().toString().trim();
                String last_name=Reg_Ln.getText().toString().trim();
                String email=Reg_Email.getText().toString().trim();
                String password=Reg_Pass.getText().toString().trim();

                if(first_name.equals("Aman")&&last_name.equals("Kumar")&&email.equals("Aman@")&&password.equals("123"))
                {
                    Toast.makeText(RegisterUser.this,"Login Done",Toast.LENGTH_LONG).show();
                }

            }
        });




    }


}