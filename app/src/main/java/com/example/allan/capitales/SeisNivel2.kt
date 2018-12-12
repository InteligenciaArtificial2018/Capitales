package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class SeisNivel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seis_nivel2)


        val random = Random()
        var numerodeimagen = random.nextInt(9)
        val img1 = findViewById<ImageView>(R.id.imgvS1)
        val img2 = findViewById<ImageView>(R.id.imgvS2)
        val img3 = findViewById<ImageView>(R.id.imgvS3)
        val img4 = findViewById<ImageView>(R.id.imgvS4)
        val img5 = findViewById<ImageView>(R.id.imgvS5)
        val img6 = findViewById<ImageView>(R.id.imgvS6)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fmadrid.jpg?alt=media&token=b6757aa5-9b95-4062-9be4-9d48626c95b2"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fmoscu.jpg?alt=media&token=e5c1793e-d330-4217-aec7-a48a0b5dedc3"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fottawa.jpg?alt=media&token=ce0fc711-d4f6-4a00-a4c2-d881f02fe5e6"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Froma.jpg?alt=media&token=36de91be-e81c-45a8-ad9a-38918eaeeb3d"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Ftokyo.jpg?alt=media&token=8d8251de-a540-4fe7-bc76-986934fe2cb1"
        val c6 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Flisboa.jpg?alt=media&token=c4d26e56-fa22-493e-bbff-54872d1f88bc"
        val c7 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fhabana.jpg?alt=media&token=148b7229-7827-47aa-b876-c3d86b9f9c9f"
        val c8 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fkathmandu.jpg?alt=media&token=bd7cc5d6-f0f7-4d9d-ab27-d8d7628557a3"
        val c9 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel1%2Fdf.jpg?alt=media&token=5f931466-0f47-406a-a268-d47f98929dc0"
        val imagenes1 = arrayOf(c9, c4, c3, c2, c5, c6, c7, c2, c1)
        val imagenes2 = arrayOf(c7, c2, c3, c4, c5, c6, c1, c8, c9)
        val imagenes3 = arrayOf(c3, c2, c9, c4, c5, c6, c7, c8, c1)
        val imagenes4 = arrayOf(c5, c2, c3, c4, c1, c6, c7, c8, c9)
        val imagenes5 = arrayOf(c8, c2, c3, c4, c5, c6, c7, c1, c9)
        val imagenes6 = arrayOf(c2, c1, c3, c4, c5, c6, c7, c8, c9)

        Picasso.get().load(imagenes1[numerodeimagen]).into(img1)
        Picasso.get().load(imagenes2[numerodeimagen]).into(img2)
        Picasso.get().load(imagenes3[numerodeimagen]).into(img3)
        Picasso.get().load(imagenes4[numerodeimagen]).into(img4)
        Picasso.get().load(imagenes5[numerodeimagen]).into(img5)
        Picasso.get().load(imagenes6[numerodeimagen]).into(img6)
    }
}
