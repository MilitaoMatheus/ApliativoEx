package com.example.exerciciospam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Btnir1;
    Button Btnir2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btnir1 = (Button) findViewById(R.id.btnEx1);
        Btnir2 = (Button) findViewById(R.id.btnEx5);
    }

    public void Btnir1(View view) {
        Intent ex1 = new Intent(this, Exercicio1.class);
        startActivity(ex1);
    }

    public void Btnir2(View view) {
        Intent ex2 = new Intent(this, exercicio6.class);
        startActivity(ex2);
    }
}