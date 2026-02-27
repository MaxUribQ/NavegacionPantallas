package com.examplefic.navegacionpantallas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datos)

        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {
            finish()
        }

        val editText = findViewById<EditText>(R.id.etDato)
        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnAceptar.setOnClickListener {
            val texto = editText.text.toString()
            tvResultado.text = texto
        }
    }
}