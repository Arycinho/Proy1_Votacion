package com.example.proy1_votacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvtile, tv1, tv_btn2;
    ImageView img1, imgVV, imgOA, imgMC;
    FrameLayout frmlay;
    RadioButton rbVV, rbOA, rbMC;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvtile = findViewById(R.id.tvtitle);
        img1 = findViewById(R.id.img1);
        frmlay = findViewById(R.id.frmlay);

        tv1 = findViewById(R.id.tv1);
        rbVV = findViewById(R.id.rbVV);
        rbOA = findViewById(R.id.rbOA);
        rbMC = findViewById(R.id.rbMC);
        imgVV = findViewById(R.id.imgVV);
        imgOA = findViewById(R.id.imgOA);
        imgMC = findViewById(R.id.imgMC);

        btn2 = findViewById(R.id.btn2);
        tv_btn2 = findViewById(R.id.tv_btn2);
    }
}