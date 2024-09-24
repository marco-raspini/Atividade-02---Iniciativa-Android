package com.example.atividadecalculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        //Dizer qual a tela que vai ser carregada

        val resultado = findViewById<TextView>(R.id.txtResultado)
        val val01 = findViewById<EditText>(R.id.valor01)
        val val02 = findViewById<EditText>(R.id.valor02)
        val btnSomar = findViewById<Button>(R.id.btnSomar)
        val btnSubtrair = findViewById<Button>(R.id.btnSubtrair)


        //Pega o valor do input da Tela

        // BOTÃO DE SOMA
        btnSomar.setOnClickListener {
            if (val01.text.isNotEmpty() && val02.text.isNotEmpty()) {

                val valor01 = val01.text.toString()
                val valor02 = val02.text.toString()

                val resultSoma = valor01.toDouble() + valor02.toDouble()

                resultado.setText("O resultado da soma é: ${resultSoma.toInt()}")
            } else {
                resultado.setText("Preencha todos os valores para realizar o cálculo de soma")
            }
        }


        // BOTÃO DE SUBTRAIR
        btnSubtrair.setOnClickListener {
            if (val01.text.isNotEmpty() && val02.text.isNotEmpty()) {
                val valor01 = val01.text.toString()
                val valor02 = val02.text.toString()

                val resultSubtracao = valor01.toDouble() - valor02.toDouble()

                resultado.setText("O resultado da soma é: ${resultSubtracao.toInt()}")
            } else {
                resultado.setText("Preencha todos os valores para realizar o cálculo de subtração")
            }
        }
    }
}

