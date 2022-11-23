package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private EditText apPaterno;
    private EditText apMaterno;
    private EditText name;
    private EditText colonia;
    private EditText postal;
    private EditText calle;
    private EditText estado;
    private EditText municipio;
    private Button limpia;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apPaterno = (EditText) findViewById(R.id.apPaterno);
        apMaterno = (EditText) findViewById(R.id.apMaterno);
        name = (EditText) findViewById(R.id.name);
        colonia = (EditText) findViewById(R.id.colonia);
        postal = (EditText) findViewById(R.id.postal);
        calle = (EditText) findViewById(R.id.calle);
        estado = (EditText) findViewById(R.id.estado);
        municipio = (EditText) findViewById(R.id.municipio);
        limpia = (Button) findViewById(R.id.limpia);
        Info = (TextView) findViewById(R.id.Info);
    }

    public void Limpiar(View view) {
        apPaterno.setText("");
        apMaterno.setText("");
        name.setText("");
        colonia.setText("");
        postal.setText("");
        calle.setText("");
        estado.setText("");
        municipio.setText("");
        Info.setText("");
    }

    public void informacion(View view){
        String P, M, N, Col, Cod, Cal, Est, Mun;
        P = apPaterno.getText().toString();
        M = apMaterno.getText().toString();
        N = name.getText().toString();
        Col = colonia.getText().toString();
        Cod = postal.getText().toString();
        Cal = calle.getText().toString();
        Est = estado.getText().toString();
        Mun = municipio.getText().toString();
        Info.setText("Te llamas "+P+" "+M+" "+N+", vives en: "+Col+", "+Cod+", "+Cal+", "+Est+", "+Mun+" ");
    }
}