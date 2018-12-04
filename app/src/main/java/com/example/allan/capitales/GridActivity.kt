package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class GridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel0)

        val capitales = ArrayList<Capitales>()

        capitales.add(Capitales("Grecia", R.drawable.atenas))


        val laLista = findViewById<GridView>(R.id.gvLista)

        // val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, capitales)
        val adaptador = AdaptadorCustom(this, capitales)

        laLista.adapter = adaptador

        laLista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, capitales.get(position).nombre, Toast.LENGTH_SHORT).show()
        }
    }
}


