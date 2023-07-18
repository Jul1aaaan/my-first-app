package com.julianserrano.myapppersonal.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.julianserrano.myapppersonal.R
import com.julianserrano.myapppersonal.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
    }
}