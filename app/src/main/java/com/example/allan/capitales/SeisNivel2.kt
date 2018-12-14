package com.example.allan.capitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class SeisNivel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seis_nivel2)


        val random = Random()
        var numerodepregunta= random.nextInt(5)
        val img1 = findViewById<ImageView>(R.id.imgvS1)
        val img2 = findViewById<ImageView>(R.id.imgvS2)
        val img3 = findViewById<ImageView>(R.id.imgvS3)
        val img4 = findViewById<ImageView>(R.id.imgvS4)
        val img5 = findViewById<ImageView>(R.id.imgvS5)
        val img6 = findViewById<ImageView>(R.id.imgvS6)
        val r1 = "España"
        val r2 = "Rusia"
        val r3 = "Canada"
        val r4 = "Italia"
        val r5 = "Japon"
        val r6 = "Portugal"
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fmadrid.jpg?alt=media&token=b6757aa5-9b95-4062-9be4-9d48626c95b2"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fmoscu.jpg?alt=media&token=e5c1793e-d330-4217-aec7-a48a0b5dedc3"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fottawa.jpg?alt=media&token=ce0fc711-d4f6-4a00-a4c2-d881f02fe5e6"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Froma.jpg?alt=media&token=36de91be-e81c-45a8-ad9a-38918eaeeb3d"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Ftokyo.jpg?alt=media&token=8d8251de-a540-4fe7-bc76-986934fe2cb1"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Flisboa.jpg?alt=media&token=c4d26e56-fa22-493e-bbff-54872d1f88bc"

        val imagenes = arrayOf(c1, c2, c3, c4, c5, c6)
        val respuestas= arrayOf(r1, r2, r3, r4, r5, r6)
        val corazon = findViewById<ImageView>(R.id.imgVida)
        val vida2 = findViewById<ImageView>(R.id.imgVida1)
        val vida3 = findViewById<ImageView>(R.id.imgVida2)

        val respuesta = findViewById<TextView>(R.id.textView6)
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
                    val intent = Intent(this, SeisNivel2::class.java)
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
                    val intent = Intent(this, SeisNivel2::class.java)
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
                    val intent = Intent(this, SeisNivel2::class.java)
                    startActivity(intent)
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
                    val intent = Intent(this, SeisNivel2::class.java)
                    startActivity(intent)
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
                    val intent = Intent(this, SeisNivel2::class.java)
                    startActivity(intent)
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
                    val intent = Intent(this, SeisNivel2::class.java)
                    startActivity(intent)
                }
            }
        }
        else
        {

        }
    }
}
