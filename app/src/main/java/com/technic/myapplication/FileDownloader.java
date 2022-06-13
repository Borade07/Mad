package com.technic.myapplication;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.security.PublicKey;

public class FileDownloader {
    private static final int MEGABYTE = 1024*1024;
    public static void downloadFile(String fileUrl, File directory){
        try {
            URL url = new URL(fileUrl);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.connect();

            //creating input stream
            InputStream inputStream = urlConnection.getInputStream();

            //Get Output stream
            FileOutputStream outputStream = new FileOutputStream(directory);

            int totalSize = urlConnection.getContentLength();

            byte[] buffer = new byte[MEGABYTE];
            int bufferLength = 0;

            //Writting the array bytes
            while ((bufferLength = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, bufferLength);
            }
            outputStream.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
