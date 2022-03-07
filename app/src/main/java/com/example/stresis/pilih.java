package com.example.stresis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pilih extends AppCompatActivity {
    private ImageButton psiButton;
    private ImageButton userButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih);
        psiButton = (ImageButton) findViewById(R.id.psiButton);
        psiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpsilogin();
            }
        });
        userButton = (ImageButton) findViewById(R.id.userButton);
        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuserlogin();
            }
        });
    }
    public void openpsilogin(){
        Intent intent = new Intent(this, psilogin.class);
        startActivity(intent);
    }
    public void openuserlogin(){
        Intent intent = new Intent(this, userlogin.class);
        startActivity(intent);
    }
}