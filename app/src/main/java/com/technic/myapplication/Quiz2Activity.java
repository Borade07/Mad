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

public class Quiz2Activity extends AppCompatActivity {


    private TextView questionTV,questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentScore = 0,questionAttemted = 1,currentPos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

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
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Quiz2Activity.this);
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

        quizModalArrayList.add(new QuizModal("What is an activity in android?", "android class", "android package", "A single screen in an application with supporting java code", "None of the above", "A single screen in an application with supporting java code"));

        quizModalArrayList.add(new QuizModal(" How can we kill an activity in android?", "Using finish() method", "Using finishActivity(int requestCode)", "Both (a) and (b)", "Neither (a) nor (b)", "(c) Both (a) and (b)"));

        quizModalArrayList.add(new QuizModal("ADB stands for -", "Android debug bridge", "Android delete bridge", "Android destroy bridge", "None of the above", " Android debug bridge"));

        quizModalArrayList.add(new QuizModal(" On which of the following, developers can test the application, during developing the android applications?", "Third-party emulators", "Emulator included in Android SDK", "Physical android phone", "All of the above", "All of the above"));

        quizModalArrayList.add(new QuizModal("Which of the following kernel is used in Android?", "MAC", "Windows", "Linux", "Redhat", "Linux"));

        quizModalArrayList.add(new QuizModal(" Which of the following is the first callback method that is invoked by the system during an activity life-cycle?", "onClick() method", "onCreate() method", "onStart() method", "onRestart() method", "onCreate() method"));

        quizModalArrayList.add(new QuizModal("Which of the following is not an activity lifecycle callback method", "onClick() method", "onCreate() method", "onStart() method", "onBackPressed() method", " onBackPressed() method"));

        quizModalArrayList.add(new QuizModal("We require an AVD to create an emulator. What does AVD stand for?", "Android Virtual device", "Android Virtual display", "Active Virtual display", "Active Virtual device", " Android Virtual device"));

        quizModalArrayList.add(new QuizModal("What is the use of content provider in Android?", "For storing the data in the database", "For sharing the data between applications", "For sending the data from an application to another application", "None of the above", "For sending the data from an application to another application"));

        quizModalArrayList.add(new QuizModal("Does android support other languages than java?", "Yes", "No", "May be", "Can't say", " Yes"));

        quizModalArrayList.add(new QuizModal("What is the difference between margin and padding in android layout", "Margin is specifying the extra space left on all four sides in layout", "Padding is used to offset the content of a view by specific px or dp", "Both A and B are correct", "None of the above", "Both A and B are correct"));


        quizModalArrayList.add(new QuizModal("During an activity life cycle, what is the first callback method invoked by the system", "onCreate()", "onStart()", "onPause()", "onStop()", "onCreate()"));


        quizModalArrayList.add(new QuizModal("What language used in Android Studio", "Java", "Android Studio", "HTML", "C#", "Java"));


        quizModalArrayList.add(new QuizModal("Sundar Pichai's father was as an______", "Computer engineer", "Software engineer", "Electrical engineer", "none of the above", "Electrical engineer"));


        quizModalArrayList.add(new QuizModal("A layout that defines the position for each view based on constraints to sibling views and the parent layout", "TextView", "Activity_main", "ConstraintLayout", "Pick a Resource", "ConstraintLayout"));

    }
}