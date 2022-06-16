package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Q1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        PDFView pdfView= findViewById(R.id.vqb1);
//change name as pdf required
        pdfView.fromAsset("AI Assignment 2.pdf").load();

    }
}