package com.example.adoteumpet.Adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.adoteumpet.R

class AdapterCustomListaPet (private val context: Activity,
                             private val title:Array<String>,
                             private val description:Array<String>,
                             private val breed:Array<String>,
                             private val contact:Array<String>,
                             private val imageId:Array<Int>)
    : ArrayAdapter<String>(context, R.layout.listview_adote, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflar = context.layoutInflater
        val linha = inflar.inflate(R.layout.listview_adote, null, true)

        val titulo = linha.findViewById(R.id.titulo) as TextView
        val descricao = linha.findViewById(R.id.descricao) as TextView
        val raca = linha.findViewById(R.id.raca) as TextView
        val contato = linha.findViewById(R.id.contato) as TextView
        val imagem = linha.findViewById(R.id.icone) as ImageView

        titulo.text = title[position]
        descricao.text = description[position]
        raca.text = breed[position]
        contato.text = contact[position]
        imagem.setImageResource(imageId[position])
        return linha
    }
}
