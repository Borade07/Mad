package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class QuestionBankAll extends AppCompatActivity {
    int qNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_bank_all);

        qNo = getIntent().getExtras().getInt("questionBank");
        PDFView pdfView= findViewById(R.id.allquestion);

        if (qNo==1) {
            pdfView.fromAsset("q1.pdf").load();
        }else if(qNo==2){
            pdfView.fromAsset("q2.pdf").load();
        }
        else if(qNo==3){
            pdfView.fromAsset("q1.pdf").load();
        }
        else if(qNo==4){
            pdfView.fromAsset("q2.pdf").load();

        }
        else if(qNo==5){
            pdfView.fromAsset("q1.pdf").load();
        }
    }
}