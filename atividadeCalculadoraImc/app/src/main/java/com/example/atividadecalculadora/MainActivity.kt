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
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)


        //Pega o valor do input da Tela

        // BOTÃO DE SOMA
        btnCalcular.setOnClickListener {
            if (val01.text.isNotEmpty() && val02.text.isNotEmpty()) {

                val altura = val01.text.toString()
                val peso = val02.text.toString()

                val resultCalculo = (peso.toDouble() / (altura.toDouble() * altura.toDouble()))

                if (resultCalculo <= 18.4) {
                    resultado.setText("Abaixo do Peso")
                } else if (resultCalculo >= 18.5 && resultCalculo <= 24.9){
                    resultado.setText("Peso Normal")
                } else if (resultCalculo >= 25 && resultCalculo <= 29.9) {
                    resultado.setText("Sobrepeso")
                } else {
                    resultado.setText("Obesidade")
                }

            } else {
                resultado.setText("Preencha todos os valores para realizar o cálculo de IMC")
            }
        }
    }
}

