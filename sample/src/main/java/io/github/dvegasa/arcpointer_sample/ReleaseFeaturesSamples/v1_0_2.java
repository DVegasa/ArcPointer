package io.github.dvegasa.arcpointer_sample.ReleaseFeaturesSamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.dvegasa.arcpointer.ArcPointer;
import io.github.dvegasa.arcpointer_sample.R;

/*
    [1.0.2] Changelog:

        * Added customization of single notch:
            * Individual length
            * Individual color
            * Individual strokeWidth

        * Old methods for working with notches have become deprecated

     Release date:
 */

public class v1_0_2 extends AppCompatActivity {

    private ArcPointer arcPointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v1_0_2);
        arcPointer = (ArcPointer) findViewById(R.id.arcpointer1_0_2);

        /////////////////////////////////////////////////////////////
        // Not innovation
        float[] notches = {0.1f, 0.2f, 0.5f, 0.8f, 0.9f};
        arcPointer.setNotches(notches);

        /////////////////////////////////////////////////////////////
        // Innovations:
        /* Notches length ratio */
        float[] notchesLengthRatios = {1, 0.2f, 0.5f, 0.2f, 1};
        arcPointer.setNotchesLengthRatio(notchesLengthRatios);
        arcPointer.setNotchesLengthRatio(0.9f);

        /* Notches strokeWidth */
        float[] notchesStrokeWidth = {1f, 7f, 9f, 3f};
        arcPointer.setNotchesStrokeWidth(notchesStrokeWidth);
        arcPointer.setNotchesStrokeWidth(3f);

        /* Notches colors */
        int[] colors = {0xFF_FF0000, 0xFF_00FF00, 0xFF_0000FF};
        arcPointer.setNotchesColors(colors);
        arcPointer.setNotchesColors(0xFF00FF00);

        /////////////////////////////////////////////////////////////
        // Example
//        arcPointer.setWorkAngle(180);
//        arcPointer.setNotches(new float[]{0.1f, 0.2f, 0.4f, 0.8f});
//        arcPointer.setNotchesColors(new int[]{0xFF_555555, 0xFF_996666, 0xFF_BB7777, 0xFF_EE8888});
//        arcPointer.setNotchesStrokeWidth(new float[]{4f, 4f, 6f, 10f, 14f});
//        arcPointer.setNotchesLengthRatio(0.4f);
    }
}
