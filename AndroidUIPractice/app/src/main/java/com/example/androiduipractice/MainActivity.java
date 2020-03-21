package com.example.androiduipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.androiduipractice.R.drawable.lightsoff;
import static com.example.androiduipractice.R.drawable.lightson;

public class MainActivity extends AppCompatActivity {

    Button light, entertainment, sensor;
    ImageButton imageButton1, imageButton2, imageButton3, imageButton4, imageButton5;
    TextView on1, on2, on3, off1, off2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        light = findViewById(R.id.light);
        entertainment = findViewById(R.id.entertainment);
        sensor = findViewById(R.id.sensor);

        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);

        on1 = findViewById(R.id.on1);
        on2 = findViewById(R.id.on2);
        on3 = findViewById(R.id.on3);
        off1 = findViewById(R.id.off1);
        off2 = findViewById(R.id.off2);


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton2.setImageResource(lightsoff);
                on2.setText("OFF");
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton3.setImageResource(lightsoff);
                on3.setText("OFF");
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton4.setImageResource(lightson);
                off1.setText("ON");
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton5.setImageResource(lightson);
                off2.setText("ON");
            }
        });
    }
}
