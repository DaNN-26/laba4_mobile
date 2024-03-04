package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton yes_button;
    RadioButton no_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no_button = (RadioButton) findViewById(R.id.radioButton1);
        yes_button = (RadioButton) findViewById(R.id.radioButton2);
        Intent intentyes = new Intent(this, Activity_Yes.class);
        Intent intentno = new Intent(this, Activity_no.class);
        yes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentyes);

            }
        });
        no_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentno);
            }
        });
    }
}