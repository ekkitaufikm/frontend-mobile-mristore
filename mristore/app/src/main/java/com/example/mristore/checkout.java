package com.example.mristore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class checkout extends AppCompatActivity {

    int angka=0;
    TextView angkakounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        angkakounter=findViewById(R.id.kounter);
    }

    public void clickProduk1(View view){
        Intent i = new Intent(checkout.this, produk1.class);
        startActivity(i);
    }

    public void clickTambahin(View view){
        angka=angka+1;
        angkakounter.setText(Integer.toString(angka));
    }

    public void clickKurang(View view){
        angka=angka-1;
        angkakounter.setText(Integer.toString(angka));
    }
}