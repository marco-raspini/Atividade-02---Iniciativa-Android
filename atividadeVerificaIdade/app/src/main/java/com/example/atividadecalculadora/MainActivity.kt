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


        btnCalcular.setOnClickListener {
            if (val01.text.isNotEmpty()) {

                val idade = val01.text.toString()

                val age = idade.toInt()

                if (age < 18) {
                    resultado.setText("Menor de idade")
                } else if (age >= 18 && age <= 60){
                    resultado.setText("Maior de Idade")
                } else {
                    resultado.setText("Idoso")
                }

                val01.text.clear()

            } else {
                resultado.setText("Preencha todos os valores para verificar a idade")
            }
        }
    }
}

