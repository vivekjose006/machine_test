package com.fiver.machinetest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.fiver.machinetest.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText userName=  findViewById(R.id.username_editText);
        EditText password=findViewById(R.id.password_editText);
        Button submitBtn=findViewById(R.id.sign_in);

    }
}