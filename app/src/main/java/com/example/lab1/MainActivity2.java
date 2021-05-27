package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = findViewById(R.id.txt_resultado);

        String num1 = getIntent().getStringExtra("num1");
        String num2 = getIntent().getStringExtra("num2");

        et1.setText(num1);
        et1.setText(num2);

    }


    public void Restar(View view){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 - num2;
        String result = String.valueOf(suma);
        tv1.setText(result);
    }

    public void atras(View view){
        Intent atras = new Intent(this, MainActivity.class);

        startActivity(atras);


    }
}