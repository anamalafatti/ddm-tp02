package br.unisanta.tp02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLivro = findViewById<Button>(R.id.btnLivro)
        val btnAluno = findViewById<Button>(R.id.btnAluno)

        btnLivro.setOnClickListener {
            startActivity(Intent(this, LivroCadastroActivity::class.java))
        }

        btnAluno.setOnClickListener {
            startActivity(Intent(this, AlunoCadastroActivity::class.java))
        }
    }
}