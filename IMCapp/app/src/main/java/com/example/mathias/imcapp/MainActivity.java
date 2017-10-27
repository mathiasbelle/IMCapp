package com.example.mathias.imcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicouIMC(View quemClicou){
        Intent intencao = new Intent(this, IMCDados.class);
        startActivity(intencao);
    }

    public void clicouTabela(View quemClicou){
        Intent intencao = new Intent(this, TabelaResultados.class);
        startActivity(intencao);
    }
}
