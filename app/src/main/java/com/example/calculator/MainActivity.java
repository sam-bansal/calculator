package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero,
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button divide;
    private Button minus;
    private Button multiply;
    private Button equal;
    private Button clear;
    private Button decimal;

    private TextView info;
    private TextView result;

    private final char ADDITION = '+';
    private final char MULTIPLICATION = '*';
    private final char SUBTRACTION = '-';
    private final char DIVISION = '/';

    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIiews();

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + ".");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1)+ "+");
                info.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1)+ "-");
                info.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1)+ "*");
                info.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1)+ "/");
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQU ;
                result.setText(result.getText().toString()+ String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                info.setText(null);
                result.setText(null);
            }
        });
    }
    private void setupUIiews(){

        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        decimal = (Button) findViewById(R.id.btndecimal);

        divide = (Button)findViewById(R.id.btndivide);
        clear = (Button)findViewById(R.id.btnclear);
        add = (Button)findViewById(R.id.btnadd);
        minus = (Button)findViewById(R.id.btnminus);
        multiply = (Button)findViewById(R.id.btnmult);
        equal = (Button) findViewById(R.id.btnequal);

        info = (TextView) findViewById(R.id.tvcontrol);
        result = (TextView) findViewById(R.id.tvresult);


    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2= Double.parseDouble(info.getText().toString()) ;

            switch (ACTION){
                case ADDITION:
                    val1+=val2;
                    break;
                case SUBTRACTION:
                    val1-=val2;
                    break;
                case MULTIPLICATION:
                    val1*=val2;
                    break;
                case DIVISION:
                    val1/=val2;
                case EQU:
                    break;
            }
        }
        else{
            val1 =  Double.parseDouble(info.getText().toString());
        }
    }

}
