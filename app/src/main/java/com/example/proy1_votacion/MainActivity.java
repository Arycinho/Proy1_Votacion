package com.example.proy1_votacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvtile, tv1, tv2, tv_btn;
    EditText et1;
    ImageView img1;
    FrameLayout frmlay;
    Button btn1;
    String cedu;
    static ArrayList<String> cedula = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ArrayList<String> cedula = new ArrayList<>();


        tvtile = findViewById(R.id.tvtitle);
        img1 = findViewById(R.id.img1);
        frmlay = findViewById(R.id.frmlay);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        et1 = findViewById(R.id.et1);

        btn1 = findViewById(R.id.btn1);
        tv_btn = findViewById(R.id.tv_btn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cedu = et1.getText().toString();


                //String search = cedu;

                boolean votar = cedula.contains(cedu);

                if (votar) {
                    Toast val = Toast.makeText(getApplicationContext(), "El elemento existe", Toast.LENGTH_LONG);
                    val.show();
                    //int posi = cedula.indexOf(search);
                    //tv3.setText("Posición: "+posi);
                } else {
                    Toast val = Toast.makeText(getApplicationContext(), "El elemento no existe", Toast.LENGTH_LONG);
                    val.show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    //intent.putExtra("cedula",cedula);
                    startActivity(intent);
                    //tv3.setText("Posición: ");

                }
                cedula.add(cedu);

            }

        });

    }
}