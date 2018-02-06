package com.example.aula_a011.proyecto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numero1 = findViewById(R.id.editText);
        final EditText numero2 = findViewById(R.id. editText2);
        Button miboton = findViewById(R.id.button) ;
        final TextView respuesta = findViewById(R.id.textView) ;
        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(String.valueOf(Integer.valueOf(numero1.getText().toString())+Integer.valueOf(numero2.getText().toString())));
            }
        });

    }
}
