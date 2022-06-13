package com.technic.myapplication;

import android.os.AsyncTask;
import android.os.Environment;

import java.io.File;
import java.io.IOException;

public class DownloadPdf extends AsyncTask<String, Void, Void> {
    @Override
    protected Void doInBackground(String... strings) {
        String fileUrl = strings[0];
        String fileName = strings[1];

        //Getting reference from diff storage
        String exStorageDir = Environment.getExternalStorageDirectory().toString();

        //File location
        File folder = new File(exStorageDir, "PDF DOWNLOAD");
        folder.mkdir();

        File pdfFile = new File(folder, fileName);

        try {
            pdfFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //File Downloader

        FileDownloader.downloadFile(fileUrl, pdfFile);
        return null;
    }
}
