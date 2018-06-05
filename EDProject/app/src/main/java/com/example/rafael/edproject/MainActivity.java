package com.example.rafael.edproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumaAction (View v){
        EditText fieldValue1 = (EditText)findViewById(R.id.num1);
        EditText fieldValue2 = (EditText)findViewById(R.id.num2);

        double a = Double.parseDouble(fieldValue1.getText().toString());
        double b = Double.parseDouble(fieldValue2.getText().toString());


        TextView viewResult = (TextView)findViewById(R.id.resultado);
        double result = a + b;
        viewResult.setText(String.valueOf(result));
    }

    public void restaAction (View v){
        EditText fieldValue1 = (EditText) findViewById(R.id.num1);
        EditText fieldValue2 = (EditText) findViewById(R.id.num2);

        double a = Double.parseDouble(fieldValue1.getText().toString());
        double b = Double.parseDouble(fieldValue2.getText().toString());

        TextView viewResult = (TextView) findViewById(R.id.resultado);
        double result = a - b;
        viewResult.setText(String.valueOf(result));
    }

    public void multAction (View v){
        EditText fieldValue1 = (EditText) findViewById(R.id.num1);
        EditText fieldValue2 = (EditText) findViewById(R.id.num2);

        double a = Double.parseDouble(fieldValue1.getText().toString());
        double b = Double.parseDouble(fieldValue2.getText().toString());

        TextView viewResult = (TextView) findViewById(R.id.resultado);
        double result = a * b;
        viewResult.setText(String.valueOf(result));
    }

    public void divAction (View v){
        double result;
        EditText fieldValue1 = (EditText) findViewById(R.id.num1);
        EditText fieldValue2 = (EditText) findViewById(R.id.num2);

        double a = Double.parseDouble(fieldValue1.getText().toString());
        double b = Double.parseDouble(fieldValue2.getText().toString());

        TextView viewResult = (TextView) findViewById(R.id.resultado);

        if (a > b) {
            result = a / b;
            viewResult.setText(String.valueOf(result));
        } else
            viewResult.setText("El número de abajo debe de ser menor que el de arriba");
    }
}
