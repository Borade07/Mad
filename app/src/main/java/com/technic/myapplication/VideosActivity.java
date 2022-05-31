package com.technic.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class VideosActivity extends AppCompatActivity {
    Button yt1,yt2,yt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        yt1 = (Button) findViewById(R.id.v1);
        yt2 = (Button) findViewById(R.id.v2);
        yt3 = (Button) findViewById(R.id.v3);

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
    }
}