package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    int contadorTotal, contadorA, contadorB, contadorC, contadorD;
    Button BotonA, BotonB, BotonC, BotonD;
    Button BotonResetA, BotonResetB, BotonResetC, BotonResetD, BotonResetAll;
    TextView ContadorA, ContadorB, ContadorC, ContadorD, ContadorTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        binding.BotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                contadorA++;
                contadorTotal++;
                binding.ContadorA.setText(""+contadorA);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });
        binding.BotonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                contadorB++;
                contadorTotal++;
                binding.ContadorB.setText(""+contadorB);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });
        binding.BotonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                contadorC++;
                contadorTotal++;
                binding.ContadorC.setText(""+contadorC);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });
        binding.BotonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                contadorD++;
                contadorTotal++;
                binding.ContadorD.setText(""+contadorD);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });
        binding.BotonResetA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorTotal -= contadorA;
                contadorA = 0;
                binding.ContadorA.setText(""+contadorA);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });
        binding.BotonResetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorTotal -= contadorB;
                contadorB = 0;
                binding.ContadorB.setText(""+contadorB);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });
        binding.BotonResetC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorTotal -= contadorC;
                contadorC = 0;
                binding.ContadorC.setText(""+contadorC);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });
        binding.BotonResetD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorTotal -= contadorD;
                contadorD = 0;
                binding.ContadorD.setText(""+contadorD);
                binding.ContadorTotal.setText(""+contadorTotal);
            }
        });binding.BotonResetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorTotal = contadorA = contadorB = contadorC = contadorD = 0;
                binding.ContadorA.setText("0");
                binding.ContadorB.setText("0");
                binding.ContadorC.setText("0");
                binding.ContadorD.setText("0");
                binding.ContadorTotal.setText("0");
            }
        });
    }
}