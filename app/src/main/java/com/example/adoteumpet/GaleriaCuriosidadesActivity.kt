package com.example.adoteumpet

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_galeria_curiosidades.*

class GaleriaCuriosidadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria_curiosidades)

        var curiosidade = intent.getStringExtra("nomeImagem")

        if (curiosidade.toString() == "Beija-flor") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_beijaflor)

        } else if (curiosidade.toString() == "Coala") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_coala)

        } else if (curiosidade.toString() == "Coruja") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_coruja)

        } else if (curiosidade.toString() == "Crocodilo") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_crocodilo)

        } else if (curiosidade.toString() == "Elefante") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_elefante)

        } else if (curiosidade.toString() == "Peixe Palhaço") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_peixe)

        } else if (curiosidade.toString() == "Pinguim") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_pinguim)

        } else if (curiosidade.toString() == "Polvo") {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_polvo)

        } else {
            imagensCuriosidades.setImageResource(R.drawable.bg_curiosidades_urso)

        }

        imagensCuriosidades.setOnClickListener {
            val intent = Intent(this, CuriosidadesActivity::class.java)
            startActivity(intent)
        }
    }
}