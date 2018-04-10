package com.example.gamma.lab04;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gamma.aplicacion.R;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public int Comprobar_Datos(String a, String b)
    {
        SharedPreferences Dato = getSharedPreferences("Usuarios", Context.MODE_PRIVATE);
        String Email = Dato.getString("Email", a);
        String Password = Dato.getString("Password", b);
        if(Email != null || Password != null)
        {
            return 0;
        }
        else
        {
            return 1;
        }

    }

    public void Registrar(View view)
    {
        Intent c = new Intent(this, SlideMenu.class);
        EditText mail = findViewById(R.id.EmailContent);
        String Email = mail.getText().toString();
        EditText pass = findViewById(R.id.PassContent);
        String password = pass.getText().toString();

        SharedPreferences mSharedPreferences;
        mSharedPreferences = getSharedPreferences("Usuarios", Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = mSharedPreferences.edit();
        mEditor.putString("Email", Email);
        mEditor.putString("Password", password);
        mEditor.commit();

        Context context = getApplicationContext();
        CharSequence text = "Registro de Credenciales e Ingreso exitosos";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        startActivity(c);


    }

    public void Conectar(View view)
    {
        Intent b = new Intent(this, SlideMenu.class);
        EditText mail = findViewById(R.id.EmailContent);
        String Email = mail.getText().toString();
        EditText pass = findViewById(R.id.PassContent);
        String password = pass.getText().toString();
        int a = Email.indexOf("@");
        if (a != -1)
        {
            int Exist = Comprobar_Datos(Email, password);
            if(Exist==0)
            {
                Context context = getApplicationContext();
                CharSequence text = "Credenciales no existentes";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            else
            {
                Context context = getApplicationContext();
                CharSequence text = "Ingresado con exito";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                startActivity(b);

            }

        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Credenciales Erroneas";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }


}
