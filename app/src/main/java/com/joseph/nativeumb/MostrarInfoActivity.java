package com.joseph.nativeumb;
// MostrarInfoActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MostrarInfoActivity extends AppCompatActivity {

    private TextView textViewNombre, textViewApellido, textViewEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);

        textViewNombre = findViewById(R.id.textViewNombre);
        textViewApellido = findViewById(R.id.textViewApellido);
        textViewEdad = findViewById(R.id.textViewEdad);

        // Obtener datos del intent
        Intent intent = getIntent();
        if (intent != null) {
            String nombre = intent.getStringExtra("NOMBRE");
            String apellido = intent.getStringExtra("APELLIDO");
            String edad = intent.getStringExtra("EDAD");

            // Mostrar datos en TextViews
            textViewNombre.setText("Nombre: " + nombre);
            textViewApellido.setText("Apellido: " + apellido);
            textViewEdad.setText("Edad: " + edad);
        }
    }
}
