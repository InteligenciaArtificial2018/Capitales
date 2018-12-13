package com.example.allan.capitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class Multiple : AppCompatActivity() {
    var vidas = 3
    val bdd = FirebaseStorage.getInstance().getReference()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple)

        val random = Random()
        var numerodeimagen = random.nextInt(9)
        var numeropregunta = random.nextInt(9)
        var numeropregunta2 = random.nextInt(9)
        var numeropregunta3 = random.nextInt(9)
        val imagen = findViewById<ImageView>(R.id.imageView2)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fatenas.jpg?alt=media&token=01779703-d4b9-4c77-9070-32657c91ec27"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fberna.jpg?alt=media&token=88a49cea-6498-46ca-943d-460a3cb4622f"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbruselas.jpg?alt=media&token=dc81377e-1e51-432a-9464-602aa780ace5"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Flima.jpg?alt=media&token=31da25bc-3f97-4e7d-93c3-df3d06ab886c"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbrasilia.jpg?alt=media&token=edb98082-9bca-4fb2-8492-fd79d88dfb36"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Festocolmo.jpg?alt=media&token=4f7fe1ef-89e1-472a-ad41-9b169cca3505"
        val c7 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fhabana.jpg?alt=media&token=148b7229-7827-47aa-b876-c3d86b9f9c9f"
        val c8 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fkathmandu.jpg?alt=media&token=bd7cc5d6-f0f7-4d9d-ab27-d8d7628557a3"
        val c9 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbangkok.jpg?alt=media&token=046cb603-9832-41c9-bed1-7f833a10be4a"
        val r1 = "Grecia"
        val r2 = "Suiza"
        val r3 = "Belgica"
        val r4 = "Peru"
        val r5 = "Brasil"
        val r6 = "Suecia"
        val r7 = "Cuba"
        val r8 = "Nepal"
        val r9 = "Tailandia"
        val imagenes = arrayOf(c1, c2, c3, c4, c5, c6, c7, c8, c9)
        val respuestas = arrayOf(r1, r2, r3, r4, r5, r6, r7, r8, r9)

        val respuestacorrecta = findViewById<Button>(R.id.btnMult3)
        val respuesta1 = findViewById<Button>(R.id.btnMult2)
        val respuesta2 = findViewById<Button>(R.id.btnMult1)
        val respuesta3 = findViewById<Button>(R.id.btnPanama)
        val corazon = findViewById<ImageView>(R.id.imgVida)
        val vida2 = findViewById<ImageView>(R.id.imgVida1)
        val vida3 = findViewById<ImageView>(R.id.imgVida2)

        respuesta1.text = respuestas[numeropregunta]
        respuesta2.text = respuestas[numeropregunta2]
        respuesta3.text = respuestas[numeropregunta3]

        respuestacorrecta.text = respuestas[numerodeimagen]

        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)

        respuestacorrecta.setOnClickListener {
            val intent = Intent(this, Multiple::class.java)
            startActivity(intent)
        }
        respuesta1.setOnClickListener {
            corazon.setImageResource(0)
            vidas -= 1
            Toast.makeText(this, "vidas = $vidas", Toast.LENGTH_SHORT).show()
            validacion(vidas)
        }
        respuesta2.setOnClickListener {
            vida3.setImageResource(0)
            vidas -= 1
            Toast.makeText(this, "vidas = $vidas", Toast.LENGTH_SHORT).show()
            validacion(vidas)
        }
        respuesta3.setOnClickListener {
            vida2.setImageResource(0)
            vidas -= 1
            Toast.makeText(this, "vidas = $vidas", Toast.LENGTH_SHORT).show()
            validacion(vidas)
        }
    }
    fun validacion (vidas: Int)
    {
        if (vidas == 0)
        {
            val intent = Intent(this, gameOver::class.java)
            startActivity(intent)
        }
    }
}



