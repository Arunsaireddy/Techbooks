package com.aruns.techbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main2Activity extends AppCompatActivity {
    PDFView pdfView;

    //String pdfname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //pdfView=findViewById(R.id.pdf);
        // pdfView=findViewById(R.id.pdf);
        //pdfView.fromAsset("Java.pdf").load();
        pdfView = findViewById(R.id.pdf);
        Bundle b=getIntent().getExtras();
        String pos1=b.getString("position");
        int pos=Integer.parseInt(pos1);
        //Intent i=new Intent();
        //int pos=i.getIntExtra("position","null");
        switch (pos)
        {
            case 0:
                pdfView.fromAsset("Java.pdf").load();
                break;
            case 1:
                pdfView.fromAsset("Python.pdf").load();
                break;
            case 2:
                pdfView.fromAsset("CPP.pdf").load();
                break;
            case 3:
                pdfView.fromAsset("C.pdf").load();
                break;
            case 4:
                pdfView.fromAsset("PHP.pdf").load();
                break;
            case 5:
                pdfView.fromAsset("Android.pdf").load();
                break;
        }
    }
}
