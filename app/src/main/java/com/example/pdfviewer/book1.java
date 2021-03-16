package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book1 extends AppCompatActivity {

    PDFView b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);


        b1=findViewById(R.id.pdfbook1);

        b1.fromAsset("book1.pdf").load();
    }
}