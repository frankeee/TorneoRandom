package com.example.torneorandom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getNombres(View view){
        Intent intento = new Intent(this,viewSemis.class);
        EditText editor = (EditText) findViewById(R.id.name1);
        String message = editor.getText().toString();
        intento.putExtra("EXTRA_MESSAGE",message);

        EditText editor2 = (EditText) findViewById(R.id.name2);
        String message2 = editor2.getText().toString();
        intento.putExtra("EXTRA_MESSAGE2",message2);

        EditText editor3 = (EditText) findViewById(R.id.name3);
        String message3 = editor3.getText().toString();
        intento.putExtra("EXTRA_MESSAGE3",message3);

        EditText editor4 = (EditText) findViewById(R.id.name4);
        String message4 = editor4.getText().toString();
        intento.putExtra("EXTRA_MESSAGE4",message4);

        startActivity(intento);





    }
}
