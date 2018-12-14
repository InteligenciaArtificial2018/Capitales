package com.example.allan.capitales

import android.content.Intent
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
        var numerodepregunta = random.nextInt(5)
        val img1 = findViewById<ImageView>(R.id.imgV1)
        val img2 = findViewById<ImageView>(R.id.imgV2)
        val img3 = findViewById<ImageView>(R.id.imgV3)
        val img4 = findViewById<ImageView>(R.id.imgV4)
        val img5 = findViewById<ImageView>(R.id.imgV5)
        val img6 = findViewById<ImageView>(R.id.imgV6)

        val r1 = "Grecia"
        val r2 = "Suiza"
        val r3 = "Belgica"
        val r4 = "Sudafrica"
        val r5 = "Venezuela"
        val r6 = "Suecia"
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fatenas.jpg?alt=media&token=01779703-d4b9-4c77-9070-32657c91ec27"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fberna.jpg?alt=media&token=88a49cea-6498-46ca-943d-460a3cb4622f"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbruselas.jpg?alt=media&token=dc81377e-1e51-432a-9464-602aa780ace5"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fcabo.jpg?alt=media&token=42ffb2ad-2712-4d6b-b5d1-4bccd1c35e5a"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fcaracas.jpg?alt=media&token=2ed32e1f-324f-43c2-98ac-cf374719a03b"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Festocolmo.jpg?alt=media&token=4f7fe1ef-89e1-472a-ad41-9b169cca3505"
        val imagenes = arrayOf(c1, c2, c3, c4, c5, c6)
        val respuestas= arrayOf(r1, r2, r3, r4, r5, r6)
        val corazon = findViewById<ImageView>(R.id.imgVida)
        val vida2 = findViewById<ImageView>(R.id.imgVida1)
        val vida3 = findViewById<ImageView>(R.id.imgVida2)

        val respuesta = findViewById<TextView>(R.id.textView3)
        respuesta.setText(respuestas[numerodepregunta])

        if (respuesta.text == respuestas[0])
        {
            Picasso.get().load(imagenes[0]).into(img1)
            Picasso.get().load(imagenes[2]).into(img2)
            Picasso.get().load(imagenes[4]).into(img3)
            Picasso.get().load(imagenes[5]).into(img4)
            Picasso.get().load(imagenes[3]).into(img5)
            Picasso.get().load(imagenes[1]).into(img6)
            img1.setOnClickListener {
                if (respuesta.text == respuestas[0])
                {
                    img1.setImageResource(0)
                    val intent = Intent(this, SeisNivel1::class.java)
                    startActivity(intent)
                }
            }
        }
        else if (respuesta.text == respuestas[1])
        {
            Picasso.get().load(imagenes[1]).into(img2)
            Picasso.get().load(imagenes[0]).into(img1)
            Picasso.get().load(imagenes[4]).into(img3)
            Picasso.get().load(imagenes[5]).into(img4)
            Picasso.get().load(imagenes[2]).into(img5)
            Picasso.get().load(imagenes[3]).into(img6)
            img2.setOnClickListener {
                if (respuesta.text == respuestas[1])
                {
                    img2.setImageResource(0)
                    val intent = Intent(this, SeisNivel1::class.java)
                    startActivity(intent)
                }
            }
        }
        else if (respuesta.text == respuestas[2])
        {
            Picasso.get().load(imagenes[2]).into(img3)
            Picasso.get().load(imagenes[1]).into(img2)
            Picasso.get().load(imagenes[3]).into(img1)
            Picasso.get().load(imagenes[4]).into(img4)
            Picasso.get().load(imagenes[5]).into(img5)
            Picasso.get().load(imagenes[0]).into(img6)
            img3.setOnClickListener {
                if (respuesta.text == respuestas[2])
                {
                    img3.setImageResource(0)
                    val intent = Intent(this, SeisNivel1::class.java)
                    startActivity(intent)
                }
                else
                {
                    vida3.setImageResource(0)
                }
            }
        }
        else if (respuesta.text == respuestas[3])
        {
            Picasso.get().load(imagenes[3]).into(img4)
            Picasso.get().load(imagenes[0]).into(img2)
            Picasso.get().load(imagenes[1]).into(img3)
            Picasso.get().load(imagenes[4]).into(img1)
            Picasso.get().load(imagenes[5]).into(img5)
            Picasso.get().load(imagenes[2]).into(img6)
            img4.setOnClickListener {
                if (respuesta.text == respuestas[3])
                {
                    img4.setImageResource(0)
                    val intent = Intent(this, SeisNivel1::class.java)
                    startActivity(intent)
                }
                else
                {
                    corazon.setImageResource(0)
                }
            }
        }
        else if (respuesta.text == respuestas[4])
        {
            Picasso.get().load(imagenes[4]).into(img5)
            Picasso.get().load(imagenes[1]).into(img2)
            Picasso.get().load(imagenes[3]).into(img3)
            Picasso.get().load(imagenes[0]).into(img4)
            Picasso.get().load(imagenes[2]).into(img1)
            Picasso.get().load(imagenes[5]).into(img6)
            img5.setOnClickListener {
                if (respuesta.text == respuestas[4])
                {
                    img5.setImageResource(0)
                    val intent = Intent(this, SeisNivel1::class.java)
                    startActivity(intent)
                }
                else
                {
                    vida2.setImageResource(0)
                }
            }
        }
        else if (respuesta.text == respuestas[5])
        {
            Picasso.get().load(imagenes[5]).into(img6)
            Picasso.get().load(imagenes[1]).into(img2)
            Picasso.get().load(imagenes[3]).into(img3)
            Picasso.get().load(imagenes[4]).into(img4)
            Picasso.get().load(imagenes[2]).into(img5)
            Picasso.get().load(imagenes[0]).into(img1)
            img6.setOnClickListener {
                if (respuesta.text == respuestas[5])
                {
                    img5.setImageResource(0)
                    val intent = Intent(this, SeisNivel1::class.java)
                    startActivity(intent)
                }
            }
        }
        else
        {
            vida2.setImageResource(0)
        }
    }
}
