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

public class Quiz7Activity extends AppCompatActivity {
    private TextView questionTV, questionNumberTV;
    private Button option1Btn, option2Btn, option3Btn, option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentScore = 0, questionAttemted = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);

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
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())) {
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
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())) {
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
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())) {
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
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionAttemted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });


    }

    private void showBottomSheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Quiz7Activity.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet, (LinearLayout) findViewById(R.id.idLLScore));
        TextView scoreTV = bottomSheetView.findViewById(R.id.idTVScore);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.idBtnRestart);
        scoreTV.setText("Your Score is \n" + currentScore + "/10");
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
                questionAttemted = 1;
                currentScore = 0;
                bottomSheetDialog.dismiss();

            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void setDataToViews(int currentPos) {
        questionNumberTV.setText("Questions Attempted :" + questionAttemted + "/10");
        if (questionAttemted == 10) {
            showBottomSheet();
        } else {

            questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());

        }

    }

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {


        quizModalArrayList.add(new QuizModal("Is it possible to have an activity without UI to perform action/actions", "Not possible", "Wrong question", "Yes, it is possible", "None of the above", "Yes, it is possible"));

        quizModalArrayList.add(new QuizModal(" What are the layouts available in android", "Linear Layout", "Frame Layout", "Table Layout", "All of above", "All of above"));

        quizModalArrayList.add(new QuizModal("On which thread broadcast receivers will work in android", " Worker Thread", "Main Thread", " Activity Thread", "None of the Above", "Main Thread"));

        quizModalArrayList.add(new QuizModal("How to access the context in android content provider", "Using getContext() in onCreate()", "Using intent()", " Using getApplicationContext() at anywhere in an application", " A & C", " A & C"));

        quizModalArrayList.add(new QuizModal("Which permissions are required to get a location in android", " ACCESS_FINE and ACCESS_COARSE", " GPRS permission", " Internet permission", "WIFI permission", " ACCESS_FINE and ACCESS_COARSE"));

        quizModalArrayList.add(new QuizModal("WHich method is used to find GPS enabled or disabled pro-grammatically in android", "finish()", " getGPSStatus()", " onProviderDisable()", "getGPS()", " onProviderDisable()"));

        quizModalArrayList.add(new QuizModal("What is the library of Map View in android", " com.map", "com.goggle.gogglemaps", "in.maps", "com.goggle.android.maps", "com.goggle.android.maps"));

        quizModalArrayList.add(new QuizModal(" What is the JSON exception in android", "JSon Exception", "Json Not found exception", "Input not found exception", " None of the above", "JSon Exception"));

        quizModalArrayList.add(new QuizModal("Why don't we give MIN SDK as 1 in android", "Android deprecated version", "There is no value for 1", " Android doesn't allow min version 1", "None of the above", "Android deprecated version"));


        quizModalArrayList.add(new QuizModal(" Can a class be immutable in android", " No, it can't", "Yes, Class can be immutable", " Can't make the class as final class", " None of the above", " Yes, Class can be immutable"));


    }
}