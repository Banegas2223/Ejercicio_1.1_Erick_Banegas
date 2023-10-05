package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;


    Button btnsuma, btnresta, btndivision, botonMultiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btndivision = (Button) findViewById(R.id.btndivision);
        botonMultiplicacion = (Button) findViewById(R.id.botonMultiplicacion);



        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1S = numero1.getText().toString();
                String num2S  = numero2.getText().toString();

                if (num1S.isEmpty() || num2S.isEmpty()) {
                    // Mostrar un mensaje de error si algún campo está vacío
                    Toast.makeText(MainActivity.this, "Por favor, completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(numero1.getText().toString());
                    int num2 = Integer.parseInt(numero2.getText().toString());
                    int resultado = num1 + num2;

                    String suma = "La suma de los números " + num1 + " + " + num2 + " es";

                    Intent intenttxt = new Intent(MainActivity.this, operacion.class);
                    intenttxt.putExtra("suma", suma);
                    intenttxt.putExtra("resultado", resultado);

                    startActivity(intenttxt);

                }
            }
        });


        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1S = numero1.getText().toString();
                String num2S  = numero2.getText().toString();

                if (num1S.isEmpty() || num2S.isEmpty()) {
                    // Mostrar un mensaje de error si algún campo está vacío
                    Toast.makeText(MainActivity.this, "Por favor, completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(numero1.getText().toString());
                    int num2 = Integer.parseInt(numero2.getText().toString());
                    int resta = num1 - num2;

                    String desc = "La resta de los números " + num1 + " - " + num2 + " es";

                    Intent intentres = new Intent(MainActivity.this, operacion.class);
                    intentres.putExtra("desc", desc);
                    intentres.putExtra("resta", resta);

                    startActivity(intentres);

                }

            }
        });


        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1S = numero1.getText().toString();
                String num2S  = numero2.getText().toString();

                if (num1S.isEmpty() || num2S.isEmpty()) {
                    // Mostrar un mensaje de error si algún campo está vacío
                    Toast.makeText(MainActivity.this, "Por favor, completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    Double num1 = Double.parseDouble(numero1.getText().toString());
                    Double num2 = Double.parseDouble(numero2.getText().toString());
                    Double division = num1 / num2;

                    String infdivision = "La división de los números " + num1 + " / " + num2 + " es";

                    Intent intentdiv = new Intent(MainActivity.this, operacion.class);
                    intentdiv.putExtra("infdivision", infdivision);
                    intentdiv.putExtra("division", division);

                    startActivity(intentdiv);

                }
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1S = numero1.getText().toString();
                String num2S  = numero2.getText().toString();

                if (num1S.isEmpty() || num2S.isEmpty()) {
                    // Mostrar un mensaje de error si algún campo está vacío
                    Toast.makeText(MainActivity.this, "Por favor, completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(numero1.getText().toString());
                    int num2 = Integer.parseInt(numero2.getText().toString());
                    int multiplicacion = num1 * num2;

                    String infomulti = "La Multiplicacón de los números " + num1 + " * " + num2 + " es";

                    Intent intentmult = new Intent(MainActivity.this, operacion.class);
                    intentmult.putExtra("infomulti", infomulti);
                    intentmult.putExtra("multiplicacion", multiplicacion);

                    startActivity(intentmult);

                }
            }
        });
    }
}