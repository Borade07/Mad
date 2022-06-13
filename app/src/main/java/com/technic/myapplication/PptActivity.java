package com.technic.myapplication;

import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class PptActivity extends AppCompatActivity {

    PDFView pdfView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);

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
        new DownloadPdf().execute("http://maven.apache.org/archives/maven-1.x.pdf", "maven.pdf");
    }

    public void ViewPDF(){
        File pdfFile = new File(Environment.getExternalStorageDirectory() + "/PDF DOWNLOAD/" + "maven.pdf");

        Uri path = Uri.fromFile(pdfFile);

        pdfView.fromFile(pdfFile).load();
    }
}