package com.technic.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class VideosActivity extends AppCompatActivity {
    Button yt1,yt2,yt3,yt4,yt5,yt6,yt7,yt8,yt9,yt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        yt1 = (Button) findViewById(R.id.v1);
        yt2 = (Button) findViewById(R.id.v2);
        yt3 = (Button) findViewById(R.id.v3);
        yt4 = (Button) findViewById(R.id.v4);
        yt5 = (Button) findViewById(R.id.v5);
        yt6 = (Button) findViewById(R.id.v6);
        yt7 = (Button) findViewById(R.id.v7);
        yt8 = (Button) findViewById(R.id.v8);
        yt9 = (Button) findViewById(R.id.v9);
        yt10 = (Button) findViewById(R.id.v10);

        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt1Activity.class);
                startActivity(intent);
            }
        });

        yt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt2Activity.class);
                startActivity(intent);
            }
        });

        yt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt3Activity.class);
                startActivity(intent);
            }
        });

        yt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt4Activity.class);
                startActivity(intent);
            }
        });

        yt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt5Activity.class);
                startActivity(intent);
            }
        });

        yt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt6Activity.class);
                startActivity(intent);
            }
        });

        yt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt7Activity.class);
                startActivity(intent);
            }
        });

        yt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt8Activity.class);
                startActivity(intent);
            }
        });

        yt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,YtdbActivity.class);
                startActivity(intent);
            }
        });

        yt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VideosActivity.this,Yt10Activity.class);
                startActivity(intent);
            }
        });
    }
}