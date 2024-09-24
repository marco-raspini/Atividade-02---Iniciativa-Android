package com.example.atividade2calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Dizer qual a tela que vai ser carregada
        val resultado = findViewById<TextView>(R.id.txtResultado)
        val tentSenha = findViewById<EditText>(R.id.tentSenha)
        val btnValidacao = findViewById<Button>(R.id.btnValidacao)

        val senhaSetada = "Teste@123"

        //Pega o valor do input da Tela


        // BOTÃO DE VALIDAÇÃO
        btnValidacao.setOnClickListener {
            if (tentSenha.text.isNotEmpty()) {

                val senhaTentada = tentSenha.text.toString()

                if (senhaTentada.equals(senhaSetada)) {

                    resultado.setText("Senha ${senhaTentada} esta correta!")

                } else {

                    resultado.setText("Senha ${senhaTentada} que você utilizou esta incorreta")

                }
            } else {
                resultado.setText("Preencha o campo da senha para validarmos")
            }
        }
    }
}