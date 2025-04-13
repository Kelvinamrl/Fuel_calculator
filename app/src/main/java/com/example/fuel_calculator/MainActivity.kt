package com.example.fuel_calculator

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private fun intent(MainActivity: Activity) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val botaoiniciar = findViewById<Button>(R.id.botao_iniciar)

        botaoiniciar.setOnClickListener {

            val intent = Intent(this, ValorCombustivel::class.java)
            startActivity(intent)
        }
    }
}