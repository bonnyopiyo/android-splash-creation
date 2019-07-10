package com.example.htmlsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

WebView pageaYangu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pageaYangu = (WebView)findViewById(R.id.webYangu);
        WebSettings settings = pageaYangu.getSettings();
        settings.setJavaScriptEnabled(true);
        //pageaYangu.loadUrl("file:///android_asset/home.html");


        pageaYangu.loadUrl("htttps://www.emobilis.ac.ke");



    }
}
