package com.example.mathias.imcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IMCResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcresultado);

        Bundle mochila = getIntent().getExtras();
        double altura = mochila.getDouble("altura");
        double peso = mochila.getDouble("peso");

        double imc = peso/(altura*altura);
        String classificacao = "";
        if(imc < 16 ){
            classificacao="Classificação: Magreza grave";
        }else if(imc > 16 && imc < 17){
            classificacao="Classificação: Magreza moderada";
        }else if(imc > 17 && imc < 18.5){
            classificacao="Classificação: Magreza leve";
        }else if(imc > 18.5 && imc < 25){
            classificacao="Classificação: Saudável";
        }else if(imc > 25 && imc < 30){
            classificacao="Classificação: Sobrepeso";
        }else if(imc > 30 && imc < 35){
            classificacao="Classificação: Obesidade Grau I";
        }else if(imc > 35 && imc < 40){
            classificacao="Classificação: Obesidade Grau II (severa)";
        }else
            classificacao="Classificação: Obesidade Grau III (mórbida)";


        TextView resultado = (TextView) findViewById(R.id.tvResultado);
        resultado.setText("Resultado = "+imc+"\n"+classificacao);



    }
}
