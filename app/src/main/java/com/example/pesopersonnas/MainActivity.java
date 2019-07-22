package com.example.pesopersonnas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText et_nombre,et_apellido,et_escuela,et_edad,et_estatura;
      int peso_hombre=0,peso_ideal=0,contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_nombre=(EditText)findViewById(R.id.nombre_et);
        et_apellido=(EditText)findViewById(R.id.apellido_et);
        et_escuela=(EditText)findViewById(R.id.escuela_et);
        et_edad=(EditText)findViewById(R.id.edad_et);
        et_estatura=(EditText)findViewById(R.id.estatura_et);

    }



    public void me_masculino(View hombre){
        float estatura=(Float.parseFloat(et_estatura.getText().toString()))*100;

            //  peso_hombre=(int)estatura;
             // peso_ideal=peso_hombre-110;
        peso_ideal=(int)estatura-110;

    }
    public void me_femenino(View mujer){
          // -120
        float estatura=(Float.parseFloat(et_estatura.getText().toString()))*100;
        peso_ideal=(int)estatura-120;

    }

    public void calcular(View metodo) {

        int edad = Integer.parseInt(et_edad.getText().toString()), sumaEdad = 0;
        String nombre = "", apellido, escuela = "";

        nombre = et_nombre.getText().toString();
        apellido = et_apellido.getText().toString();
        escuela = et_escuela.getText().toString();

        sumaEdad = 2019 - edad;

        Toast.makeText(this, "Hola " + nombre + " " + apellido + " de la escuela " + escuela + " Naciste en el año " + sumaEdad + " aproximadamente y tu peso ideal es de " + peso_ideal, Toast.LENGTH_LONG).show();




    }
    public void borrar(View borrar){
        contador++;
        et_nombre.setText("");
        et_apellido.setText("");
        et_edad.setText("");
        et_escuela.setText("");
        et_estatura.setText("");
    }
}
