package com.joseph.nativeumb;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class webview_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_activity);

        WebView myWebView = findViewById(R.id.webviewumb);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Intent intent = getIntent();
        String MiURL = intent.getStringExtra("MiURL");

        myWebView.loadUrl("https://" + MiURL);
    }
}
