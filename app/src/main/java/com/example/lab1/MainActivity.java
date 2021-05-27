package com.example.lab1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = findViewById(R.id.txt_resultado);

    }


    public void Sumar(View view){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;
        String result = String.valueOf(suma);
        tv1.setText(result);
    }

    public void siguiente(View view){
        Intent siguiente = new Intent(this, MainActivity2.class);
        siguiente.putExtra( "num1", et1.getText().toString());
        siguiente.putExtra( "num2", et2.getText().toString());

        startActivity(siguiente);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if(id == R.id.item1){
            Toast.makeText(this, "Sumar", Toast.LENGTH_SHORT).show();
            Intent sumar = new Intent(this, MainActivity.class);
            startActivity(sumar);
        }
        else if(id == R.id.item2){
            Toast.makeText(this, "Restar", Toast.LENGTH_SHORT).show();
            Intent restar = new Intent(this, MainActivity2.class);
            startActivity(restar);
        }
        return super.onOptionsItemSelected(item);
    }
}