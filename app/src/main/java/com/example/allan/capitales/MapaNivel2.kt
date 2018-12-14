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

class MapaNivel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        var vidas = 3
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa_nivel2)
        val random = Random()
        var numerodeimagen = random.nextInt(3)
        var numeropregunta = random.nextInt(9)
        var numeropregunta2 = random.nextInt(9)
        var numeropregunta3 = random.nextInt(9)
        val imagen = findViewById<ImageView>(R.id.imgMapanivel2)
        val r1 = "Honduras"
        val r2 = "India"
        val r3 = "Nigeria"
        val r4 = "Francia"
        val r5 = "Honduras"
        val r6 = "Suecia"
        val r7 = "Chile"
        val r8 = "Puerto Rico"
        val r9 = "Argentina"
        val r10 = "Libia"
        val r11 = "Lituania"
        val r12 = "Francia"
        val r13 = "Turkmistan"
        val r14 = "Turquia"
        val r15 = "Argelia"
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fhonduras.jpg?alt=media&token=593bac62-66e2-454c-a29a-9b408178c3b1"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2FIndia.png?alt=media&token=9cb4cbe8-e31a-487b-888b-190c72865331"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fnigeria.jpg?alt=media&token=ca1dd94d-2e5f-44a7-9184-b77a7490b3fc"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Ffrancia.jpg?alt=media&token=5242dd3e-8985-4eb0-9a4f-915036d99186"
        val imagenes = arrayOf(c1, c2, c3, c4)
        val respuestas = arrayOf(r1, r2, r3, r4)
        val otras = arrayOf(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)

        val respuestacorrecta = findViewById<Button>(R.id.btn1Mapa2)
        val respuesta1 = findViewById<Button>(R.id.btn3Mapa2)
        val respuesta2 = findViewById<Button>(R.id.btn2Mapa2)
        val respuesta3 = findViewById<Button>(R.id.btn4Mapa2)
        val corazon = findViewById<ImageView>(R.id.imageView3)
        val vida2 = findViewById<ImageView>(R.id.imageView4)
        val vida3 = findViewById<ImageView>(R.id.imageView5)

        respuesta1.text = otras[numeropregunta]
        respuesta2.text = otras[numeropregunta2]
        respuesta3.text = otras[numeropregunta3]

        respuestacorrecta.text = respuestas[numerodeimagen]
        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
        respuestacorrecta.setOnClickListener {
            val intent = Intent(this, MapaNivel2::class.java)
            startActivity((intent))
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
    fun botonatras ()
    {
        val atras = supportActionBar
        if (atras != null)
        {
            atras.setDisplayHomeAsUpEnabled(true)
        }
    }
}
