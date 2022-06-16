package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class PptActivity extends AppCompatActivity {

   /* Button viewPDF_btn;
    StorageReference storageReference;
    DatabaseReference databaseReference;*/
    Button b1,b2,b3,b4,b5,b6;
   /* ListView listView;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);

       b1= findViewById(R.id.unit1);
       b2= findViewById(R.id.unit2);
       b3= findViewById(R.id.unit3);
       b4= findViewById(R.id.unit4);
       b5= findViewById(R.id.unit5);
       b6= findViewById(R.id.unit6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PptActivity.this,unit1Activity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PptActivity.this,Unit2Activity.class);
                startActivity(intent);
            }
        });b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PptActivity.this,Unit3Activity.class);
                startActivity(intent);
            }
        });b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PptActivity.this,Unit4Activity.class);
                startActivity(intent);
            }
        });b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PptActivity.this,Unit5Activity.class);
                startActivity(intent);
            }
        });b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PptActivity.this,Unit6Activity.class);
                startActivity(intent);
            }
        });




    }

}