package com.example.allan.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import java.util.*

class TiempoNivel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val DB = FirebaseStorage.getInstance().getReference()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiempo_nivel2)


        val random = Random()
        var numerodeimagen = random.nextInt(4)
        val imagen = findViewById<ImageView>(R.id.imgCapitaltiempo2)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2F0slo.jpg?alt=media&token=b82da971-2987-4184-baa5-e96177057e3e"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fparis.jpg?alt=media&token=bdacabae-4c7d-4497-adcc-806cd8a072de"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Froma.jpg?alt=media&token=36de91be-e81c-45a8-ad9a-38918eaeeb3d"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Nivel2%2Fdelhi.jpg?alt=media&token=d077f54d-4ba5-4ed6-b175-10c449331ed0"
        val imagenes = arrayOf(c1, c2, c3, c4)

        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
    }
}
