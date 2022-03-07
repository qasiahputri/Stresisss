package com.example.stresis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.*
import com.google.firebase.auth.FirebaseAuth.*
import com.google.firebase.auth.FirebaseUser.*

public class userdaftar extends AppCompatActivity {
    private EditText editdnama, editdtgl, editdalamat, editdemail,editdpw;
    private Button butddaftar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdaftar);
        editdnama = (EditText) findViewById(R.id.dnama);
        editdtgl = (EditText) findViewById(R.id.dtgl);
        editdalamat = (EditText) findViewById(R.id.dalamat);
        editdemail = (EditText) findViewById(R.id.demail);
        editdpw = findViewById(R.id.dpw);
        mAuth = FirebaseAuth.getInstance();


        butddaftar.setOnClickListener(view -> {
            if (editdnama.getText().length()>0 && editdtgl.getText().length()>0 && editdalamat.getText().length()>0 && editdemail.getText().length()>0 && editdpw.getText().length()>0){
                register(editdnama.getText().toString(), editdtgl.getText().toString(), editdalamat.getText().toString(),editdemail.getText().toString(), editdpw.getText().toString());

            }else {
                Toast.makeText(getApplicationContext(), "Silahkan isi seluruh data dahulu", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void register(String dnama, String dtgl, String dalamat, String demail, String dpw){

    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            reload();
        }
    }

}