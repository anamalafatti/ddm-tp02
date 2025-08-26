package br.unisanta.tp02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class LivroDetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livro_detalhes)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        val txtDetalhes = findViewById<TextView>(R.id.txtLivroDetalhes)
        txtDetalhes.text = "Título: $titulo\nAutor: $autor"
    }
}