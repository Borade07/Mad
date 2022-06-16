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

public class QuizAll extends AppCompatActivity {
    private TextView questionTV,questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentScore = 0,questionAttemted = 1,currentPos;
    int qNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_all);

        questionTV = findViewById(R.id.idTVQuestion);
        questionNumberTV = findViewById(R.id.idTVQuestionAttempted);
        option1Btn = findViewById(R.id.idBtnOption1);
        option2Btn = findViewById(R.id.idBtnOption2);
        option3Btn = findViewById(R.id.idBtnOption3);
        option4Btn = findViewById(R.id.idBtnOption4);

        qNo = getIntent().getExtras().getInt("quiz");
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
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(QuizAll.this);
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

        if(qNo==1) {
            quizModalArrayList.add(new QuizModal("Which of the following virtual machine is used by the Android operating system?", "JVM", "Dalvik virtual machine", "Simple virtual machine", "None of the above", "Dalvik virtual machine"
            ));
            quizModalArrayList.add(new QuizModal("Under which of the following Android is licensed?", "OSS", "Sourceforge", "Apache/MIT", "None of the above", "Apache/MIT"));
            quizModalArrayList.add(new QuizModal("For which of the following Android is mainly developed?", "Servers", "Desktops", "Laptops", "Mobile devices", "Mobile devices"
            ));
            quizModalArrayList.add(new QuizModal("Which of the following is the first mobile phone released that ran the Android OS?", "HTC Hero", "Google gPhone", "T - Mobile G1", "None of the above", "T - Mobile G1"));
            quizModalArrayList.add(new QuizModal("Android is based on which of the following language?", "Java", "C++", "C", "None of the above", "Java"
            ));
            quizModalArrayList.add(new QuizModal("APK stands for -", "Android Phone Kit", "Android Page Kit", "Android Package Kit", "None of the above", "Android Package Kit"
            ));
            quizModalArrayList.add(new QuizModal("APK stands for -", "Android Phone Kit", "Android Page Kit", "Android Package Kit", "None of the above", "Android Package Kit"));
            quizModalArrayList.add(new QuizModal("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "quizModalArrayList.add(new QuizModal(Android Page Interface", " Application Programming Interface"));
            quizModalArrayList.add(new QuizModal("Which of the following converts Java byte code into Dalvik byte code?", "Dalvik converter", "Dex compiler", "Mobile interpretive compiler (MIC)", "None of the above", "Dex compiler"));
            quizModalArrayList.add(new QuizModal("How can we stop the services in android?", "By using the stopSelf() and stopService() method", "y using the finish() method", "By using system.exit() method", "None of the above", "By using the stopSelf() and stopService() method"));
            quizModalArrayList.add(new QuizModal("What is the parent class of all Activity widgets", "Layout", "ViewGroup", "View", "Widget", "View"));


            quizModalArrayList.add(new QuizModal("What is the name of the class used by Intent to store additional information", "Parcelable", "DataStore", "Extra", "Bundle", "Bundle"));


            quizModalArrayList.add(new QuizModal("While Java or Kotlin source files stored in ....", "/res/drawable", "/src", "/res/values", "/res/layout", "/src"));


            quizModalArrayList.add(new QuizModal("What year was the Open Handset Alliance announced", "2005", "2007", "2008", "2006", "2007"));


        }
        else if(qNo==2){

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
        else if(qNo==3){

            quizModalArrayList.add(new QuizModal("AAPT stands for -", "AAPT stands for -", "Android Asset Packaging Tool", "Android Action Packaging Tool", "None of the above", "Android Asset Packaging Tool"));

            quizModalArrayList.add(new QuizModal("NDK stands for -", "Native Development Kit", "New Development kit", "Native Design Kit", "None of the above", " Native Development Kit"));

            quizModalArrayList.add(new QuizModal("Which of the following is contained in the src folder?", "Which of the following is contained in the src folder?", "Java source code", "Manifest", "None of the above", "Java source code"));
            quizModalArrayList.add(new QuizModal("Which of the following method is used to handle what happens after clicking a button?", "onClick", "onCreate", "onSelect", "None of the above", " onClick"));

            quizModalArrayList.add(new QuizModal("Which of the following android component displays the part of an activity on screen?", "View", "Manifest", "Intent", "Fragment", "Fragment"));

            quizModalArrayList.add(new QuizModal("Which of the following is the parent class of Activity?", "context", "object", "contextThemeWrapper", "None of the above", "contextThemeWrapper"));

            quizModalArrayList.add(new QuizModal("Which of the following is the parent class of service?", "context", "object", "contextThemeWrapper", "contextWrapper", "contextWrapper"));

            quizModalArrayList.add(new QuizModal("OHA in android stands for -", "Open Health Academy", "Open Handset Alliance", "Open Handset Application", "Open Handset Association", " Open Handset Alliance"));

            quizModalArrayList.add(new QuizModal("In which of the following tab an error is shown?", "CPU", "Memory", "ADB Logs", "Logcat", "Logcat"));

            quizModalArrayList.add(new QuizModal(" In which year OHA (Open Handset Alliance) is announced?", "2005", "2007", "2006", "None of the above", "2007"));

        }else if(qNo==4)
        {

            quizModalArrayList.add(new QuizModal("Which of the following is the name of the Android version 1.5?", "Eclair", "Froyo", "Cupcake", "Donut", "Cupcake"));

            quizModalArrayList.add(new QuizModal("Which of the following is the name of the Android version 1.6?", "Eclair", "Froyo", "Cupcake", "Donut", "Donut"));

            quizModalArrayList.add(new QuizModal("Which of the following is the topmost layer of android architecture?", "System Libraries and Android Runtime", "Linux Kernel", "Applications", "Applications Framework", "Applications"));

            quizModalArrayList.add(new QuizModal("Which of the layer is below the topmost layer of android architecture?", "System Libraries and Android Runtime", "Linux Kernel", "Applications", "Applications Framework", "Applications Framework"));

            quizModalArrayList.add(new QuizModal("Which of the layer is the lowest layer of android architecture?", "System Libraries and Android Runtime", "Linux Kernel", "Applications", "Applications Framework", "Linux Kernel"));

            quizModalArrayList.add(new QuizModal("What is contained in manifest.xml?", "Source code", "List of strings used in the app", "Permission that the application requires", "None of the above", "Permission that the application requires"));

            quizModalArrayList.add(new QuizModal("Which of the following is not a state in the service lifecycle?", "Destroyed", "Start", "Paused", "Running", "Paused"));

            quizModalArrayList.add(new QuizModal("As an android programmer, which version of Android should we use as a minimum development target?", "Version 1.2 or version 1.3", "Version 1.0 or version 1.1", "Version 1.6 or version 2.0", "Version 2.3 or version 3.0", "Version 1.6 or version 2.0"));

            quizModalArrayList.add(new QuizModal("Which of the following is not a nickname of any android version?", "Donut", "Muffin", "Honeycomb", "Cupcake", "Muffin"));

            quizModalArrayList.add(new QuizModal("Which of the following is a dialog class in android?", "AlertDialog", "DatePicker Dialog", "ProgressDialog", "All of the above", "All of the above"));

        }
        else if(qNo==5)
        {
            quizModalArrayList.add(new QuizModal("In which state the activity is, if it is not in focus, but still visible on the screen?", "Stopped state", "Destroyed state", "Paused state", "Running state", "Paused state"));

            quizModalArrayList.add(new QuizModal("Which of the following is the built-in database of Android?", "SQLite", "MySQL", "Oracle", "None of the above", "SQLite"));

            quizModalArrayList.add(new QuizModal("Which of the following android version is named Jelly Bean?", "3.1", "2.1", "1.1", "4.1", "4.1"));

            quizModalArrayList.add(new QuizModal("Which of the following features are updated in Android 4.1(Jelly Bean)?", "User Interface", "Lock screen improvement", "New clock application", "All of the above", "All of the above"));

            quizModalArrayList.add(new QuizModal("Which of the following is the API level of Android version 5.0?", "21", "20", "11", "41", "21"));

            quizModalArrayList.add(new QuizModal("Is it true that There can be only one running activity at a given time", "True", "False", "May be", "Can't say", "True"));

            quizModalArrayList.add(new QuizModal("Which of the following android library provides access to the database?", "android.content", "android.database", "android.api", "None of the above", "android.database"));

            quizModalArrayList.add(new QuizModal("n Android studio, which of the following callback is called when an activity starts interacting with the user?", "onDestroy", "onDestroy", "onResume", "onStop", "onResume"));

            quizModalArrayList.add(new QuizModal("he sendStickybroadcast(intent) method in android is used to show that the intent is -", "Optional", "Prioritize", "Sticky", "None of the above", "Sticky"));

            quizModalArrayList.add(new QuizModal(" Which of the following class in android displays information for a short period of time and disappears after some time?", "toast class", "log class", "maketest class", "None of the above", "toast class"));


        }
        else if(qNo==6)
        {

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
        else if(qNo==7){


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
        else if(qNo==8)
        {


            quizModalArrayList.add(new QuizModal("Android Is Developed By", "Apple", "Microsoft", "Google", "Android Inc", "Android Inc"));


            quizModalArrayList.add(new QuizModal("Full Name of Android", "Both A & B", "Jelly Bean", "Android KitKat", "Key Lime Pie", "Both A & B"));


            quizModalArrayList.add(new QuizModal("Which Programming Language Is Used For Android Application Development", "NodeJs", "PHP", "Java", "JSX", "Java"));

            quizModalArrayList.add(new QuizModal("Android Web Browser is based on", "Chrome", "Open-source Webkit", "Safari", "Firefox", "Open-source Webkit"));

            quizModalArrayList.add(new QuizModal("ADB stands for", "Application Debug Bridge", "Android Debug Container", "Android Debug Bridge", "Android Dalvik Bridge", "Android Debug Bridge"));

            quizModalArrayList.add(new QuizModal("Which company developed android", "Apple", "Google", "Android Inc", "Nokia", "Android Inc"));


            quizModalArrayList.add(new QuizModal("Android is based on which kernel", "Linux", "Mac", "Windows", "Symbian", "Linux"));


            quizModalArrayList.add(new QuizModal("When did Google purchase Android", "2003", "2005", "2004", "2006", "2005"));

            quizModalArrayList.add(new QuizModal("What was the first phone released that ran the Android OS", "Google gphone", "T-Mobile G1C", "Motorola Droid", "HTC Hero", "T-Mobile G1C"));

            quizModalArrayList.add(new QuizModal("Which among these are NOT a part of Android’s native libraries", "Webkit", "Dalvik", "OpenGL", "SQLite", "Dalvik"));


        }
        else if(qNo==9){


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
        else if(qNo==10){

            quizModalArrayList.add(new QuizModal("The android library that provides access to UI pre-built elements such as buttons, lists, views etc. is", "android.text", "android.os", "android.view", "android.webkit", "android.webkit"));


            quizModalArrayList.add(new QuizModal(" What does the src folder contain", "Image and icon files", "XML resource files", "Java source code files", "The application manifest file", "Java source code files"));


            quizModalArrayList.add(new QuizModal("What is the latest Android", "Masmallow", "Pie", "Q", "Noughat", "Q"));


            quizModalArrayList.add(new QuizModal("Android is based on Linux for the following reason", "Security", "Portability", "Networking", "All of these", "All of these"));


            quizModalArrayList.add(new QuizModal("What is the name of the program that converts Java byte code into Dalvik byte code", "Android Interpretive Compiler (AIC)", "Dalvik Converter", "Dex compiler", "Mobile Interpretive Compiler (MIC)", "Dex compiler"));


            quizModalArrayList.add(new QuizModal("What does the .apk extension stands for", "Application package", "Application Program kit", "Android Proprietary kit", "Android Package", "Application package"));


            quizModalArrayList.add(new QuizModal("Which of the following AsyncTask methods is NOT executed on the UI thread", "onPreExecute()", "onPostExecute()", "publishProgress()", "onProgressUpdate()", "publishProgress()"));


            quizModalArrayList.add(new QuizModal(" Which of the following is a Java call-back method invoked when a view is clicked", "Detector", "OnTapListener", "OnClickDetector", "OnClickListener", "OnClickListener"));


            quizModalArrayList.add(new QuizModal("Which of the following Android View sub-classes uses the WebKit rendering engine to display", "web pages", "MapView", "WebView", "PageViewHttpClient", "WebView"));


            quizModalArrayList.add(new QuizModal("What is AAPT", "Android Asset Processing Tool", "Android Asset Providing Tool", "Android Asset Packaging Tool", "Android Asset Packaging Technique", "Android Asset Packaging Tool"));

        }
//

//

//

    }
}