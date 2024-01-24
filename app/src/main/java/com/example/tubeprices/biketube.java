package com.example.tubeprices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class biketube extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biketube);

        btn1 =findViewById(R.id.btn1081);
        btn2 =findViewById(R.id.btn1101);
        btn3 =findViewById(R.id.btn1102);
        btn4 =findViewById(R.id.btn1103);
        btn5 =findViewById(R.id.btn1121);
        btn6 =findViewById(R.id.btn1141);
        btn7 =findViewById(R.id.btn1161);
        btn8 =findViewById(R.id.btn1162);
        btn9 =findViewById(R.id.btn1171);
        btn10 =findViewById(R.id.btn1172);
        btn11 =findViewById(R.id.btn1173);
        btn12 =findViewById(R.id.btn1181);
        btn13 =findViewById(R.id.btn1182);
        btn14 =findViewById(R.id.btn1211);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biketube.this, size1081.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1101.class));


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1102.class));


            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1103.class));


            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biketube.this, size1121.class));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1141.class));


            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1161.class));


            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1162.class));


            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biketube.this, size1171.class));
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1172.class));


            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1173.class));


            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1181.class));


            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1182.class));


            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(biketube.this, size1211.class));


            }
        });




    }
}