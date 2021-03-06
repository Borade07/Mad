package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionbankActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_questionbank);
        b1 = findViewById(R.id.qb1);
        b2 = findViewById(R.id.qb2);
        b3 = findViewById(R.id.qb3);
        b4 = findViewById(R.id.qb4);
        b5 = findViewById(R.id.qb5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionbankActivity.this,QuestionBankAll.class);
                intent.putExtra("questionBank",1);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionbankActivity.this,QuestionBankAll.class);
                intent.putExtra("questionBank",2);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionbankActivity.this,QuestionBankAll.class);
                intent.putExtra("questionBank",3);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionbankActivity.this,QuestionBankAll.class);
                intent.putExtra("questionBank",4);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionbankActivity.this,QuestionBankAll.class);
                intent.putExtra("questionBank",5);
                startActivity(intent);
            }
        });

    }
}