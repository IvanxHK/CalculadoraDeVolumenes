package com.example.calculadoravolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView resultadoCubo, cajaCubo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cajaCubo = findViewById(R.id.cajaCubo);
        resultadoCubo = findViewById(R.id.resultadoCubo);
    }

    public void volumenCuadrado(View view){
        Double a = Double.parseDouble(cajaCubo.getText().toString());
        Double b = (a*a*a)/1000;
        resultadoCubo.setText(b.toString()+" litros");
    }

    public void irACilindrica(View view){
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }

    public void atras(View view){
        finish();
        super.onBackPressed();
    }
}