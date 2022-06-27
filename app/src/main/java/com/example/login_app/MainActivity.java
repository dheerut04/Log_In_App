package com.example.login_app;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private EditText ePass;
    private Button eLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.UN);
        ePass = findViewById(R.id.Pass);
        eLogin = findViewById(R.id.Btn);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inpName = eName.getText().toString();
                String inpPass = ePass.getText().toString();

                if(inpName.isEmpty() || inpPass.isEmpty()){
                    Toast.makeText(MainActivity.this, "Plese Enter All The Fields !", Toast.LENGTH_SHORT).show();
                }else{

                     Toast.makeText(MainActivity.this, "Login SuccessFull !", Toast.LENGTH_SHORT).show();

                     Intent intent = new Intent(MainActivity.this, HomePage.class);
                     startActivity(intent);
                }
            }
        });
    }
}