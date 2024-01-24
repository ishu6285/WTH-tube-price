package com.example.tubeprices;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class size1162 extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("tubetypes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size1162);


        TextView brand1 = findViewById(R.id.brand1);
        TextView netprice1 =findViewById(R.id.netprice1);
        TextView sellingprice1 =findViewById(R.id.sellingprice1);

        TextView brand22 = findViewById(R.id.brand2);
        TextView netprice22 =findViewById(R.id.netprice2);
        TextView sellingprice22 =findViewById(R.id.sellingprice2);

        TextView brand33 = findViewById(R.id.brand3);
        TextView netprice33 =findViewById(R.id.netprice3);
        TextView sellingprice33 =findViewById(R.id.sellingprice3);


        TextView brand44 = findViewById(R.id.brand4);
        TextView netprice44 =findViewById(R.id.netprice4);
        TextView sellingprice44 =findViewById(R.id.sellingprice4);


        TextView brand55 = findViewById(R.id.brand5);
        TextView netprice55 =findViewById(R.id.netprice5);
        TextView sellingprice55 =findViewById(R.id.sellingprice5);


        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String brand = snapshot.child("bt").child("size1162").child("brand1").child("brand").getValue(String.class);
                String netprice = snapshot.child("bt").child("size1162").child("brand1").child("netprice").getValue(String.class);
                String sellingprice = snapshot.child("bt").child("size1162").child("brand1").child("sellingprice").getValue(String.class);

                brand1.setText(brand);
                netprice1.setText(netprice);
                sellingprice1.setText(sellingprice);


                String brand2 = snapshot.child("bt").child("size1162").child("brand2").child("brand").getValue(String.class);
                String netprice2 = snapshot.child("bt").child("size1162").child("brand2").child("netprice").getValue(String.class);
                String sellingprice2 = snapshot.child("bt").child("size1162").child("brand2").child("sellingprice").getValue(String.class);

                brand22.setText(brand2);
                netprice22.setText(netprice2);
                sellingprice22.setText(sellingprice2);

                String brand3 = snapshot.child("bt").child("size1162").child("brand3").child("brand").getValue(String.class);
                String netprice3 = snapshot.child("bt").child("size1162").child("brand3").child("netprice").getValue(String.class);
                String sellingprice3 = snapshot.child("bt").child("size1162").child("brand3").child("sellingprice").getValue(String.class);

                brand33.setText(brand3);
                netprice33.setText(netprice3);
                sellingprice33.setText(sellingprice3);

                String brand4 = snapshot.child("bt").child("size1162").child("brand4").child("brand").getValue(String.class);
                String netprice4 = snapshot.child("bt").child("size1162").child("brand4").child("netprice").getValue(String.class);
                String sellingprice4 = snapshot.child("bt").child("size1162").child("brand4").child("sellingprice").getValue(String.class);

                brand44.setText(brand4);
                netprice44.setText(netprice4);
                sellingprice44.setText(sellingprice4);

                String brand5 = snapshot.child("bt").child("size1162").child("brand5").child("brand").getValue(String.class);
                String netprice5 = snapshot.child("bt").child("size1162").child("brand5").child("netprice").getValue(String.class);
                String sellingprice5 = snapshot.child("bt").child("size1162").child("brand5").child("sellingprice").getValue(String.class);

                brand55.setText(brand5);
                netprice55.setText(netprice5);
                sellingprice55.setText(sellingprice5);



            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }



}