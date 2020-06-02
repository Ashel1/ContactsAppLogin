package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    EditText etUsername,etPassword;
    Button btSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername= findViewById(R.id.et_username);
        etPassword= findViewById(R.id.et_password);
        btSubmit= findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etUsername.getText().toString().equals("admin") &&
                   etPassword .getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), ContactsActivity.class);
                    startActivity(intent);
                }
                else if(etUsername.getText().toString().equals("") &&
                        etPassword .getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter Username And Password", Toast.LENGTH_SHORT).show();
                }
                else if(etUsername.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Username Empty",Toast.LENGTH_SHORT).show();
                }
                else if(etPassword .getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Password Empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
