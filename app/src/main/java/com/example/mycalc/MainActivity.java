package com.example.mycalc;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView showResult;
    private Integer firstNumber, secondNumber;
    private String operation;
    private Button historyBtn;
    private Boolean isFirstNumClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*** This is Main.activity ***/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = findViewById(R.id.show_result);
        historyBtn = findViewById(R.id.history_btn);
        historyBtn.setVisibility(View.INVISIBLE);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case(R.id.btn_clear):
                historyBtn.setVisibility(View.INVISIBLE);
                showResult.setText("0");
                firstNumber = null;
                secondNumber = null;
                break;
            case(R.id.btn_one):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("1");
                } else {
                    showResult.append("1");
                }
                if(isFirstNumClick){
                    showResult.setText("1");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_two):
                historyBtn.setVisibility(View.INVISIBLE);
                if (showResult.getText().toString().equals("0")){
                    showResult.setText("2");
                } else {
                    showResult.append("2");
                }
                if (isFirstNumClick) {
                    showResult.setText("2");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_three):
                historyBtn.setVisibility(View.INVISIBLE);
                if (showResult.getText().toString().equals("0")){
                    showResult.setText("3");
                } else {
                    showResult.append("3");
                }
                if (isFirstNumClick){
                    showResult.setText("3");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_four):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("4");
                } else {
                    showResult.append("4");
                }
                if (isFirstNumClick){
                    showResult.setText("4");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_five):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("5");
                } else {
                    showResult.append("5");
                }
                if (isFirstNumClick){
                    showResult.setText("5");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_six):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("6");
                } else {
                    showResult.append("6");
                }
                if(isFirstNumClick){
                    showResult.setText("6");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_seven):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("7");
                } else {
                    showResult.append("7");
                }
                if(isFirstNumClick){
                    showResult.setText("7");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_eight):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("8");
                } else {
                    showResult.append("8");
                }
                if(isFirstNumClick){
                    showResult.setText("8");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_nine):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("9");
                } else {
                    showResult.append("9");
                }
                if(isFirstNumClick){
                    showResult.setText("9");
                }
                isFirstNumClick = false;
                break;
            case(R.id.btn_zero):
                historyBtn.setVisibility(View.INVISIBLE);
                if(showResult.getText().toString().equals("0")){
                    showResult.setText("0");
                } else {
                    showResult.append("0");
                }
                if(isFirstNumClick){
                    showResult.setText("0");
                }
                isFirstNumClick = false;
                break;
            }
    }


    public void expressionPlus(View view){
        switch (view.getId()){
            case R.id.btn_plus:
                historyBtn.setVisibility(View.INVISIBLE);
                firstNumber = parseInt(showResult.getText().toString());
                operation = "+";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.btn_minus:
                historyBtn.setVisibility(View.INVISIBLE);
                firstNumber = parseInt(showResult.getText().toString());
                operation = "-";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.btn_multiply:
                historyBtn.setVisibility(View.INVISIBLE);
                firstNumber = parseInt(showResult.getText().toString());
                operation = "*";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.divide:
                historyBtn.setVisibility(View.INVISIBLE);
                firstNumber = parseInt(showResult.getText().toString());
                operation = "/";
                showResult.setText(firstNumber + operation);
                break;
            case R.id.btn_equal:
                historyBtn.setVisibility(View.VISIBLE);
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

    public void publishHistory(View view) {
        String note = showResult.getText().toString();
        Intent myIntent = new Intent(MainActivity.this, HistoryActivity.class);
        myIntent.putExtra("textKey", note);
        startActivity(myIntent);
    }
}