package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Space;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_COLOR = "com.example.myapplication.COLOR";

    private SeekBar seekBarR;
    private SeekBar seekBarG;
    private SeekBar seekBarB;
    private Space colorSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_portrait);

        seekBarR = (SeekBar)findViewById(R.id.seekBarR);
        seekBarG = (SeekBar)findViewById(R.id.seekBarG);
        seekBarB = (SeekBar)findViewById(R.id.seekBarB);
        colorSpace = (Space)findViewById(R.id.colorSpace);

        seekBarR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                handleProgressChange();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                handleProgressChange();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                handleProgressChange();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void handleProgressChange() {
        int valueR = seekBarR.getProgress();
        int valueG = seekBarG.getProgress();
        int valueB = seekBarB.getProgress();

        colorSpace.setBackgroundColor(Color.rgb(valueR, valueG, valueB));
    }
}
