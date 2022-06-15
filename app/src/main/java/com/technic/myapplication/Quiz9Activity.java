package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class Quiz9Activity extends AppCompatActivity {
    private TextView questionTV,questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentScore = 0,questionAttemted = 1,currentPos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz9);
        questionTV = findViewById(R.id.idTVQuestion);
        questionNumberTV = findViewById(R.id.idTVQuestionAttempted);
        option1Btn = findViewById(R.id.idBtnOption1);
        option2Btn = findViewById(R.id.idBtnOption2);
        option3Btn = findViewById(R.id.idBtnOption3);
        option4Btn = findViewById(R.id.idBtnOption4);

        quizModalArrayList = new ArrayList<>();
        random = new Random();

        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToViews(currentPos);
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttemted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttemted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);



            }
        });

        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttemted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });

        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttemted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });


    }
    private void showBottomSheet(){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Quiz9Activity.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        TextView scoreTV = bottomSheetView.findViewById(R.id.idTVScore);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.idBtnRestart);
        scoreTV.setText("Your Score is \n"+currentScore + "/10");
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
                questionAttemted =1;
                currentScore = 0;
                bottomSheetDialog.dismiss();

            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void setDataToViews(int currentPos){
        questionNumberTV.setText("Questions Attempted :"+questionAttemted +"/10");
        if(questionAttemted == 10){
            showBottomSheet();
        }
        else  {

            questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());

        }

    }

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList ) {


        quizModalArrayList.add(new QuizModal("What was Google’s main business motivation for supporting Android", "To level the playing field for mobile devices", "To directly compete with the iPhone", "To corner the mobile device application market for licensing purposes", "To allow them to advertise more", "To allow them to advertise more"));


        quizModalArrayList.add(new QuizModal("What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource XML", "findViewByReference(int id)", "findViewById(int id)", "findViewById(String id)", "retrieveResourceById(int id)", "findViewById(String id)"));


        quizModalArrayList.add(new QuizModal(" First fully 64 bit compatible version of android is", "Gingerbread", "Android 5.0 Lollipop", "Android 1.6 Donut", "Android Jelly Bean", "Android 5.0 Lollipop"));


        quizModalArrayList.add(new QuizModal("What does the Android project folder “res/” contain", "Resource files", "Libraries", "Java source code", "Java Activity classes", "Resource files"));


        quizModalArrayList.add(new QuizModal("What method you should override to use Android menu system", "onCreateOptionsMenu()", "onCreateMenu()", "onMenuCreated()", "onCreateContextMenu()", "onCreateOptionsMenu()"));


        quizModalArrayList.add(new QuizModal("What does the following line of code achieve", "Starts an activity", "Creates an implicit Intent", "Creates a hidden Intent", "Create an explicit Intent", "Create an explicit Intent"));


        quizModalArrayList.add(new QuizModal("Select a component which is NOT part of Android architecture", "Android Framework", "Libraries", "Android Document", "Linux Kernel", "Android Document"));


        quizModalArrayList.add(new QuizModal("What is contained within the manifest xml file", "The permission that app requires", "The list of string used in the app", "The source code", "All other choices", "The permission that app requires"));


        quizModalArrayList.add(new QuizModal("Which among the following are part of Application layer of Android Architecture", "Contacts", "Browser", "facebook", "All of these", "All of these"));


        quizModalArrayList.add(new QuizModal("Which of the following is NOT a valid usage for Intents", "Activate a SQLite DB Connection", "Activate a Broadcast receiver", "Activate a Service", "Activate and Activity", "Activate a SQLite DB Connection"));


        quizModalArrayList.add(new QuizModal("In Which Directory XML Layout Files Are Stored", "/assets", "/res/layout", "/res/values", "/src", "/res/layout"));

    }
}