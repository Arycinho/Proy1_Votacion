package com.example.proy1_votacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView tvtile, tv1, tv_btn3;
    TextView tvVV, tvOA, tvMC;
    TextView tvres1, tvres2, tvres3, tvres4, tvres5, tvres6;
    ImageView img1, imgVV, imgOA, imgMC;
    FrameLayout frmlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvtile = findViewById(R.id.tvtitle);
        img1 = findViewById(R.id.img1);
        frmlay = findViewById(R.id.frmlay);

        tv1 = findViewById(R.id.tv1);
        imgVV = findViewById(R.id.imgVV);
        tvVV = findViewById(R.id.tvVV);
        tvres1 = findViewById(R.id.tvres1);
        tvres2 = findViewById(R.id.tvres2);

        imgOA = findViewById(R.id.imgOA);
        tvOA = findViewById(R.id.tvOA);
        tvres3 = findViewById(R.id.tvres3);
        tvres4 = findViewById(R.id.tvres4);

        imgMC = findViewById(R.id.imgMC);
        tvMC = findViewById(R.id.tvMC);
        tvres5 = findViewById(R.id.tvres5);
        tvres6 = findViewById(R.id.tvres6);

        tv_btn3 = findViewById(R.id.tv_btn3);
    }
}