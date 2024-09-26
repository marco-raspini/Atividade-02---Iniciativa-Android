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
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)


        //Pega o valor do input da Tela

        // BOTÃO DE SOMA
        btnCalcular.setOnClickListener {
            if (val01.text.isNotEmpty()) {

                val numero = (1..100).random()

                val chute = val01.text.toString()

                val numeroSelecionado = numero.toInt()
                val resultChute = chute.toInt()


                if (resultChute < numero) {
                    resultado.setText("Seu palpite é muito baixo.")
                } else if (resultChute > numero){
                    resultado.setText("Seu palpite é muito alto.")
                } else {
                    resultado.setText("Parabéns você acertou o número")
                }
            } else {
                resultado.setText("Preencha um valor para a tentativa ")
            }
        }
    }
}

