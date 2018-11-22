package com.example.allan.capitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG = "com.example.allan.Main.NIVEL1"

        var btnNiveluno = findViewById<Button>(R.id.btnNiveluno)


        btnNiveluno.setOnClickListener {
            val intent = Intent(this, Nivel1::class.java)
            startActivity(intent)


            val TAG = "com.example.allan.Main.NIVEL2"

            var btnNiveldos = findViewById<Button>(R.id.btnNiveldos)


            btnNiveldos.setOnClickListener {
                val intent = Intent(this, Nivel2::class.java)
                startActivity(intent)

                val TAG = "com.example.allan.Main.NIVEL3"

                var btnNiveltres = findViewById<Button>(R.id.btnNiveltres)


                btnNiveltres.setOnClickListener {
                    val intent = Intent(this, nivel3::class.java)
                    startActivity(intent)


                }
            }
        }
    }
}
