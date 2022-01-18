package com.example.compito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    Button button;
    Spinner spnSpinner;
    EditText txtTitolo;
    GestoreBrano gb;
    String[] elencoGeneri = { "Rock", "Pop", "Dance", "Rap"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitolo =(EditText) findViewById(R.id.editText);
        button=(Button) findViewById(R.id.button);
        Spinner spnGenere = (Spinner) findViewById(R.id.spnGeneri);
        ArrayAdapter<String>(context_this, R.layout.support_simple_spinner_dropdown_item, elencoGeneri);
        spnGenere.setAdapter(spnGen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gb.addBrano();

            }
        });
    }
}
