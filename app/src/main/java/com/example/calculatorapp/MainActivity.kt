package com.example.calculatorapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

private var output: TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        output = findViewById(R.id.operand1_tv)

        setOnClick(R.id.clear_btn)
        setOnClick(R.id.add_btn)
        setOnClick(R.id.subtract_btn)
        setOnClick(R.id.percentage_btn)
        setOnClick(R.id.multiply_btn)
        setOnClick(R.id.division_btn)
        setOnClick(R.id.plus_minus_btn)
        setOnClick(R.id.equal_btn)
        setOnClick(R.id.seven_btn)
        setOnClick(R.id.one_btn)
        setOnClick(R.id.two_btn)
        setOnClick(R.id.three_btn)
        setOnClick(R.id.four_btn)
        setOnClick(R.id.five_btn)
        setOnClick(R.id.six_btn)
        setOnClick(R.id.seven_btn)
        setOnClick(R.id.eight_btn)
        setOnClick(R.id.nine_btn)
        setOnClick(R.id.zero_btn)

    }
    open fun setOnClick(id: Int) {
        val btn = findViewById<MaterialButton>(id)
        btn.setOnClickListener {
            output?.append( btn.text)
        }
    }
}