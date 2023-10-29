package com.joseph.nativeumb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private TextView linkTextView;
    private EditText editTextIrA;
    private Button btnEnviar;

    private TextView LinkMensajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);

        linkTextView = findViewById(R.id.linkTextView);

        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrir WebView al hacer clic en el enlace
                Intent intent = new Intent(MainActivity.this, webview_Activity.class);
                intent.putExtra("MiURL", "umb.edu.co");
                startActivity(intent);
            }
        });

        editTextIrA = findViewById(R.id.editTextIrA);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrir WebView al hacer clic en el enlace

                String miURL = editTextIrA.getText().toString();

                Intent intent = new Intent(MainActivity.this, webview_Activity.class);
                intent.putExtra("MiURL", miURL);
                startActivity(intent);
            }
        });

        LinkMensajes=findViewById(R.id.LinkMensajes);

        LinkMensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
                startActivity(intent);
            }
        });

    }
}