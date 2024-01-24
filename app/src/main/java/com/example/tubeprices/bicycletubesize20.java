package com.example.tubeprices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bicycletubesize20 extends AppCompatActivity {

    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycletubesize20);

        btn1 =findViewById(R.id.btn2201);
        btn2 =findViewById(R.id.btn2202);
        btn3 =findViewById(R.id.btn2203);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletubesize20.this, size2201.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletubesize20.this, size2202.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletubesize20.this, size2203.class));
            }
        });

    }
}