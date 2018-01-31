package com.example.poly.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText etNum1;
    private AppCompatEditText etNum2;
    private AppCompatButton btPlus;
    private AppCompatButton btMinus;
    private AppCompatButton btMultiple;
    private AppCompatButton btDivide;
    private AppCompatTextView tvResult;

    private Calcutor Cal = new Calcutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btPlus = findViewById(R.id.btPlus);
        btMinus = findViewById(R.id.btMinus);
        btMultiple = findViewById(R.id.btMultiply);
        btDivide = findViewById(R.id.btDivide);
        tvResult = findViewById(R.id.tvResult);

        btPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Num1 = etNum1.getText().toString();
                String Num2 = etNum2.getText().toString();
                if (Num1.length()>0&&Num2.length()>0){
                int result = Cal.plus(Integer.parseInt(Num1),Integer.parseInt(Num2));
                tvResult.setText(String.valueOf(result));
            }}
        });
        btMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Num1 = etNum1.getText().toString();
                String Num2 = etNum2.getText().toString();
                if (Num1.length()>0&&Num2.length()>0){
                int result = Cal.minus(Integer.parseInt(Num1),Integer.parseInt(Num2));
                tvResult.setText(String.valueOf(result));
            }}
        });
        btMultiple.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Num1 = etNum1.getText().toString();
                String Num2 = etNum2.getText().toString();
                if (Num1.length()>0&&Num2.length()>0){
                int result = Cal.multiple(Integer.parseInt(Num1),Integer.parseInt(Num2));
                tvResult.setText(String.valueOf(result));
            }}
        });
        btDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Num1 = etNum1.getText().toString();
                String Num2 = etNum2.getText().toString();
                if (Num1.length()>0&&Num2.length()>0){
                int result = Cal.divide(Integer.parseInt(Num1),Integer.parseInt(Num2));
                tvResult.setText(String.valueOf(result));
            }}
        });
    }
}
