package com.e.tut3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnPlu ,btnDiv, btnSu,btnMul ;
    EditText etSecond1 , etSecond2;
    String n1 , n2 , result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        // n1 = findViewById(R.id.etSendNum1);
        n1 = i.getStringExtra("EXTRA_1");
        n2 = i.getStringExtra("EXTRA_2");

        etSecond1= findViewById(R.id.etSendNum1);
        etSecond2 = findViewById(R.id.etSendNum2);

        btnPlu = findViewById(R.id.btnPlus);
        btnSu = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);

        //set the edit text to the numbers received
        etSecond1.setText(n1);
        etSecond2.setText(n2);

        result = "";
        btnPlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer i1 = Integer.parseInt(etSecond1.getText().toString());
                Integer i2 = Integer.parseInt(etSecond2.getText().toString());

                result = i1 + " + " + i2 + " = " +(i1+i2);

                TextView tv = findViewById(R.id.tvResult);

                tv.setText(result);
            }
        });

        btnSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i1 = Integer.parseInt(etSecond1.getText().toString());
                Integer i2 = Integer.parseInt(etSecond2.getText().toString());

                result = i1 + " - " + i2 + " = " +(i1-i2);

                TextView tv = findViewById(R.id.tvResult);

                tv.setText(result);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i1 = Integer.parseInt(etSecond1.getText().toString());
                Integer i2 = Integer.parseInt(etSecond2.getText().toString());

                result = i1 + " * " + i2 + " = " +(i1*i2);

                TextView tv = findViewById(R.id.tvResult);

                tv.setText(result);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i1 = Integer.parseInt(etSecond1.getText().toString());
                Integer i2 = Integer.parseInt(etSecond2.getText().toString());

                result = i1 + " / " + i2 + " = " +(i1/i2);

                TextView tv = findViewById(R.id.tvResult);

                tv.setText(result);
            }
        });

    }
}