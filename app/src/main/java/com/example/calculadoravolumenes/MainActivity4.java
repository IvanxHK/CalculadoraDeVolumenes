package com.example.calculadoravolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView resultadoEsfera, cajaRadioEsfera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        cajaRadioEsfera = findViewById(R.id.cajaRadioEsfera);
        resultadoEsfera = findViewById(R.id.resultadoEsfera);
    }
    public void volumenEsfera(View view){
        Double a = Double.parseDouble(cajaRadioEsfera.getText().toString());
        Double b = ((67/16)*Math.pow(a,3))/1000;
        resultadoEsfera.setText(b.toString()+" litros");
    }

    public void irAPanoramica(View view){
        Intent i = new Intent(this, MainActivity5.class);
        startActivity(i);
    }

    public void atras(View view){
        finish();
        super.onBackPressed();
    }
}