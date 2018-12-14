package com.example.allan.capitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class TiempoNivel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
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
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiempo_nivel2)
        elhandler = Handler()
        elhandler!!.postDelayed(corriendo, tiempo)
        val random = Random()
        val tiempito = findViewById<TextView>(R.id.textView8)
        val tiempofinal = tiempo/1000
        tiempito.setText(tiempofinal.toString())
        var numerodeimagen = random.nextInt(3)
        val imagen = findViewById<ImageView>(R.id.imgCapitaltiempo2)
        var numeropregunta = random.nextInt(3)
        var numeropregunta2 = random.nextInt(3)
        var numeropregunta3 = random.nextInt(3)
        val r1 = "Noruega"
        val r2 = "Francia"
        val r3 = "Italia"
        val r4 = "India"
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2F0slo.jpg?alt=media&token=b82da971-2987-4184-baa5-e96177057e3e"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fparis.jpg?alt=media&token=bdacabae-4c7d-4497-adcc-806cd8a072de"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Froma.jpg?alt=media&token=36de91be-e81c-45a8-ad9a-38918eaeeb3d"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fdelhi.jpg?alt=media&token=d077f54d-4ba5-4ed6-b175-10c449331ed0"
        val imagenes = arrayOf(c1, c2, c3, c4)
        val respuestas = arrayOf(r1, r2, r3, r4)
        val respuestacorrecta = findViewById<Button>(R.id.btn3Tiempo2)
        val respuesta1 = findViewById<Button>(R.id.btn2Tiempo2)
        val respuesta2 = findViewById<Button>(R.id.btn4Tiempo2)
        val respuesta3 = findViewById<Button>(R.id.btn1Tiempo2)

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
