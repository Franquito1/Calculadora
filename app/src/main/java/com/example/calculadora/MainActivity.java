package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multi;
    private Button btn_div;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.RESPUESTA);

        edit_numero_uno =findViewById(R.id.NUMERO1);
        edit_numero_dos = findViewById(R.id.NUMERO2);


        btn_suma = findViewById(R.id.BOTON_SUMA);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               text_respuesta.setText( SUMA(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+" ");
            }
        });

        btn_resta = findViewById(R.id.BOTON_RESTA);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(RESTA(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_multi = findViewById(R.id.BOTON_MULTIPLICACION);
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(MULTIPLICACION(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_div = findViewById(R.id.BOTON_DIVISION);
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(DIVISION(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+" ");
            }
        });


    }

    public int SUMA (int a, int b){
        return a+b;
    }


    public int RESTA (int a, int b){
        return a-b;
    }

    public int MULTIPLICACION (int a, int b){
        return a*b;
    }

    public int DIVISION (int a, int b){
        int respuesta=0;
        if (b!=0){
            respuesta=a/b;
        }
        return a/b;
    }







}