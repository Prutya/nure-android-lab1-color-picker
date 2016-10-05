package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private int valueR = 128;
    private int valueG = 128;
    private int valueB = 128;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_portrait);

        SeekBar seekBarR = (SeekBar)findViewById(R.id.seekBarR);
        SeekBar seekBarG = (SeekBar)findViewById(R.id.seekBarG);
        SeekBar seekBarB = (SeekBar)findViewById(R.id.seekBarB);

        seekBarR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valueR = progress;
                changeColor();
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
                valueG = progress;
                changeColor();
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
                valueB = progress;
                changeColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        changeColor();
    }

    private void changeColor() {
        findViewById(R.id.activity_main).setBackgroundColor(Color.rgb(valueR, valueG, valueB));
    }
}
