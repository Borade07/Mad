package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class HangoutAll extends AppCompatActivity {
    int qNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangout_all);

        qNo = getIntent().getExtras().getInt("handouts");
        PDFView pdfView= findViewById(R.id.hangall);
        if(qNo==1) {
            pdfView.fromAsset("Exp2.pdf").load();
        }
        else if(qNo==2){
            pdfView.fromAsset("Exp3.pdf").load();
        }

        else if(qNo==3){

            pdfView.fromAsset("Exp4.pdf").load();

        }

        else if(qNo==4){
            pdfView.fromAsset("Exp5.pdf").load();
        }

        else if(qNo==5){

            pdfView.fromAsset("Exp6.pdf").load();

        }

    }
}