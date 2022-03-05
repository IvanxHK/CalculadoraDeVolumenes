package com.example.calculadoravolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView resultado, cajaLargo, cajaAncho, cajaAlto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        cajaLargo = findViewById(R.id.cajaLargo);
        cajaAncho = findViewById(R.id.cajaAncho);
        cajaAlto = findViewById(R.id.cajaAlto);
        resultado = findViewById(R.id.resultado);
    }
    public void volumenPanoramico(View view){
        Double a = Double.parseDouble(cajaLargo.getText().toString());
        Double b = Double.parseDouble(cajaAncho.getText().toString());
        Double c = Double.parseDouble(cajaAlto.getText().toString());
        double f = (a/2);
        Double d =  (c*3.1416*(Math.pow(f,2))) / 2;
        Double g = a*b*c;
        Double e = ((d+g)/1000);;
        resultado.setText(e.toString()+" litros");
    }
    public void atras(View view){
        finish();
        super.onBackPressed();
    }
    public void irAOpinion(View view){
        Intent i = new Intent(this, MainActivity6.class);
        startActivity(i);
    }
    }
