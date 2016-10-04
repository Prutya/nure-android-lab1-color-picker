package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_color);

        Intent intent = getIntent();
        int color = intent.getIntExtra(MainActivity.EXTRA_COLOR, 0);

        findViewById(R.id.activity_display_color).setBackgroundColor(color);
    }
}
