package com.exam_pxtomm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RectDraw rectView = new RectDraw(this);
        setContentView(rectView);
    }
}