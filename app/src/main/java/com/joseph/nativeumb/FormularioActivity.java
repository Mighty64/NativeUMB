package com.joseph.nativeumb;
// FormularioActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {

    private EditText editTextNombre, editTextApellido, editTextEdad;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextEdad = findViewById(R.id.editTextEdad);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener datos del formulario
                String nombre = editTextNombre.getText().toString();
                String apellido = editTextApellido.getText().toString();
                String edad = editTextEdad.getText().toString();

                // Enviar datos a la actividad de mostrar información
                Intent intent = new Intent(FormularioActivity.this, MostrarInfoActivity.class);
                intent.putExtra("NOMBRE", nombre);
                intent.putExtra("APELLIDO", apellido);
                intent.putExtra("EDAD", edad);
                startActivity(intent);
            }
        });
    }
}
