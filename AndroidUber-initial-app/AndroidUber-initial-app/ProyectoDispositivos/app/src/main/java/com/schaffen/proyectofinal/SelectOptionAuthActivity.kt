package com.schaffen.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectOptionAuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_option_auth)

        //Esto es un appbar en pantalla para seleccionar si es cliente o chofer pero se cae sin debug entonces lo comenté - video 12

        //setSupportActionBar(findViewById(R.id.toolbar))
        //supportActionBar?.setTitle("Seleccionar opción")
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnLogin=findViewById<Button>(R.id.btnLogin)
        val btnRegister=findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener{
            val login = Intent(this, LoginActivity::class.java)
            startActivity(login)
        }

        btnRegister.setOnClickListener{
            val login = Intent(this, RegisterActivity::class.java)
            startActivity(login)
        }
    }

}