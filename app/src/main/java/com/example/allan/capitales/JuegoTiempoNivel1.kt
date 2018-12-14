package com.example.allan.capitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.allan.capitales.R.drawable.corazon
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class JuegoTiempoNivel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var vidas = 3
        var elhandler : Handler? = null

        val tiempo : Long = 5000

        val corriendo: Runnable = Runnable()
        {
            if (!isFinishing)
            {
                val intent = Intent(this, Nivel1::class.java)
                startActivity(intent)
            }
        }
        val DB = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego_tiempo_nivel1)

        elhandler = Handler()
        elhandler!!.postDelayed(corriendo, tiempo)
        val random = Random()
        val tiempito = findViewById<TextView>(R.id.textView9)
        val tiempofinal = tiempo/1000
        tiempito.setText(tiempofinal.toString())
        var numerodeimagen = random.nextInt(3)
        val imagen = findViewById<ImageView>(R.id.imgCapitaltiempo1)
        var numeropregunta = random.nextInt(3)
        var numeropregunta2 = random.nextInt(3)
        var numeropregunta3 = random.nextInt(3)
        val r1 = "Jamaica"
        val r2 = "Peru"
        val r3 = "Cuba"
        val r4 = "China"
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fkingston.jpg?alt=media&token=118c124b-bfb1-42c8-a84a-210dd7b7d38a"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Flima.jpg?alt=media&token=31da25bc-3f97-4e7d-93c3-df3d06ab886c"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fhabana.jpg?alt=media&token=148b7229-7827-47aa-b876-c3d86b9f9c9f"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fbeijingjpg.jpg?alt=media&token=b3ee8eff-6b40-431c-b54c-9af49c6c9a6d"
        val imagenes = arrayOf(c1, c2, c3, c4)
        val respuestas = arrayOf(r1, r2, r3, r4)

        val respuestacorrecta = findViewById<Button>(R.id.btnTiempo5)
        val respuesta1 = findViewById<Button>(R.id.btnTiempo1)
        val respuesta2 = findViewById<Button>(R.id.btnTiempo3)
        val respuesta3 = findViewById<Button>(R.id.btnTiempo4)

        respuesta1.text = respuestas[numeropregunta]
        respuesta2.text = respuestas[numeropregunta2]
        respuesta3.text = respuestas[numeropregunta3]

        respuestacorrecta.text = respuestas[numerodeimagen]
        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)

        respuestacorrecta.setOnClickListener {
            val intent = Intent(this, JuegoTiempoNivel1::class.java)
            startActivity((intent))
        }
        respuesta1.setOnClickListener {

            vidas -= 1
            Toast.makeText(this, "vidas = $vidas", Toast.LENGTH_SHORT).show()
            validacion(vidas)
        }
        respuesta2.setOnClickListener {

            vidas -= 1
            Toast.makeText(this, "vidas = $vidas", Toast.LENGTH_SHORT).show()
            validacion(vidas)
        }
        respuesta3.setOnClickListener {

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
