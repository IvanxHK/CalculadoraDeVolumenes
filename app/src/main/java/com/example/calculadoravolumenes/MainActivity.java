package com.example.calculadoravolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView res1, cajaA, cajaB, cajaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaA = findViewById(R.id.cajaA);
        cajaB = findViewById(R.id.cajaB);
        cajaC = findViewById(R.id.cajaC);
        res1 = findViewById(R.id.res1);
    }
    public void volumenTriangular(View view){
        Double a = Double.parseDouble(cajaA.getText().toString());
        Double b = Double.parseDouble(cajaB.getText().toString());
        Double c = Double.parseDouble(cajaC.getText().toString());
        Double d = ((a*b*c)/2)/1000;
        res1.setText(d.toString()+" litros");
    }
   public void irACuadrado(View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
   }
}