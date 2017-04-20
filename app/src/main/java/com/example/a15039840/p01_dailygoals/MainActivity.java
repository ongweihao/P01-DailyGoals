package com.example.a15039840.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button) findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                EditText et1 = (EditText) findViewById(R.id.editText);
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radioGroup2);

                RadioGroup rg2 = (RadioGroup)findViewById(R.id.radioGroup3);

                RadioGroup rg3 = (RadioGroup)findViewById(R.id.radioGroup4);

                int selectedButton1 = rg1.getCheckedRadioButtonId();

                int selectedButton2 = rg2.getCheckedRadioButtonId();

                int selectedButton3 = rg3.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton) findViewById(selectedButton1);
                RadioButton rb2 = (RadioButton) findViewById(selectedButton2);
                RadioButton rb3 = (RadioButton) findViewById(selectedButton3);
                // Put the name and age into an array
                String[] info = {rb1.getText().toString(),
                        rb2.getText().toString(), rb3.getText().toString(), et1.getText().toString()
                };
                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,
                        Summary.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }});

    }
}
