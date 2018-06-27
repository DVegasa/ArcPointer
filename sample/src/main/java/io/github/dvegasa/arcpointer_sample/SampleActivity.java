package io.github.dvegasa.arcpointer_sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import io.github.dvegasa.arcpointer.ArcPointer;
import io.github.dvegasa.arcpointer_sample.ReleaseFeaturesSamples.v1_0_2;

public class SampleActivity extends AppCompatActivity {

    ArcPointer arcPointer;
    TextView tv_value, tv_workAngle, tv_lineLengthRatio, tv_markerLengthRatio, tv_lineStrokeWidth,
            tv_markerStrokeWidth, tv_notchStrokeWidth, tv_notchLengthRatio, tv_notches;
    SeekBar sb_value;
    Button btn_workAnglePlus, btn_workAngleMinus,
            btn_lineLengthRatioPlus, btn_lineLengthRatioMinus,
            btn_markerLengthRatioPlus, btn_markerLengthRatioMinus,
            btn_lineStrokeWidthPlus, btn_lineStrokeWidthMinus,
            btn_markerStrokeWidthPlus, btn_markerStrokeWidthMinus,
            btn_notchStrokeWidthPlus, btn_notchStrokeWidthMinus,
            btn_notchLengthRatioPlus, btn_notchLengthRatioMinus,
            btn_notchesPlus, btn_notchesMinus;

    private void initViews(){
        arcPointer = (ArcPointer) findViewById(R.id.arcpointer);
        tv_value = (TextView) findViewById(R.id.tv_value);
        sb_value = (SeekBar) findViewById(R.id.sb_value);
        tv_workAngle = (TextView) findViewById(R.id.tv_workAngle);
        btn_workAngleMinus = (Button) findViewById(R.id.btn_workAngleMinus);
        btn_workAnglePlus = (Button) findViewById(R.id.btn_workAnglePlus);
        tv_lineLengthRatio = (TextView) findViewById(R.id.tv_lineLengthRatio);
        btn_lineLengthRatioPlus = (Button) findViewById(R.id.btn_lineLengthRatioPlus);
        btn_lineLengthRatioMinus = (Button) findViewById(R.id.btn_lineLengthRatioMinus);
        tv_markerLengthRatio = (TextView) findViewById(R.id.tv_markerLengthRatio);
        btn_markerLengthRatioPlus = (Button) findViewById(R.id.btn_markerLengthRatioPlus);
        btn_markerLengthRatioMinus = (Button) findViewById(R.id.btn_markerLengthRatioMinus);
        tv_lineStrokeWidth = (TextView) findViewById(R.id.tv_lineStrokeWidth);
        btn_lineStrokeWidthPlus = (Button) findViewById(R.id.btn_lineStrokeWidthPlus);
        btn_lineStrokeWidthMinus = (Button) findViewById(R.id.btn_lineStrokeWidthMinus);
        tv_markerStrokeWidth = (TextView) findViewById(R.id.tv_markerStrokeWidth);
        btn_markerStrokeWidthMinus = (Button) findViewById(R.id.btn_markerStrokeWidthMinus);
        btn_markerStrokeWidthPlus = (Button) findViewById(R.id.btn_markerStrokeWidthPlus);
        tv_notchStrokeWidth = (TextView) findViewById(R.id.tv_notchStrokeWidth);
        btn_notchStrokeWidthPlus = (Button) findViewById(R.id.btn_notchStrokeWidthPlus);
        btn_notchStrokeWidthMinus = (Button) findViewById(R.id.btn_notchStrokeWidthMinus);
        tv_notchLengthRatio = (TextView) findViewById(R.id.tv_notchLengthRatio);
        btn_notchLengthRatioPlus = (Button) findViewById(R.id.btn_notchLengthRatioPlus);
        btn_notchLengthRatioMinus = (Button) findViewById(R.id.btn_notchLengthRatioMinus);
        tv_notches = (TextView) findViewById(R.id.tv_notches);
        btn_notchesMinus = (Button) findViewById(R.id.btn_notchesMinus);
        btn_notchesPlus = (Button) findViewById(R.id.btn_notchesPlus);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        initViews();

        Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MinimalConfigActivity.class);
                startActivity(intent);
            }
        });

        Button btn_1_0_2 = (Button) findViewById(R.id.btn_1_0_2);
        btn_1_0_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), v1_0_2.class);
                startActivity(intent);
            }
        });

        arcPointer.setNotchLengthRatio(0.3f);
        arcPointer.setNotches(3);
        arcPointer.setNotchStrokeWidth(1.5f);
        arcPointer.setNotches(new float[] {0.1f, 0.2f, 0.5f});

        sb_value.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float value = 0.01f * progress;
                arcPointer.setValue(value);
                tv_value.setText(String.format("value = %.2f", value));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /////////////////////////////////////////////////////////////
        //
        btn_workAngleMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arcPointer.getWorkAngle() > 10) {
                    arcPointer.setWorkAngle(arcPointer.getWorkAngle() - 10);
                    tv_workAngle.setText("workAngle = " + arcPointer.getWorkAngle());
                }
            }
        });

        btn_workAnglePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setWorkAngle(arcPointer.getWorkAngle() + 10);
                tv_workAngle.setText("workAngle = " + arcPointer.getWorkAngle());
            }
        });

        /////////////////////////////////////////////////////////////
        //
        btn_lineLengthRatioPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setLineLengthRatio(arcPointer.getLineLengthRatio() + 0.05f);
                tv_lineLengthRatio.setText(String.format("lineLengthRatio = %.2f" ,arcPointer.getLineLengthRatio()));
            }
        });

        btn_lineLengthRatioMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setLineLengthRatio(arcPointer.getLineLengthRatio() - 0.05f);
                tv_lineLengthRatio.setText(String.format("lineLengthRatio = %.2f" ,arcPointer.getLineLengthRatio()));
            }
        });

        /////////////////////////////////////////////////////////////
        //
        btn_markerLengthRatioPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setMarkerLengthRatio(arcPointer.getMarkerLengthRatio() + 0.05f);
                tv_markerLengthRatio.setText(String.format("markerLengthRatio = %.2f", arcPointer.getMarkerLengthRatio()));
            }
        });

        btn_markerLengthRatioMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setMarkerLengthRatio(arcPointer.getMarkerLengthRatio() - 0.05f);
                tv_markerLengthRatio.setText(String.format("markerLengthRatio = %.2f", arcPointer.getMarkerLengthRatio()));
            }
        });

        /////////////////////////////////////////////////////////////
        //
        btn_lineStrokeWidthMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setLineStrokeWidth(arcPointer.getLineStrokeWidth() - 0.5f);
                tv_lineStrokeWidth.setText(String.format("lineStrokeWidth = %.2f", arcPointer.getLineStrokeWidth()));
            }
        });
        btn_lineStrokeWidthPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setLineStrokeWidth(arcPointer.getLineStrokeWidth() + 0.5f);
                tv_lineStrokeWidth.setText(String.format("lineStrokeWidth = %.2f", arcPointer.getLineStrokeWidth()));
            }
        });
        /////////////////////////////////////////////////////////////
        //
        btn_markerStrokeWidthMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setMarkerStrokeWidth(arcPointer.getMarkerStrokeWidth() - 0.5f);
                tv_markerStrokeWidth.setText(String.format("markerStrokeWidth = %.2f", arcPointer.getMarkerStrokeWidth()));
            }
        });
        btn_markerStrokeWidthPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setMarkerStrokeWidth(arcPointer.getMarkerStrokeWidth() + 0.5f);
                tv_markerStrokeWidth.setText(String.format("markerStrokeWidth = %.2f", arcPointer.getMarkerStrokeWidth()));
            }
        });
        /////////////////////////////////////////////////////////////
        //
        btn_notchStrokeWidthPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setNotchStrokeWidth(arcPointer.getNotchStrokeWidth() + 0.5f);
                tv_notchStrokeWidth.setText(String.format("notchStrokeWidth = %.2f", arcPointer.getNotchStrokeWidth()));
            }
        });
        btn_notchStrokeWidthMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setNotchStrokeWidth(arcPointer.getNotchStrokeWidth() - 0.5f);
                tv_notchStrokeWidth.setText(String.format("notchStrokeWidth = %.2f", arcPointer.getNotchStrokeWidth()));
            }
        });
        /////////////////////////////////////////////////////////////
        //
        btn_notchLengthRatioPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setNotchLengthRatio(arcPointer.getNotchLengthRatio() + 0.05f);
                tv_notchLengthRatio.setText(String.format("notchLengthRatio = %.2f", arcPointer.getNotchLengthRatio()));
            }
        });
        btn_notchLengthRatioMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setNotchLengthRatio(arcPointer.getNotchLengthRatio() - 0.05f);
                tv_notchLengthRatio.setText(String.format("notchLengthRatio = %.2f", arcPointer.getNotchLengthRatio()));
            }
        });
        /////////////////////////////////////////////////////////////
        //
        btn_notchesPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setNotches(arcPointer.getNotches().length + 1);
                tv_notches.setText("notches = "+arcPointer.getNotches().length);
            }
        });
        btn_notchesMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arcPointer.setNotches(arcPointer.getNotches().length - 1);
                tv_notches.setText("notches = "+arcPointer.getNotches().length);
            }
        });
    }
}
