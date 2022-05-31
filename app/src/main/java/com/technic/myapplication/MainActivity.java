package com.technic.myapplication;

import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    GridLayout mainGrid;
    public CardView ppt, questionBank, programs, handouts, videos, quiz, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        ppt = (CardView) findViewById(R.id.ppt);
        questionBank = (CardView) findViewById(R.id.questionBank);
        programs = (CardView) findViewById(R.id.programs);
        handouts = (CardView) findViewById(R.id.handouts);
        videos = (CardView) findViewById(R.id.vidios);
        quiz = (CardView) findViewById(R.id.quiz);
        about = (CardView) findViewById(R.id.aboutApp);

        ppt.setOnClickListener(this);
        questionBank.setOnClickListener(this);
        programs.setOnClickListener(this);
        handouts.setOnClickListener(this);
        videos.setOnClickListener(this);
        quiz.setOnClickListener(this);
        about.setOnClickListener(this);

        //Set Event
//        setSingleEvent(mainGrid);

    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.ppt:
                intent = new Intent(this,PptActivity.class);
                startActivity(intent);
                break;

            case R.id.questionBank:
                intent = new Intent(this,QuestionbankActivity.class);
                startActivity(intent);
                break;

            case R.id.handouts:
                intent = new Intent(this,HandoutsActivity.class);
                startActivity(intent);
                break;

            case R.id.programs:
                intent = new Intent(this,ProgramsActivity.class);
                startActivity(intent);
                break;

            case R.id.vidios:
                intent = new Intent(this,VideosActivity.class);
                startActivity(intent);
                break;

            case R.id.quiz:
                intent = new Intent(this,QuizActivity.class);
                startActivity(intent);
                break;

            case R.id.aboutApp:
                intent = new Intent(this,AboutappActivity.class);
                startActivity(intent);
                break;
        }
    }
}
//
//    private void setToggleEvent(GridLayout mainGrid) {
//        //Loop all child item of Main Grid
//        for (int i = 0; i < mainGrid.getChildCount(); i++) {
//            //You can see , all child item is CardView , so we just cast object to CardView
//            final CardView cardView = (CardView) mainGrid.getChildAt(i);
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
//                        //Change background color
//                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
//                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();
//
//                    } else {
//                        //Change background color
//                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
//                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//        }
//    }
//
//    private void setSingleEvent(GridLayout mainGrid) {
//        //Loop all child item of Main Grid
//        for (int i = 0; i < mainGrid.getChildCount(); i++) {
//            //You can see , all child item is CardView , so we just cast object to CardView
//            CardView cardView = (CardView) mainGrid.getChildAt(i);
//            final int finalI = i;
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    Intent intent = new Intent(MainActivity.this,ActivityOne.class);
//                    intent.putExtra("info","This is activity from card item index  "+finalI);
//                    startActivity(intent);
//
//                }
//            });
//        }
//    }
//}
