package com.example.exerciciospam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class exercicio6 extends AppCompatActivity {

    public double c, r, s, result;
    EditText NumC, NumR, NumS;
    public TextView total;
    Button btnvoltar2;
    Button btncalcula2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio6);

        NumC = (EditText) findViewById(R.id.txtRecebeC);
        NumR = (EditText) findViewById(R.id.txtrecebeR);
        NumS = (EditText) findViewById(R.id.txtrecebeS);
        total = (TextView) findViewById(R.id.txtTotal);
        btncalcula2 = (Button) findViewById(R.id.btncalcula2);
        btnvoltar2 = (Button) findViewById(R.id.btnvoltar2);

        c = 2.0;
        r = 2.5;
        s = 1.5;
    }

    public void Btncalcula2(View view){
        total.setText(String.valueOf(Calcular()));
    }

    private double Calcular() {
        double Numc = Integer.parseInt(NumC.getText().toString());
        double Numr = Integer.parseInt(NumR.getText().toString());
        double Nums = Integer.parseInt(NumS.getText().toString());
        result = (c * Numc) + (r * Numr) + (s * Nums);
        return result;
    }

    public void Voltar (View view) {
        Intent initial = new Intent(this, MainActivity.class);
        startActivity(initial);
    }
}
