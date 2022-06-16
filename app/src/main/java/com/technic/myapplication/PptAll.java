package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PptAll extends AppCompatActivity {
    int qNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt_all);

        qNo = getIntent().getExtras().getInt("ppt");
        PDFView pdfView= findViewById(R.id.viewUnit1);
//change name as pdf required
        if (qNo==1) {
            pdfView.fromAsset("AI Assignment 2.pdf").load();
        }else if(qNo==2){
            pdfView.fromAsset("Amey Resume.pdf").load();
        }
        else if(qNo==3){
            pdfView.fromAsset("AI Assignment 2.pdf").load();
        }
        else if(qNo==4){
            pdfView.fromAsset("Amey Resume.pdf").load();

        }
        else if(qNo==5){
            pdfView.fromAsset("AI Assignment 2.pdf").load();
        }
        else if(qNo==6){
            pdfView.fromAsset("Amey Resume.pdf").load();

        }
    }
}