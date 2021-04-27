package com.example.adoteumpet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncuriosidades.setOnClickListener {
            val intent = Intent(this, CuriosidadesActivity::class.java)
            startActivity(intent)
        }

        btnlistapet.setOnClickListener {
            val intent = Intent(this, ListaPetActivity::class.java)
            startActivity(intent)
        }

        btnSobre.setOnClickListener {
            val intent = Intent (this, SobreActivity::class.java)
            startActivity(intent)
        }





    }
}