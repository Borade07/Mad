package com.technic.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);
<<<<<<< HEAD
=======

        pdfView = findViewById(R.id.pdfView);
        btn = findViewById(R.id.pdf);

        //downloading the file
        downloadPdfFronUrl();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPDF();
            }
        });

    }

    private void downloadPdfFronUrl(){
        new DownloadPdf().execute("https://www.tutorialspoint.com/android/android_tutorial.pdf", "maven.pdf");
    }

    public void ViewPDF(){
        File pdfFile = new File(Environment.getExternalStorageDirectory() + "/PDF DOWNLOAD/" + "maven.pdf");

        Uri path = Uri.fromFile(pdfFile);

        pdfView.fromFile(pdfFile).load();
>>>>>>> 7266b549de0fa95ab1f0d78e404d952a6816615b
    }
}