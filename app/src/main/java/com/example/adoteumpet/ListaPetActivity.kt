package com.example.adoteumpet

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.adoteumpet.Adapters.AdapterCustomListaPet
import kotlinx.android.synthetic.main.activity_lista_pet.*
import kotlinx.android.synthetic.main.activity_main.btncuriosidades

class ListaPetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pet)

        val titulo = arrayOf(
            "Cão (Rui)",
            "Calopsita (George)",
            "Porco (Gilmar)",
            "Cobra (Karol)",
            "Macaco (Twelves)",
            "Aranha (Celso)"
        )
        val descricao = arrayOf(
            "9 meses, vacinado",
            "8 meses, ferimentos com atadura",
            "3 meses, vacinado e com peso controlado",
            "Idade desconhecida, acompanha gaiola",
            "5 meses, ainda mama",
            "Idade desconhecida, acompanha viveiro"
        )
        val imagens = arrayOf(
            R.drawable.cao_square_360px,
            R.drawable.calopsita_square_360px,
            R.drawable.pig_square_360px,
            R.drawable.cobra_square_360px,
            R.drawable.macaco_square_360px,
            R.drawable.spider_square_360px
        )
        val raca = arrayOf("Vira-lata", "Albina", "Porco Pigmeu", "Naja", "Prego", "Caranguejeira")

        val contato = arrayOf(
            "(61) 98423-4421",
            "contato@petowner.com",
            "juca@animaldoado.com",
            "(61) 99345-9734)",
            "sergio@luzanimalia.net",
            "(62) 97887-4432"
        )

        val adapter = AdapterCustomListaPet(
            this,
            titulo,
            descricao,
            raca,
            contato,
            imagens
        )
        listaPet.adapter = adapter

        listaPet.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                var itemClicado = parent.getItemAtPosition(position)
                Toast.makeText(this, "Pressione ${itemClicado} para adotar", Toast.LENGTH_LONG)
                    .show()
            }

        listaPet.setOnItemLongClickListener { adapterView: AdapterView<*>, view: View, position: Int, id: Long ->
            val item = adapter.getItem(position)
            val webIntent: Intent =
                Uri.parse("https://api.whatsapp.com/send?1=pt_BR&phone=5561995077620")
                    .let { webpage ->
                        Intent(Intent.ACTION_VIEW, webpage)
                    }
            startActivity(webIntent)
            true
        }

        btncuriosidades.setOnClickListener {
            val intent = Intent(this, CuriosidadesActivity::class.java)
            startActivity(intent)
        }
    }
}
