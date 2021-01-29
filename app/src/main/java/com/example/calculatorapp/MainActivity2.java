package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        output = findViewById(R.id.operand1_tv);

        setOnClick(R.id.clear_btn);
        setOnClick(R.id.add_btn);
        setOnClick(R.id.subtract_btn);
        setOnClick(R.id.percentage_btn);
        setOnClick(R.id.multiply_btn);
        setOnClick(R.id.division_btn);
        setOnClick(R.id.plus_minus_btn);
        setOnClick(R.id.equal_btn);
        setOnClick(R.id.seven_btn);
        setOnClick(R.id.one_btn);
        setOnClick(R.id.two_btn);
        setOnClick(R.id.three_btn);
        setOnClick(R.id.four_btn);
        setOnClick(R.id.five_btn);
        setOnClick(R.id.six_btn);
        setOnClick(R.id.seven_btn);
        setOnClick(R.id.eight_btn);
        setOnClick(R.id.nine_btn);
        setOnClick(R.id.zero_btn);

    }

    private void setOnClick(int id) {
        MaterialButton btn  = findViewById(id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.append(btn.getText());
            }
        });
    }
}