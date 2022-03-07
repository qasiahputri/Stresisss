package com.example.stresis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class userlogin extends AppCompatActivity {
    private Button butdaftar, butlogin;
    private EditText editnama, editpw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        butdaftar = (Button) findViewById(R.id.userdaftarb);
        editnama = (EditText) findViewById(R.id.nama);
        editpw = (EditText) findViewById(R.id.pw);
        butlogin = findViewById(R.id.masuk);

        butdaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuserdaftar();

            }
        });
        butlogin.setOnClickListener(view -> {
            if(editnama.getText().length()>0 && editpw.getText().length()>0){
                login(editnama.getText().toString(), editpw.getText().toString());

            } else{
                Toast.makeText(getApplicationContext(), "Silahkan isi Nama dan pasword yang didaftarkan", Toast.LENGTH_SHORT).show();
            }

        });




    }

    public void openuserdaftar() {
        Intent intent = new Intent(this, userdaftar.class);
        startActivity(intent);
    }
    private void login(String nama, String password){

    }
}