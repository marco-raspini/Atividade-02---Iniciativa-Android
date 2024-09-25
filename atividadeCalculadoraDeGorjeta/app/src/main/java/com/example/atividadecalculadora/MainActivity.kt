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

        val resultadoConta = findViewById<TextView>(R.id.txtResultadoConta)
        val resultadoGorjeta = findViewById<TextView>(R.id.txtResultadoGorjeta)
        val resultadoContaGorjeta = findViewById<TextView>(R.id.txtTotalContaGorjeta)
        val val01 = findViewById<EditText>(R.id.valor01)
        val val02 = findViewById<EditText>(R.id.valor02)
        val btnSomar = findViewById<Button>(R.id.btnCalcular)


        //Pega o valor do input da Tela

        // BOTÃO DE SOMA
        btnSomar.setOnClickListener {
            if (val01.text.isNotEmpty() && val02.text.isNotEmpty()) {

                val valorConta = val01.text.toString()
                val valorGorjeta = val02.text.toString()

                val calcGorjeta = valorConta.toDouble() * (valorGorjeta.toDouble() / 100)

                val calcContaToda = (calcGorjeta.toDouble() + valorConta.toDouble())

                resultadoConta.setText("Valor total da Conta: ${valorConta.toDouble()}")
                resultadoGorjeta.setText("Valor total da Gorjeta: ${calcGorjeta.toDouble()}")
                resultadoContaGorjeta.setText("Valor total de tudo: ${calcContaToda.toDouble()}")
            } else {
                resultadoConta.setText("Preencha todos os valores para realizar o cálculo")
            }
        }
    }
}

