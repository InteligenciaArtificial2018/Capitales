package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class MapaNivel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa_nivel2)

        val random = Random()
        var numerodeimagen = random.nextInt(4)
        val imagen = findViewById<ImageView>(R.id.imgMapanivel2)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fhonduras.jpg?alt=media&token=593bac62-66e2-454c-a29a-9b408178c3b1"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2FIndia.png?alt=media&token=9cb4cbe8-e31a-487b-888b-190c72865331"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fnigeria.jpg?alt=media&token=ca1dd94d-2e5f-44a7-9184-b77a7490b3fc"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Ffrancia.jpg?alt=media&token=5242dd3e-8985-4eb0-9a4f-915036d99186"
        val imagenes = arrayOf(c1, c2, c3, c4)

        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
    }
}
