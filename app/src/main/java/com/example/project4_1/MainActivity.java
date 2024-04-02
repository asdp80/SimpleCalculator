package com.example.project4_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText Edit1, Edit2;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv;
    TextView TextResult;
    String num1, num2;
    Double result;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        //변수 선언
        Edit1 = (EditText) findViewById(R.id.Edit1);
        Edit2 = (EditText) findViewById(R.id.Edit2);

        BtnAdd = (Button) findViewById(R.id.BtnAdd);
        BtnSub = (Button) findViewById(R.id.BtnSub);
        BtnMul = (Button) findViewById(R.id.BtnMul);
        BtnDiv = (Button) findViewById(R.id.BtnDiv);


        TextResult = (TextView) findViewById(R.id.TextResult);

        //더하기 구현
        BtnAdd.setOnTouchListener((arg0, arg1) -> {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Double.parseDouble(num1) + Double.parseDouble(num2);
            TextResult.setText("계산 결과 : " + result.toString());
           return false;
        });

        //빼기 구현
        BtnSub.setOnTouchListener((arg0, arg1) -> {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Double.parseDouble(num1) - Double.parseDouble(num2);
            TextResult.setText("계산 결과 : " + result.toString());
            return false;
        });

        //곱하기 구현
        BtnMul.setOnTouchListener((arg0, arg1) -> {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Double.parseDouble(num1) * Double.parseDouble(num2);
            TextResult.setText("계산 결과 : " + result.toString());
            return false;
        });

        //나누기 구현
        BtnDiv.setOnTouchListener((arg0, arg1) -> {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Double.parseDouble(num1) / Double.parseDouble(num2);
            TextResult.setText("계산 결과 : " + result.toString());
            return false;
        });

    }
}