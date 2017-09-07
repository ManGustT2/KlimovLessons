package com.example.vadim.klimovlessons.view.lesson16;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class lessonSixteen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Draw2D draw2D = new Draw2D(this);
       setContentView(draw2D);
    }
}
