package com.example.allan.capitales

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_multiple.*
import java.util.*

class Multiple : AppCompatActivity() {
    val bdd = FirebaseStorage.getInstance().getReference()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple)


        val random = Random()
        var numerodeimagen = random.nextInt(4)
        val imagen = findViewById<ImageView>(R.id.imageView2)
        val c1 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Capitales%2FKathmandu.jpg?alt=media&token=b2253dc8-fb52-4cfc-93c1-b5e42a59681a"
        val c2 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Capitales%2FBagdad.jpg?alt=media&token=1b66bf3c-8ec0-41b1-9573-05a236a1438b"
        val c3 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Capitales%2FHelsinki.jpg?alt=media&token=aea4fa9c-9d12-4442-b4a0-08a0188dd515"
        val c4 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Capitales%2FKingston.jpg?alt=media&token=06426f0a-b674-4f87-a240-b43a5cb19769"
        val c5 = "https://firebasestorage.googleapis.com/v0/b/capitales-cb1bd.appspot.com/o/Capitales%2FLisboa.jpg?alt=media&token=214824e7-ab07-4896-be86-ec00956e3689"

        val imagenes = arrayOf(c1, c2, c3, c4, c5)

        Picasso.get().load(imagenes[numerodeimagen]).into(imagen)
    }
}


