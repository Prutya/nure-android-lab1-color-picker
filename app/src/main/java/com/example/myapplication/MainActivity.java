package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_COLOR = "com.example.myapplication.COLOR";

    public void changeColor(View view) {
        EditText rText = (EditText)findViewById(R.id.editTextR);
        EditText gText = (EditText)findViewById(R.id.editTextG);
        EditText bText = (EditText)findViewById(R.id.editTextB);

        int rValue = Integer.parseInt(rText.getText().toString());
        int gValue = Integer.parseInt(gText.getText().toString());
        int bValue = Integer.parseInt(bText.getText().toString());

        int color = Color.rgb(rValue, gValue, bValue);

        Intent intent = new Intent(this, DisplayColorActivity.class);
        intent.putExtra(EXTRA_COLOR, color);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
