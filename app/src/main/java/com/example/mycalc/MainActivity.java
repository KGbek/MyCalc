package com.example.mycalc;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView showResult;
    private Integer firstNumber, secondNumber;
    private String operation;
    private Boolean isFirstNumClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*** This is Main.activity ***/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = findViewById(R.id.show_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case(R.id.btn_clear):
                showResult.setText("0");
                firstNumber = null;
                secondNumber = null;
                break;
            case(R.id.btn_one):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("1");
                } else {
                    showResult.append("1");
                }
                if(isFirstNumClick){
                    showResult.setText("1");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_two):
                if (showResult.getText().toString().equals("0")){
                    showResult.setText("2");
                } else {
                    showResult.append("2");
                }
                if (isFirstNumClick) {
                    showResult.setText("2");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_three):
                if (showResult.getText().toString().equals("0")){
                    showResult.setText("3");
                } else {
                    showResult.append("3");
                }
                if (isFirstNumClick){
                    showResult.setText("3");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_four):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("4");
                } else {
                    showResult.append("4");
                }
                if (isFirstNumClick){
                    showResult.setText("4");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_five):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("5");
                } else {
                    showResult.append("5");
                }
                if (isFirstNumClick){
                    showResult.setText("5");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_six):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("6");
                } else {
                    showResult.append("6");
                }
                if(isFirstNumClick){
                    showResult.setText("6");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_seven):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("7");
                } else {
                    showResult.append("7");
                }
                if(isFirstNumClick){
                    showResult.setText("7");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_eight):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("8");
                } else {
                    showResult.append("8");
                }
                if(isFirstNumClick){
                    showResult.setText("8");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_nine):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("9");
                } else {
                    showResult.append("9");
                }
                if(isFirstNumClick){
                    showResult.setText("9");
                }
                isFirstNumClick = true;
                break;
            case(R.id.btn_zero):
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("0");
                } else {
                    showResult.append("0");
                }
                if(isFirstNumClick){
                    showResult.setText("0");
                }
                isFirstNumClick = true;
                break;
        }
    }


    public void expressionPlus(View view){
        switch (view.getId()){
            case R.id.btn_plus:
                firstNumber = parseInt(showResult.getText().toString());
                operation = "+";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.btn_minus:
                firstNumber = parseInt(showResult.getText().toString());
                operation = "-";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.btn_multiply:
                firstNumber = parseInt(showResult.getText().toString());
                operation = "*";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.divide:
                firstNumber = parseInt(showResult.getText().toString());
                operation = "/";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.btn_equal:
                if (operation.equals("+")){
                    String text = showResult.getText().toString();
                    text = text.replace(firstNumber + operation, "");
                    secondNumber = Integer.parseInt(text);
                    Integer result = firstNumber + secondNumber;
                    showResult.setText(firstNumber + operation + secondNumber + "=" + result);
                    firstNumber = null;
                    secondNumber = null;
                    break;
                } else if (operation.equals("-")){
                    String text = showResult.getText().toString();
                    text = text.replace(firstNumber + operation, "");
                    secondNumber = Integer.parseInt(text);
                    Integer result = firstNumber - secondNumber;
                    showResult.setText(firstNumber + operation + secondNumber + "=" + result);
                    firstNumber = null;
                    secondNumber = null;
                    break;
                } else if (operation.equals("*")){
                    String text = showResult.getText().toString();
                    text = text.replace(firstNumber + operation, "");
                    secondNumber = Integer.parseInt(text);
                    Integer result = firstNumber * secondNumber;
                    showResult.setText(firstNumber + operation + secondNumber + "=" + result);
                    firstNumber = null;
                    secondNumber = null;
                    break;
                } else if (operation.equals("/")){
                    String text = showResult.getText().toString();
                    text = text.replace(firstNumber + operation, "");
                    secondNumber = Integer.parseInt(text);
                    Integer result = firstNumber / secondNumber;
                    showResult.setText(firstNumber + operation + secondNumber + "=" + result);
                    firstNumber = null;
                    secondNumber = null;
                    break;
                }
        }
    }

}