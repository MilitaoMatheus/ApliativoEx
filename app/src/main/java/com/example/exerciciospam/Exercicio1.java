package com.example.exerciciospam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio1 extends AppCompatActivity {

    private EditText num1, num2, resultado;
    Button btncalcula;
    Button BtnVoltar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        btncalcula = (Button) findViewById(R.id.btncalcula);
        BtnVoltar = (Button) findViewById(R.id.btnvoltar);
        resultado = (EditText) findViewById(R.id.txtresult);

        btncalcula.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());

                if(n1 % n2 == 0 || n2 % n1 == 0){
                    resultado.setText("São múltiplos");
                } else{
                    resultado.setText("Não São múltiplos");
                }
            }
        });
    }

    public void BtnVoltar (View view) {
        Intent initial = new Intent(this, MainActivity.class);
        startActivity(initial);
    }
}