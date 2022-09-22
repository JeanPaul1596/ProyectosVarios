package com.schaffen.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    private lateinit var txtEmail:TextInputEditText
    private lateinit var txtPassword:TextInputEditText

    //Intancianos el autenticador de firebase
    private lateinit var Autenticador: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtEmail=findViewById<TextInputEditText>(R.id.txtInputEmail)
        txtPassword=findViewById<TextInputEditText>(R.id.txtInputPassword)
        val btnLoguearse=findViewById<Button>(R.id.btnLoguearse)



        Autenticador = FirebaseAuth.getInstance()
        val database = Firebase.database

        btnLoguearse.setOnClickListener{
            val correo = txtEmail.text.toString()
            val contrasena = txtPassword.text.toString()

            //Validamos Correo y contrasena
            Valida_contrasena()
            Valida_correo()

            Autenticador.signInWithEmailAndPassword(correo,contrasena)
                .addOnCompleteListener(this){task ->
                    if (task.isSuccessful){
                        val usuario = Autenticador.currentUser
                        Toast.makeText(applicationContext,"Inicio exitoso",Toast.LENGTH_SHORT).show()
                        //Actualizar_Interfaz(usuario!!)
                    }else{
                        Toast.makeText(applicationContext,"Inicio fallido",Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }

    //https://www.androfast.com/2018/09/metodos-funciones-en-kotlin.html
    //https://firebase.google.com/docs/auth/android/start?hl=es#kotlin+ktx
    //https://firebase.google.com/docs/database/android/start?hl=es-419


    private fun Valida_correo():Boolean{
        val correo = txtEmail.text.toString().trim()
        return if (correo.isEmpty()){
            txtEmail.error = "Debe digitar un correo."
            false
        }else if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()){
            txtEmail.error = "Debe usar un formato de correo."
            false
        }else{
            txtEmail.error = null
            true
        }
    }

    private fun Valida_contrasena():Boolean{
        val contrasena = txtPassword.text.toString().trim()
        return if (contrasena.isEmpty()){
            txtPassword.error = "Debe digitar una contraseña."
            false
        }else if (!PATTERN_CONTRASENA.matcher(contrasena).matches()){
            txtPassword.error = "Debe usar almenos un número, una mayúscula, una minúscula, caracteres especiales y tener entre 6 y 20 caracteres"
            false
        }else{
            txtPassword.error = null
            true
        }
    }

    companion object {
        private val PATTERN_CONTRASENA = Pattern.compile(
            "(?=.*[0-9])" + // Permite números
                    "(?=.*[a-zA-Z])" + // Permite letras
                    "(?=.*[!@#$%^&*()_+.])" + // Caracteres especiales
                    ".{6,20}" + "$") // Entre 6 y 20 Caracteres
    }

    //Funcion para acceder a la aplicacion
    private fun Actualizar_Interfaz (usuario: FirebaseUser){
        if (usuario != null){
            //val intento = Intent(this,Principal::class.java)
            //startActivity(intento)
        }
    }
}