package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Q2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        PDFView pdfView= findViewById(R.id.vqb2);
//change name as pdf required
        pdfView.fromAsset("AI Assignment 2.pdf").load();

    }
}