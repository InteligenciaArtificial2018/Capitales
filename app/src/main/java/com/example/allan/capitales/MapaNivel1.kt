package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class MapaNivel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa_nivel1)

        val random = Random()
        var numerodeimagen = random.nextInt(4)
        val imagen = findViewById<ImageView>(R.id.imgvMapanivel1)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Faustralia.jpg?alt=media&token=34925629-d211-47fd-88f7-a6b1d73fe9bc"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbrasil.jpg?alt=media&token=7d253638-ae4a-42b1-9765-badb9a22e1e4"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fjapon.jpg?alt=media&token=02fc6b03-a494-4ad8-900e-08e38447cbea"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fcolombia.jpg?alt=media&token=7217176a-22d4-498e-9248-963caca6a85d"
        val imagenes = arrayOf(c1, c2, c3, c4)

        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
    }
}
