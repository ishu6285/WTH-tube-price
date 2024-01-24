package com.example.tubeprices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bicycletubesize26 extends AppCompatActivity {

    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycletubesize26);

        btn1 =findViewById(R.id.btn2261);
        btn2 =findViewById(R.id.btn2262);
        btn3 =findViewById(R.id.btn2263);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletubesize26.this, size2261.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletubesize26.this, size2262.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletubesize26.this, size2263.class));
            }
        });

    }
}