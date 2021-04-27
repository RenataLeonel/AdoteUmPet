package com.example.adoteumpet.Adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.adoteumpet.R

class AdapterCustomListaCuriosidades (private val context: Activity,
                                      private val title:Array<String>,
                                      private val imageId:Array<Int>)
    : ArrayAdapter<String>(context, R.layout.activity_curiosidades, title) {

    //Sobrescrita do método getView
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflar = context.layoutInflater //Inflater = colocar um xml dentro de outro
        val linha = inflar.inflate(R.layout.listview_curiosidades, null, true)

        val titulo = linha.findViewById(R.id.titulo) as TextView //Para passar os valores
        val imagem = linha.findViewById(R.id.icone) as ImageView

        titulo.text = title[position] //Variável titulo recebe parametro title baseado na posição
        imagem.setImageResource(imageId[position])

        return linha
    }
}
