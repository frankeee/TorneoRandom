package com.example.torneorandom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activityPosiciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posiciones);

        Intent intento = getIntent();
        String message = intento.getStringExtra("EXTRA_MESSAGEPUESTO1");

        TextView textView = findViewById(R.id.puesto1);
        textView.setText(message);
        String message2 = intento.getStringExtra("EXTRA_MESSAGEPUESTO2");

        TextView textView2 = findViewById(R.id.puesto2);
        textView2.setText(message2);

        String message3 = intento.getStringExtra("EXTRA_MESSAGEPUESTO3");

        TextView textView3 = findViewById(R.id.puesto3);
        textView3.setText(message3);

        String message4 = intento.getStringExtra("EXTRA_MESSAGEPUESTO4");

        TextView textView4 = findViewById(R.id.puesto4);
        textView4.setText(message4);
    }
}
