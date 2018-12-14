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

class MapaNivel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        var vidas = 3
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa_nivel1)

        val random = Random()
        var numerodeimagen = random.nextInt(5)
        var numeropregunta = random.nextInt(9)
        var numeropregunta2 = random.nextInt(9)
        var numeropregunta3 = random.nextInt(9)
        val imagen = findViewById<ImageView>(R.id.imgvMapanivel1)
        val r1 = "Australia"
        val r2 = "Brasil"
        val r3 = "Japon"
        val r4 = "Colombia"
        val s1 = "Holanda"
        val s2 = "China"
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
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Faustralia.jpg?alt=media&token=34925629-d211-47fd-88f7-a6b1d73fe9bc"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbrasil.jpg?alt=media&token=7d253638-ae4a-42b1-9765-badb9a22e1e4"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fjapon.jpg?alt=media&token=02fc6b03-a494-4ad8-900e-08e38447cbea"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fcolombia.jpg?alt=media&token=7217176a-22d4-498e-9248-963caca6a85d"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fholanda.jpg?alt=media&token=49aedf67-ef12-4ff3-9459-492dc8992113"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fchina.jpg?alt=media&token=85648f4f-dc69-4580-95fc-0dd944374621"
        val imagenes = arrayOf(c1, c2, c3, c4, c5, c6)
        val respuestas = arrayOf(r1, r2, r3, r4, s1, s2)
        val otras = arrayOf(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)

        val respuestacorrecta = findViewById<Button>(R.id.btnMapa1)
        val respuesta1 = findViewById<Button>(R.id.btnMapa2)
        val respuesta2 = findViewById<Button>(R.id.btnMapa3)
        val respuesta3 = findViewById<Button>(R.id.btnMapa4)
        val corazon = findViewById<ImageView>(R.id.imageView3)
        val vida2 = findViewById<ImageView>(R.id.imageView4)
        val vida3 = findViewById<ImageView>(R.id.imageView5)

        respuesta1.text = otras[numeropregunta]
        respuesta2.text = otras[numeropregunta2]
        respuesta3.text = otras[numeropregunta3]

        respuestacorrecta.text = respuestas[numerodeimagen]
        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)

        respuestacorrecta.setOnClickListener {
            val intent = Intent(this, MapaNivel1::class.java)
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
