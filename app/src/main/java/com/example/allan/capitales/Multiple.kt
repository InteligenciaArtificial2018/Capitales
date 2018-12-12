package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class Multiple : AppCompatActivity() {
    val bdd = FirebaseStorage.getInstance().getReference()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple)

        val random = Random()
        var numerodeimagen = random.nextInt(4)
        val imagen = findViewById<ImageView>(R.id.imageView2)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fatenas.jpg?alt=media&token=01779703-d4b9-4c77-9070-32657c91ec27"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fberna.jpg?alt=media&token=88a49cea-6498-46ca-943d-460a3cb4622f"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbruselas.jpg?alt=media&token=dc81377e-1e51-432a-9464-602aa780ace5"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fcolombia.jpg?alt=media&token=7217176a-22d4-498e-9248-963caca6a85d"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbrasilia.jpg?alt=media&token=edb98082-9bca-4fb2-8492-fd79d88dfb36"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Festocolmo.jpg?alt=media&token=4f7fe1ef-89e1-472a-ad41-9b169cca3505"
        val c7 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fhabana.jpg?alt=media&token=148b7229-7827-47aa-b876-c3d86b9f9c9f"
        val imagenes = arrayOf(c1, c2, c3, c4, c5)

        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
    }
}



