package com.example.atividadeconversordemoedas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val resultado = findViewById<TextView>(R.id.txtResultado)
        val reais = findViewById<EditText>(R.id.valorReais)
        val conversao = findViewById<EditText>(R.id.taxaConversao)
        val btnConversao = findViewById<Button>(R.id.btnConverte)


        // BOTÃO DE SOMA
        btnConversao.setOnClickListener {
            if (reais.text.isNotEmpty() && conversao.text.isNotEmpty()) {

                val valor01 = reais.text.toString()
                val valor02 = conversao.text.toString()

                val resultConversao = valor01.toDouble() / valor02.toDouble()

                resultado.setText("Você possui: $${resultConversao} dólares")
            } else {
                resultado.setText("Preencha todos os valores para realizar o cálculo de conversão")
            }
        }
    }
}