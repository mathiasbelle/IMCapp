package com.example.mathias.imcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IMCDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcdados);
    }

    public void clicouCalculo(View quemClicou){
        Intent intencao = new Intent(this, IMCResultado.class);
        EditText etAltura = (EditText) findViewById(R.id.etAltura);
        EditText etPeso = (EditText) findViewById(R.id.etPeso);
        double altura = Double.parseDouble(etAltura.getText().toString());
        double peso = Double.parseDouble(etPeso.getText().toString());

        Bundle mochila = new Bundle(getClassLoader());
        mochila.putDouble("altura", altura);
        mochila.putDouble("peso", peso);
        intencao.putExtras(mochila);
        startActivity(intencao);

    }

}
