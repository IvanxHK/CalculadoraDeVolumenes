package com.example.calculadoravolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    RadioButton btnNo;
    RadioButton btnSi;
    RadioGroup rG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btnNo = (RadioButton) findViewById(R.id.btnNo);
        btnSi =  (RadioButton) findViewById(R.id.btnSi);
        rG = (RadioGroup) findViewById(R.id.rG);

    }
    public void seleccionNo(View view){
        if(btnNo.isChecked()==true){
            Toast.makeText(this, "La mejoraré, gracias", Toast.LENGTH_LONG).show();
    }}
    public void seleccionSi(View view){
            if(btnSi.isChecked()==true){
                Toast.makeText(this, "Gracias", Toast.LENGTH_LONG).show();
        }}
    public void atras(View view){
        finish();
        super.onBackPressed();
    }
}