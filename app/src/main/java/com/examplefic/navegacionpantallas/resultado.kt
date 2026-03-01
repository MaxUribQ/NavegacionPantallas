package com.examplefic.navegacionpantallas

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)

        val tvDato = findViewById<TextView>(R.id.tvDatoRecibido)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        val dato = intent.getStringExtra("dato")
        tvDato.text = dato

        btnVolver.setOnClickListener {
            finish()
        }
    }
}