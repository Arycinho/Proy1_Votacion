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
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tvtile, tv1, tv_btn2;
    ImageView img1, imgVV, imgOA, imgMC;
    FrameLayout frmlay;
    RadioButton rbVV, rbOA, rbMC;
    Button btn2;

    static int count1 = 0, count2 = 0, count3 = 0;


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

        //Toast.makeText(getApplicationContext(), "ABRE ACTIVIDAD 2", Toast.LENGTH_LONG);

        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);

        //Accion al presionar el boton votar
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (rbVV.isChecked()){
                    count1++;
                    Toast.makeText(getApplicationContext(),"Tu voto se ha registrado.", Toast.LENGTH_LONG).show();
                    rbOA.setClickable(false);
                    rbMC.setClickable(false);
                    btn2.setClickable(false);

                } else if (rbOA.isChecked()){
                    count2++;
                    Toast.makeText(getApplicationContext(),"Tu voto se ha registrado.", Toast.LENGTH_LONG).show();
                    rbVV.setClickable(false);
                    rbMC.setClickable(false);
                    btn2.setClickable(false);

                } else if (rbMC.isChecked()){
                    count3++;
                    Toast.makeText(getApplicationContext(),"Tu voto se ha registrado.", Toast.LENGTH_LONG).show();
                    rbVV.setClickable(false);
                    rbOA.setClickable(false);
                    btn2.setClickable(false);

                } else if (!rbMC.isChecked() && !rbVV.isChecked() && !rbOA.isChecked()){
                    Toast.makeText(getApplicationContext(),"Elije un candidato.", Toast.LENGTH_LONG).show();
                }

                intent.putExtra("conteo1", count1);
                intent.putExtra("conteo2", count2);
                intent.putExtra("conteo3", count3);

            }
        });


        //Accion al presionar el boton de resultados
        tv_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });



    }
}