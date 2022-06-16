package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {
    Button q1;
    Button q2;
    Button q3;
    Button q4;
    Button q5;
    Button q6;
    Button q7;
    Button q8;
    Button q9;
    Button q10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        q1 = (Button) findViewById(R.id.quiz1);
        q2 = (Button) findViewById(R.id.quiz2);
        q3 = (Button) findViewById(R.id.quiz3);
        q4 = (Button) findViewById(R.id.quiz4);
        q5 = (Button) findViewById(R.id.quiz5);
        q6 = (Button) findViewById(R.id.quiz6);
        q7 = (Button) findViewById(R.id.quiz7);
        q8 = (Button) findViewById(R.id.quiz8);
        q9 = (Button) findViewById(R.id.quiz9);
        q10 = (Button) findViewById(R.id.quiz10);

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz1Activity.class);
                intent.putExtra("quiz",1);
                startActivity(intent);
            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz2Activity.class);
                startActivity(intent);
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz3Activity.class);
                startActivity(intent);
            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz4Activity.class);
                startActivity(intent);
            }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz5Activity.class);
                startActivity(intent);
            }
        });
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz6Activity.class);
                startActivity(intent);
            }
        });
        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz7Activity.class);
                startActivity(intent);
            }
        });
        q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz8Activity.class);
                startActivity(intent);
            }
        });
        q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz9Activity.class);
                startActivity(intent);
            }
        });
        q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this,Quiz10Activity.class);
                startActivity(intent);
            }
        });


    }

}