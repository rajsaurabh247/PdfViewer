package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book2 extends AppCompatActivity {

    PDFView b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);

        b2=findViewById(R.id.pdfbook2);

        b2.fromAsset("book2.pdf").load();
    }
}