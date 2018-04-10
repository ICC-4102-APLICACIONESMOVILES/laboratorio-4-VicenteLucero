package com.example.gamma.lab04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.gamma.aplicacion.R;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void Ingresa(View view)
    {
        Intent i = new Intent(this, IniciarSesion.class);
        startActivity(i);
    }
}
