package com.example.imagebuttom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para el Ernesto
    public void mensaje(View view){
        Toast.makeText(this, "La de Ernesto", Toast.LENGTH_SHORT).show();
    }

    //Metodo para el boton
    public void mensajeMano(View view){
        Toast.makeText(this, "Esto es una mano", Toast.LENGTH_SHORT).show();
    }
}