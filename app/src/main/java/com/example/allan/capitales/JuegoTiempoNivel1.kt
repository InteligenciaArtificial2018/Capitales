package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class JuegoTiempoNivel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego_tiempo_nivel1)

        val random = Random()
        var numerodeimagen = random.nextInt(4)
        val imagen = findViewById<ImageView>(R.id.imgCapitaltiempo1)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fkingston.jpg?alt=media&token=118c124b-bfb1-42c8-a84a-210dd7b7d38a"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Flima.jpg?alt=media&token=31da25bc-3f97-4e7d-93c3-df3d06ab886c"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fhabana.jpg?alt=media&token=148b7229-7827-47aa-b876-c3d86b9f9c9f"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbeijingjpg.jpg?alt=media&token=b3ee8eff-6b40-431c-b54c-9af49c6c9a6d"
        val imagenes = arrayOf(c1, c2, c3, c4)

        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
    }
}
