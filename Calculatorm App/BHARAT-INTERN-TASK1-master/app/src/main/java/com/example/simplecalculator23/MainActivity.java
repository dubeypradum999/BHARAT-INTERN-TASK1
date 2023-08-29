package com.example.simplecalculator23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  EditText etfirstvalue,etsecondvalue;
  Button btnadd,btnsub,btnmul,btndiv;
  Double num1,num2;
  TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstvalue = findViewById(R.id.etfirstvalue);
        etsecondvalue = findViewById(R.id.etsecondvalue);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        tvresult = findViewById(R.id.tvresult);
        Clicklistener();
    }
    public void Clicklistener()
    {
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etfirstvalue.getText().toString());
                num2 = Double.parseDouble(etsecondvalue.getText().toString());
                Double result = num1 + num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etfirstvalue.getText().toString());
                num2 = Double.parseDouble(etsecondvalue.getText().toString());
                Double result = num1-num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etfirstvalue.getText().toString());
                num2 = Double.parseDouble(etsecondvalue.getText().toString());
                Double result = num1*num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etfirstvalue.getText().toString());
                num2 = Double.parseDouble(etsecondvalue.getText().toString());
                Double result = num1/num2;
                tvresult.setText(String.valueOf(result));
            }
        });
    }
}