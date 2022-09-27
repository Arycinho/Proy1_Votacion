package com.example.proy1_votacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {
    TextView tvtile, tv1, tv_btn3;
    TextView tvVV, tvOA, tvMC, tvBL;
    TextView tvres1, tvres2, tvres3, tvres4, tvres5, tvres6, tvres7, tvres8;
    ImageView img1, imgVV, imgOA, imgMC;
    FrameLayout frmlay;

    static int getc1, getc2, getc3, getc4;


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

        tvBL = findViewById(R.id.tvBL);
        tvres7 = findViewById(R.id.tvres7);
        tvres8 = findViewById(R.id.tvres8);

        tv_btn3 = findViewById(R.id.tv_btn3);



        Intent intent = getIntent();

        //integrando datos de la actividad 2
        getc1 = intent.getIntExtra("conteo1", 0);
        getc2 = intent.getIntExtra("conteo2", 0);
        getc3 = intent.getIntExtra("conteo3", 0);
        getc4 = intent.getIntExtra("conteo4", 0);


        //impresion de resultados
        tvres1.setText("Votos: " + Integer.toString(getc1));
        float porc1 = (float) 100*getc1/40;
        tvres2.setText("Porcentaje: " + Float.toString(porc1) + "%");

        tvres3.setText("Votos: " + Integer.toString(getc2));
        float porc2 = (float) 100*getc2/40;
        tvres4.setText("Porcentaje: " + Float.toString(porc2) + "%");

        tvres5.setText("Votos: " + Integer.toString(getc3));
        float porc3 = (float) 100*getc3/40;
        tvres6.setText("Porcentaje: " + Float.toString(porc3) + "%");

        tvres7.setText("Votos: " + Integer.toString(getc4));
        float porc4 = (float) 100*getc4/40;
        tvres8.setText("Porcentaje: " + Float.toString(porc4) + "%");


        //Accion al presionar el boton de pagina inicial
        Intent intent_back = new Intent(getApplicationContext(), MainActivity.class);
        tv_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent_back);
            }
        });



    }
}