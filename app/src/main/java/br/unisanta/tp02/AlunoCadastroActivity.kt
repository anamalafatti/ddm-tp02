package br.unisanta.tp02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AlunoCadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aluno_cadastro)

        val edtNome = findViewById<EditText>(R.id.edtNomeAluno)
        val btnAvancar = findViewById<Button>(R.id.btnAvancarAluno)

        btnAvancar.setOnClickListener {
            val intent = Intent(this, AlunoDetalhesActivity::class.java)
            intent.putExtra("nome", edtNome.text.toString())
            startActivity(intent)
        }
    }
}