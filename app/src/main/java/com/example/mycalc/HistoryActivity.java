package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    private TextView curr_policies;
    private Button curr_as_csv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        curr_policies = findViewById(R.id.curr_policies);
        curr_as_csv = findViewById(R.id.btn_curr_as_csv);

        Intent intent = getIntent();
        String calculation = intent.getStringExtra("textKey");
        curr_policies.setText(calculation);

        curr_as_csv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }


}