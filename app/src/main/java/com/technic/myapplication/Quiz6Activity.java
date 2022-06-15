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

public class Quiz6Activity extends AppCompatActivity {
    private TextView questionTV,questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentScore = 0,questionAttemted = 1,currentPos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);

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
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Quiz6Activity.this);
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

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList ){
        quizModalArrayList.add(new QuizModal("Which of the following method in android is used to log debug messages?", "onStop() method", "stopService() method", "onDestroy() method", "stopSelf() method", " onDestroy() method"));

        quizModalArrayList.add(new QuizModal("Which of the following method in android is used to log debug messages?", "Log.r()", "Log.R()", "Log.d()", "Log.d()", "Log.d()"));

        quizModalArrayList.add(new QuizModal("ANR in android stands for -", "Application Not Reacting", "Application Not Reacting", "Application Not Rendering", "None of the above", "Application Not Responding"));

        quizModalArrayList.add(new QuizModal("All layout classes are the subclasses of -", "android.view.View", "android.view.ViewGroup", "android.widget", "None of the above", "android.view.ViewGroup"));

        quizModalArrayList.add(new QuizModal("Which of the following class in android executes the task asynchronously with your service?", "SyncTask", "AsyncTask", "Both of the above", "None of the above", "AsyncTask"));

        quizModalArrayList.add(new QuizModal("Which of the following layout in android arranges its children into rows and columns?", "RelativeLayout", "TableLayout", "FrameLayout", "None of the above", "TableLayout"));

        quizModalArrayList.add(new QuizModal("Which of the following layout in android aligns all children either vertically or horizontally?", "RelativeLayout", "TableLayout", "FrameLayout", "LinearLayout", " LinearLayout"));

        quizModalArrayList.add(new QuizModal("What is the default value of the orientation attribute in LinearLayout?", "Horizontal", "Vertical", "There is no default value of orientation attribute in LinearLayout", "None of the above", "Horizontal"));

        quizModalArrayList.add(new QuizModal("What is the nine-patch images tool in android?", "It is an image extension tool.", "It is used to change the bitmap images into nine sections", "Both (a) and (b)", "None of the above", "It is used to change the bitmap images into nine sections"));

        quizModalArrayList.add(new QuizModal("GCM in android stands for -", "Google Cloud Messaging", "Google Count Messaging", "Google Center Messaging", "None of the above", "Google Cloud Messaging"));
}
}