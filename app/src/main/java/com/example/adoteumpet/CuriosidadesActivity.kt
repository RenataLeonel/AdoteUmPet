package com.example.adoteumpet

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.example.adoteumpet.Adapters.AdapterCustomListaCuriosidades
import kotlinx.android.synthetic.main.activity_curiosidades.*
import kotlinx.android.synthetic.main.activity_main.btnlistapet

class CuriosidadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curiosidades)

        val titulo = arrayOf(
            "Beija-flor",
            "Coala",
            "Coruja",
            "Crocodilo",
            "Elefante",
            "Peixe Palhaço",
            "Pinguim",
            "Polvo",
            "Urso Cinza"
        )
        val imagens = arrayOf(
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box,
            R.drawable.curiosidades_box
        )

        val adapter = AdapterCustomListaCuriosidades(this, titulo, imagens)

        listaCuriosidades.adapter = adapter

        listaCuriosidades.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->

                var itemClicado = parent.getItemAtPosition(position)

                val intent =
                    Intent(this, GaleriaCuriosidadesActivity::class.java)
                intent.putExtra(
                    "nomeImagem",
                    itemClicado.toString()
                )

                startActivity(intent)
            }

        btnlistapet.setOnClickListener {
            val intent = Intent(this, ListaPetActivity::class.java)
            startActivity(intent)
        }
    }
}