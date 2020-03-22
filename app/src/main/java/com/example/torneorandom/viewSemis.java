package com.example.torneorandom;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class viewSemis extends AppCompatActivity {

    int valorboton1 = 0;
    int valorboton2 = 0;
    int valorboton3 = 0;
    int valorboton4 = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_semis);

        Intent intentar = getIntent();
        String message = intentar.getStringExtra("EXTRA_MESSAGE");
        String message2 = intentar.getStringExtra("EXTRA_MESSAGE2");
        String message3 = intentar.getStringExtra("EXTRA_MESSAGE3");
        String message4 = intentar.getStringExtra("EXTRA_MESSAGE4");

        String[] listanombres = {message,message2,message3,message4};
        List<String> l = Arrays.asList(listanombres);
        Collections.shuffle(l);

        TextView nome1 =  findViewById(R.id.jugador1);
        nome1.setText(listanombres[0]);

        TextView nome2 = findViewById(R.id.jugador2);
        nome2.setText(listanombres[1]);

        TextView nome3 = findViewById(R.id.jugador3);
        nome3.setText(listanombres[2]);

        TextView nome4 = findViewById(R.id.jugador4);
        nome4.setText(listanombres[3]);

        final Button boton1 = (Button) findViewById(R.id.jugador1);
        final Button boton2 = (Button) findViewById(R.id.jugador2);
        final Button boton3 = (Button) findViewById(R.id.jugador3);
        final Button boton4 = (Button) findViewById(R.id.jugador4);



        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton1.setBackgroundColor(Color.BLUE);
                boton2.setBackgroundColor(Color.RED);
                valorboton1 = 1;
                valorboton2 = 0;
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton2.setBackgroundColor(Color.BLUE);
                boton1.setBackgroundColor(Color.RED);
                valorboton1 = 0;
                valorboton2 = 1;
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton3.setBackgroundColor(Color.BLUE);
                boton4.setBackgroundColor(Color.RED);
                valorboton3 = 1;
                valorboton4 = 0;
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton4.setBackgroundColor(Color.BLUE);
                boton3.setBackgroundColor(Color.RED);
                valorboton4 = 1;
                valorboton3 = 0;
            }
        });

    }




    public void getFinalistas(View view){
        Intent intento = new Intent(this,viewFinal.class);
        Button boton1 = (Button) findViewById(R.id.jugador1);
        Button boton2 = (Button) findViewById(R.id.jugador2);
        Button boton3 = (Button) findViewById(R.id.jugador3);
        Button boton4 = (Button) findViewById(R.id.jugador4);
        String nombre1 =boton1.getText().toString();
        if(valorboton1 == 1){
            intento.putExtra("EXTRA_MESSAGEFINALISTA1",nombre1);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPERDEDOR1", nombre1);
        }
        String nombre2 =boton2.getText().toString();
        if(valorboton2 == 1){
            intento.putExtra("EXTRA_MESSAGEFINALISTA1",nombre2);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPERDEDOR1", nombre2);
        }
        String nombre3 =boton3.getText().toString();
        if(valorboton3 == 1){
            intento.putExtra("EXTRA_MESSAGEFINALISTA2",nombre3);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPERDEDOR2", nombre3);
        }
        String nombre4 =boton4.getText().toString();
        if(valorboton4 == 1){
            intento.putExtra("EXTRA_MESSAGEFINALISTA2",nombre4);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPERDEDOR2", nombre4);
        }
        startActivity(intento);






    }










}
