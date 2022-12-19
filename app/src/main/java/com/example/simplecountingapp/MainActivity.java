package com.example.simplecountingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button plusOneButton;
    private TextView counter;
    private int current_count = 0;
    private Button plusFiveButton;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusOneButton = findViewById(R.id.plusOneButton);
        counter = findViewById(R.id.textView);
        counter.setText(current_count + "");
        plusFiveButton = findViewById(R.id.plusFiveButton);
        reset = findViewById(R.id.reset);

        plusOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_count++;
                counter.setText(current_count+"");
            }
        });




        plusFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_count+= 5;
                counter.setText(current_count+"");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_count = 0;
                counter.setText(current_count+"");
            }
        });

        Toast.makeText(this,"Welcome to my App",Toast.LENGTH_SHORT).show();
    }


}