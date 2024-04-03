package com.example.radiogroups;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton b1, b2, b3;
    ImageView i1, i2, i3, i4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        b1 = findViewById(R.id.radioButton);
        b2 = findViewById(R.id.radioButton2);
        b3 = findViewById(R.id.radioButton3);
        i1 = findViewById(R.id.imageView);
        i2 = findViewById(R.id.imageView2);
        i3 = findViewById(R.id.imageView3);
        i4 = findViewById(R.id.imageView4);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.radioButton){
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.INVISIBLE);
                    i3.setVisibility(View.INVISIBLE);
                    i4.setVisibility(View.INVISIBLE);
                }
                if(i == R.id.radioButton2){
                    i1.setVisibility(View.INVISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.INVISIBLE);
                    i4.setVisibility(View.INVISIBLE);
                }
                if(i == R.id.radioButton3){
                    i1.setVisibility(View.INVISIBLE);
                    i2.setVisibility(View.INVISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i4.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}