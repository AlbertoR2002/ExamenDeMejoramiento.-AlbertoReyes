package com.example.examendemejoramiento_albertoreyes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLado;
    private TextView textViewArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLado = findViewById(R.id.editTextLado);
        textViewArea = findViewById(R.id.textViewArea);
    }

    public void calcularArea(View view){
        try {
            String ladoString = editTextLado.getText().toString();
            if (ladoString.isEmpty()) {
                Toast.makeText(this, "Por favor, introduce un valor para el lado del cuadrado.", Toast.LENGTH_SHORT).show();
                return;
            }
            double lado = Double.parseDouble(ladoString);
            if (lado <= 0) {
                Toast.makeText(this, "El lado del cuadrado debe ser un número positivo.", Toast.LENGTH_SHORT).show();
                return;
            }

            double area = lado * lado;
            textViewArea.setText("El área es: " + area);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Error al convertir el valor del lado del cuadrado.", Toast.LENGTH_SHORT).show();
        }
    }
}