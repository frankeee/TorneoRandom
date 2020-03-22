package com.example.torneorandom;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class viewFinal extends AppCompatActivity {

    int valorboton1 = 0;
    int valorboton2 = 0;
    int valorboton3 = 0;
    int valorboton4 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_final);

        Intent intento = getIntent();
        String message = intento.getStringExtra("EXTRA_MESSAGEFINALISTA1");

        TextView textView = findViewById(R.id.final1);
        textView.setText(message);
        String message2 = intento.getStringExtra("EXTRA_MESSAGEFINALISTA2");

        TextView textView2 = findViewById(R.id.final2);
        textView2.setText(message2);

        String message3 = intento.getStringExtra("EXTRA_MESSAGEPERDEDOR1");

        TextView textView3 = findViewById(R.id.final3);
        textView3.setText(message3);

        String message4 = intento.getStringExtra("EXTRA_MESSAGEPERDEDOR2");

        TextView textView4 = findViewById(R.id.final4);
        textView4.setText(message4);

        final Button boton1 = (Button) findViewById(R.id.final1);
        final Button boton2 = (Button) findViewById(R.id.final2);
        final Button boton3 = (Button) findViewById(R.id.final3);
        final Button boton4 = (Button) findViewById(R.id.final4);


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

    public void getPosiciones(View view){
        Intent intento = new Intent(this,activityPosiciones.class);
        Button boton1 = (Button) findViewById(R.id.final1);
        Button boton2 = (Button) findViewById(R.id.final2);
        Button boton3 = (Button) findViewById(R.id.final3);
        Button boton4 = (Button) findViewById(R.id.final4);
        String nombre1 =boton1.getText().toString();
        if(valorboton1 == 1){
            intento.putExtra("EXTRA_MESSAGEPUESTO1",nombre1);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPUESTO2", nombre1);
        }
        String nombre2 =boton2.getText().toString();
        if(valorboton2 == 1){
            intento.putExtra("EXTRA_MESSAGEPUESTO1",nombre2);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPUESTO2", nombre2);
        }
        String nombre3 =boton3.getText().toString();
        if(valorboton3 == 1){
            intento.putExtra("EXTRA_MESSAGEPUESTO3",nombre3);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPUESTO4", nombre3);
        }
        String nombre4 =boton4.getText().toString();
        if(valorboton4 == 1){
            intento.putExtra("EXTRA_MESSAGEPUESTO3",nombre4);

        }
        else{
            intento.putExtra("EXTRA_MESSAGEPUESTO4", nombre4);
        }
        startActivity(intento);



    }
}
