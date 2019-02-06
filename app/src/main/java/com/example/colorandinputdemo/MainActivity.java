package com.example.colorandinputdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit (View view) {
        EditText input = findViewById(R.id.input);
        String inputText = input.getText().toString();

        TextView output = findViewById(R.id.output);
        output.setText(inputText);

        output.setBackgroundColor(Color.parseColor("#FF00FF"));

    }

}
