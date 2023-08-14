package com.julianserrano.myapppersonal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.julianserrano.myapppersonal.firstapp.FirstAppActivity
import com.julianserrano.myapppersonal.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        val btnImccApp = findViewById<Button>(R.id.btnImcApp)
        btnImccApp.setOnClickListener{ navigateToImcApp() }
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        btnTODO.setOnClickListener { navigateToTodoApp() }
    }

    private fun navigateToTodoApp() {
        TODO("Not yet implemented")
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

   // <!--ByJulian-->
}