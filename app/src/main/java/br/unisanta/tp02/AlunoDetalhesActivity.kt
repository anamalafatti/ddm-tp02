package br.unisanta.tp02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class AlunoDetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aluno_detalhes)

        val nome = intent.getStringExtra("nome")
        val txtAluno = findViewById<TextView>(R.id.txtAlunoDetalhes)
        val btnGerar = findViewById<Button>(R.id.btnGerarMatricula)

        btnGerar.setOnClickListener {
            val matricula = Random.nextInt(1000, 9999) // Gera matrícula de 4 dígitos
            txtAluno.text = "Nome: $nome\nMatrícula: $matricula"
        }
    }
}