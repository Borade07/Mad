package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AboutappActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutapp);
        PDFView pdfView= findViewById(R.id.aboutUS);
        pdfView.fromAsset("aboutUS.pdf").load();
    }
}