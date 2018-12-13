package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class SeisNivel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val base = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seis_nivel1)

        val random = Random()
        var numerodeimagen = random.nextInt(1)
        var numerodepregunta = random.nextInt(11)
        val img1 = findViewById<ImageView>(R.id.imgV1)
        val img2 = findViewById<ImageView>(R.id.imgV2)
        val img3 = findViewById<ImageView>(R.id.imgV3)
        val img4 = findViewById<ImageView>(R.id.imgV4)
        val img5 = findViewById<ImageView>(R.id.imgV5)
        val img6 = findViewById<ImageView>(R.id.imgV6)

        val r = "Grecia"
        val r1 = "Suiza"
        val r2 = "Belgica"
        val r3 = "Sudafrica"
        val r4 = "Venezuela"
        val r5 = "Suecia"
        val r6 = "Cuba"
        val r7 = "Nepal"
        val r8 = "Mexico"
        val r9 = "Jamaica"
        val r10 = "Finlandia"
        val r11 = "Brasil"
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fatenas.jpg?alt=media&token=01779703-d4b9-4c77-9070-32657c91ec27"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fberna.jpg?alt=media&token=88a49cea-6498-46ca-943d-460a3cb4622f"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbruselas.jpg?alt=media&token=dc81377e-1e51-432a-9464-602aa780ace5"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fcabo.jpg?alt=media&token=42ffb2ad-2712-4d6b-b5d1-4bccd1c35e5a"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fcaracas.jpg?alt=media&token=2ed32e1f-324f-43c2-98ac-cf374719a03b"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Festocolmo.jpg?alt=media&token=4f7fe1ef-89e1-472a-ad41-9b169cca3505"
        val c7 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fhabana.jpg?alt=media&token=148b7229-7827-47aa-b876-c3d86b9f9c9f"
        val c8 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fkathmandu.jpg?alt=media&token=bd7cc5d6-f0f7-4d9d-ab27-d8d7628557a3"
        val c9 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fdf.jpg?alt=media&token=5f931466-0f47-406a-a268-d47f98929dc0"
        val c10 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fkingston.jpg?alt=media&token=118c124b-bfb1-42c8-a84a-210dd7b7d38a"
        val c11 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fhelsinki.jpg?alt=media&token=68f5b4bf-d820-4826-9339-096c63cea0ad"
        val c12 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbrasilia.jpg?alt=media&token=edb98082-9bca-4fb2-8492-fd79d88dfb36"
        val imagenes1 = arrayOf(c1, c2)
        val respuestas= arrayOf(r, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        val imagenes2 = arrayOf(c3, c4)
        val imagenes3 = arrayOf(c5, c6)
        val imagenes4 = arrayOf(c7, c8)
        val imagenes5 = arrayOf(c9, c10)
        val imagenes6 = arrayOf(c11, c12)
        val corazon = findViewById<ImageView>(R.id.imgVida)
        val vida2 = findViewById<ImageView>(R.id.imgVida1)
        val vida3 = findViewById<ImageView>(R.id.imgVida2)

        val respuesta = findViewById<TextView>(R.id.textView3)
        respuesta.setText(respuestas[numerodepregunta])

        Picasso.get().load(imagenes1[numerodeimagen]).into(img1)
        Picasso.get().load(imagenes2[numerodeimagen]).into(img2)
        Picasso.get().load(imagenes3[numerodeimagen]).into(img3)
        Picasso.get().load(imagenes4[numerodeimagen]).into(img4)
        Picasso.get().load(imagenes5[numerodeimagen]).into(img5)
        Picasso.get().load(imagenes6[numerodeimagen]).into(img6)
    }
}
