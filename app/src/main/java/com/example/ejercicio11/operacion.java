package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class operacion extends AppCompatActivity {

    EditText txtsuma, resultados;

    Button btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion);

        txtsuma = (EditText) findViewById(R.id.txtsuma);
        resultados = (EditText) findViewById(R.id.resultado);

        btnreg = (Button) findViewById(R.id.btnreg);

        //SUMA DE LOS NUMEROS
        Intent intent = getIntent();
        Integer resultado = intent.getIntExtra("resultado", 0);

        Intent intentS = getIntent();
        String suma = intentS.getStringExtra("suma");

        //RESTA DE LOS NUMEROS
        Intent intentdesc = getIntent();
        Integer resta = intentdesc.getIntExtra("resta", 0);

        Intent intenttxtres = getIntent();
        String desc = intenttxtres.getStringExtra("desc");

        //DIVISION DE LOS NUMEROS
        Intent intentdivision = getIntent();
        Double division = intentdivision.getDoubleExtra("division", 0.0);

        Intent intentinfdivision = getIntent();
        String infdivision = intentinfdivision.getStringExtra("infdivision");

        //MULTIPLICACION DE LOS NUMEROS
        Intent intentmult = getIntent();
        Integer multiplicar = intentmult.getIntExtra("multiplicacion", 0);

        Intent intentinfoM = getIntent();
        String infomultiplicacion = intentinfoM.getStringExtra("infomulti");

        if (resultado != null && suma != null) {
            // Ejecutar acciones relacionadas con suma y su informacion
            resultados.setText("" + resultado);
            txtsuma.setText(suma);
        } else if (resta != null && desc != null) {
            // Ejecutar acciones relacionadas con resta y su informacion
            resultados.setText("" + resta);
            txtsuma.setText(desc);
        } else if (division != null && infdivision != null) {
            // Ejecutar acciones relacionadas con division y su informacion
            resultados.setText("" + division);
            txtsuma.setText(infdivision);
        } else if (multiplicar != null && infomultiplicacion != null) {
            // Ejecutar acciones relacionadas con Multiplicacion y su informacion
            resultados.setText("" + multiplicar);
            txtsuma.setText(infomultiplicacion);
        }


        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreg = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentreg);
            }
        });



    }
}