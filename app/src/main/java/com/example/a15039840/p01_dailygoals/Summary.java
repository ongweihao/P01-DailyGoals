package com.example.a15039840.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tvRead = (TextView) findViewById(R.id.textViewReadUp);
        TextView tvArrive = (TextView) findViewById(R.id.textViewArriveOnTime);
        TextView tvAttempt = (TextView) findViewById(R.id.textViewAttempProblem);
        TextView tvReflectoin = (TextView) findViewById(R.id.textViewReflection);
        // Display the name and age on the TextView
        tvRead.setText(info[0]);
        tvArrive.setText(info[1]);
        tvAttempt.setText(info[2]);
        tvReflectoin.setText(info[3]);
    }
}
