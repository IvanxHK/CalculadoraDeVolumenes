package com.example.calculadoravolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView cajaAltura, cajaRadio, resultadoCilindro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cajaAltura = findViewById(R.id.cajaAltura);
        cajaRadio = findViewById(R.id.cajaRadio);
        resultadoCilindro = findViewById(R.id.resultadoCilindro);
    }
    public void volumenCilindro(View view){
        Double a = Double.parseDouble(cajaAltura.getText().toString());
        Double b = Double.parseDouble(cajaRadio.getText().toString());
        Double c = ((a*3.1416*(b*b))/1000);
        resultadoCilindro.setText(c.toString()+" litros");
    }

    public void irAEsferica(View view){
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);
    }

    public void atras(View view){
        finish();
        super.onBackPressed();
    }
}