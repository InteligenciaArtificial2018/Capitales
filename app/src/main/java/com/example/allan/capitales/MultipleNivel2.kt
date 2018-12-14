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

class MultipleNivel2 : AppCompatActivity() {
    val base = FirebaseStorage.getInstance().getReference()
    var vidas = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple_nivel2)
        val random = Random()

        var numerodeimagen = random.nextInt(9)
        var numeropregunta = random.nextInt(9)
        var numeropregunta2 = random.nextInt(9)
        var numeropregunta3 = random.nextInt(9)
        val imagen = findViewById<ImageView>(R.id.imgvMultnivel2)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2F0slo.jpg?alt=media&token=b82da971-2987-4184-baa5-e96177057e3e"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fdelhi.jpg?alt=media&token=d077f54d-4ba5-4ed6-b175-10c449331ed0"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Flisboa.jpg?alt=media&token=c4d26e56-fa22-493e-bbff-54872d1f88bc"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fperu.jpg?alt=media&token=8f099ae5-a182-4fce-8f38-6aac423298b3"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fthimphu.jpg?alt=media&token=6ec8410e-ddfc-431b-9ea2-4b70d5b393ad"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fparis.jpg?alt=media&token=bdacabae-4c7d-4497-adcc-806cd8a072de"
        val c7 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fteheran.jpg?alt=media&token=0835a464-b240-4011-accb-30e2538ccfab"
        val c8 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fmoscu.jpg?alt=media&token=e5c1793e-d330-4217-aec7-a48a0b5dedc3"
        val c9 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fsantiago.jpg?alt=media&token=e0ad25a1-79fa-42ce-9a18-b29f1f870a26"
        val imagenes = arrayOf(c1, c2, c3, c4, c5, c6, c7, c8, c9)
        val r1 = "Noruega"
        val r2 = "India"
        val r3 = "Portugal"
        val r4 = "Peru"
        val r5 = "Butan"
        val r6 = "Francia"
        val r7 = "Iran"
        val r8 = "Rusia"
        val r9 = "Chile"

        val respuestas = arrayOf(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
        val respuestacorrecta = findViewById<Button>(R.id.btn2Multnivel2)
        val respuesta1 = findViewById<Button>(R.id.btn1Multnivel2)
        val respuesta2 = findViewById<Button>(R.id.btn3Multnivel2)
        val respuesta3 = findViewById<Button>(R.id.btn4Multnivel2)
        val corazon = findViewById<ImageView>(R.id.imgVida)
        val vida2 = findViewById<ImageView>(R.id.imgVida1)
        val vida3 = findViewById<ImageView>(R.id.imgVida2)

        respuesta1.text = respuestas[numeropregunta]
        respuesta2.text = respuestas[numeropregunta2]
        respuesta3.text = respuestas[numeropregunta3]

        respuestacorrecta.text = respuestas[numerodeimagen]

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
