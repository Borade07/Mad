package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HandoutsActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handouts);

        b1= findViewById(R.id.ass1);
        b2= findViewById(R.id.ass2);
        b3= findViewById(R.id.ass3);
        b4= findViewById(R.id.ass4);
        b5= findViewById(R.id.ass5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HandoutsActivity.this,Ass1Activity.class);
                startActivity(intent);
            }
        });

    }
}