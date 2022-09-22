package com.schaffen.proyectofinal

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDriver=findViewById<Button>(R.id.btnDriver)
        val btnClient=findViewById<Button>(R.id.btnClient)
        //val sharedPref = this?.getSharedPreferences(
        //    getString(R.string.preference_file_key), Context.MODE_PRIVATE)


        //Comentario Activity Main

        btnClient.setOnClickListener{
            val login = Intent(this, SelectOptionAuthActivity::class.java)
            startActivity(login)
        }

        btnDriver.setOnClickListener{
            val login = Intent(this, SelectOptionAuthActivity::class.java)
            startActivity(login)
        }
    }
}