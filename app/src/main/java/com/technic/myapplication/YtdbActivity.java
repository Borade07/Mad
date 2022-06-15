package com.technic.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class YtdbActivity extends AppCompatActivity {

    Button yt90,yt91,yt92,yt93,yt94,yt95;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ytdb);

        yt90 = (Button) findViewById(R.id.v90);
        yt91 = (Button) findViewById(R.id.v91);
        yt92 = (Button) findViewById(R.id.v92);
        yt93 = (Button) findViewById(R.id.v93);
        yt94 = (Button) findViewById(R.id.v94);
        yt95 = (Button) findViewById(R.id.v95);

        yt90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YtdbActivity.this,Yt9Activity.class);
                startActivity(intent);
            }
        });

        yt91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YtdbActivity.this,Yt91Activity.class);
                startActivity(intent);
            }
        });

        yt92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YtdbActivity.this,Yt92Activity.class);
                startActivity(intent);
            }
        });

        yt93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YtdbActivity.this,Yt93Activity.class);
                startActivity(intent);
            }
        });

        yt94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YtdbActivity.this,Yt94Activity.class);
                startActivity(intent);
            }
        });

        yt95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YtdbActivity.this,Yt95Activity.class);
                startActivity(intent);
            }
        });
    }
}