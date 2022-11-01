package com.example.muhammadnanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvNamaL, tvNoPen, tvJalurs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNamaL = findViewById(R.id.tv_nama_len);
        tvNoPen = findViewById(R.id.tv_nopen);
        tvJalurs = findViewById(R.id.tv_jalurs);

        Intent gotcha = getIntent();
        tvNamaL.setText(gotcha.getStringExtra("varNama"));
        tvNoPen.setText(gotcha.getStringExtra("varNomor"));
        tvJalurs.setText(gotcha.getStringExtra("varJalur"));
    }
}