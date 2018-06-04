package com.example.rafael.edproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button sumaBtn;
    private Button restaBtn;
    private Button multBtn;
    private Button divBtn;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenerOnButton();
    }

    public void addListenerOnButton() {
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sumaBtn = findViewById(R.id.suma);
        restaBtn = findViewById(R.id.resta);
        multBtn = findViewById(R.id.mult);
        divBtn = findViewById(R.id.div);
        resultado = findViewById(R.id.resultado);

        sumaBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value1 = num1.getText().toString();
                String value2 = num2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int res = a + b;
                resultado.setText(res);
            }
        });

        restaBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value1 = num1.getText().toString();
                String value2 = num2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int res = a - b;
                resultado.setText(res);
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value1 = num1.getText().toString();
                String value2 = num2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int res = a * b;
                resultado.setText(res);
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value1 = num1.getText().toString();
                String value2 = num2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int res = a / b;
                resultado.setText(res);
            }
        });
    }
}
