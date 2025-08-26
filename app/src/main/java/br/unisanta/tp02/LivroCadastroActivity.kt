package br.unisanta.tp02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LivroCadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livro_cadastro)

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrarLivro)

        btnCadastrar.setOnClickListener {
            val intent = Intent(this, LivroDetalhesActivity::class.java)
            intent.putExtra("titulo", edtTitulo.text.toString())
            intent.putExtra("autor", edtAutor.text.toString())
            startActivity(intent)
        }
    }
}