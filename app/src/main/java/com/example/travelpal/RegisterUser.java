package com.example.travelpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterUser extends AppCompatActivity {

    TextInputLayout Til_Fn,Til_Ln,Til_Email,Til_Pass;
    TextInputEditText Reg_Fn,Reg_Ln,Reg_Email,Reg_Pass;


    MaterialButton Reg_User;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Til_Fn=(TextInputLayout) findViewById(R.id.til_firstname);
        Til_Ln=(TextInputLayout) findViewById(R.id.til_lastname);
        Til_Email=(TextInputLayout) findViewById(R.id.til_email);
        Til_Pass=(TextInputLayout) findViewById(R.id.til_password);
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


                if(!ValidateFirstName(first_name) | !ValidateLastName(last_name) | !ValidateEmail(email) | !ValidatePassword(password) )
                {
                return;

                }
                else
                {
                    Intent intent =new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                }




            }
        });




    }



    public boolean ValidateFirstName(String first_name)
    {

        if(first_name.isEmpty())
        {
            Til_Fn.setError("Error");
            return false;
        }
        else
        {
            Til_Fn.setError(null);
            return true;
        }
    }

    public boolean ValidateLastName(String last_name)
    {

        if(last_name.isEmpty())
        {
            Til_Ln.setError("Error");
            return false;
        }
        else
        {
            Til_Ln.setError(null);
            return true;
        }
    }
    public boolean ValidateEmail(String email)
    {

        if(email.isEmpty())
        {
            Til_Email.setError("Error");
            return false;
        }
        else
        {
            Til_Email.setError(null);
            return true;
        }
    } public boolean ValidatePassword(String password)
    {

        if(password.isEmpty())
        {
            Til_Pass.setError("Error");
            return false;
        }
        else if(password.length()<8)
        {
            Til_Pass.setError("Should be atleast 8 characters");
            return false;
        }
        else
        {
            Til_Pass.setError(null);
            return true;
        }
    }




}