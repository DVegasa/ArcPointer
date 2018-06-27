package io.github.dvegasa.arcpointer_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import io.github.dvegasa.arcpointer.ArcPointer;

public class MinimalConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minimal_config);

        final ArcPointer arcPointer2 = (ArcPointer) findViewById(R.id.arcpointer2);
        arcPointer2.setNotches(3);
        arcPointer2.setAnimated(true);
        arcPointer2.setAnimationVelocity(500L);

        arcPointer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer2.setNotches(new float[]{0.1f, 0.9f});
                if (arcPointer2.getValue() >= 0.5f){
                    arcPointer2.setValue(0.1f);
                }
                if (arcPointer2.getValue() < 0.5f){
                    arcPointer2.setValue(0.9f);
                }
            }
        });
    }
}
