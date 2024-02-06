package com.example.companyappui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.companyappui.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView result;
    private Button btnMod, btnAdd, btnSubtract, btnDivide, btnPower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        btnMod = findViewById(R.id.btnMod);
        btnAdd = findViewById(R.id.btnAdd);

        btnMod.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double modResult = number1 % number2;
                result.setText(String.format("Result: %.2f", modResult));
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                result.setText(String.format("Result: %.2f", sum));
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double resultValue = number1 - number2;
                result.setText(String.format("Result: %.2f", resultValue));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                if (number2 == 0) {
                    result.setText("Cannot divide by zero");
                } else {
                    double resultValue = number1 / number2;
                    result.setText(String.format("Result: %.2f", resultValue));
                }
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double resultValue = Math.pow(number1, number2);
                result.setText(String.format("Result: %.2f", resultValue));
            }
        });
    }
}