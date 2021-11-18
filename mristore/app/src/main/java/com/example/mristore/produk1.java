package com.example.mristore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class produk1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk1);
    }

    public void clickCheckout(View view){
        Intent i = new Intent(produk1.this, checkout.class);
        startActivity(i);
    }
}