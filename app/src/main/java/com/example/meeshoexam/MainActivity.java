package com.example.meeshoexam;

import static com.example.meeshoexam.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView l;
    TextView txtv;
    public static int[] Dress = {img1,img2,img3,img4,img5,img6,img7,img8};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = findViewById(R.id.l);
        txtv = findViewById(R.id.txtview);
    }
}