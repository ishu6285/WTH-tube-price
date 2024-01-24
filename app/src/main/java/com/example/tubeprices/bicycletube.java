package com.example.tubeprices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bicycletube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycletube);

        CardView c1 = findViewById(R.id.c1);
        CardView c2 = findViewById(R.id.c2);
        CardView c3 = findViewById(R.id.c3);
        CardView c4 = findViewById(R.id.c4);
        CardView c5 = findViewById(R.id.c5);
        CardView c6 = findViewById(R.id.c6);
        CardView c7 = findViewById(R.id.c7);
        CardView c8 = findViewById(R.id.c8);
        CardView c9 = findViewById(R.id.c9);
        CardView c10 = findViewById(R.id.c10);



        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletube.this, bicycletubesize12.class));
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletube.this, bicycletubesize14.class));
            }
        });


        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletube.this, bicycletubesize16.class));
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bicycletube.this,bicycletubesize18.class));
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {startActivity(new Intent(bicycletube.this,bicycletubesize20.class));
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(new Intent(bicycletube.this,bicycletubesize22.class));

            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(new Intent(bicycletube.this,bicycletubesize24.class));

            }
        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(new Intent(bicycletube.this,bicycletubesize26.class));

            }
        });

        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(new Intent(bicycletube.this,bicycletubesize27.class));

            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(new Intent(bicycletube.this,bicycletubesize28.class));

            }
        });


    }


}