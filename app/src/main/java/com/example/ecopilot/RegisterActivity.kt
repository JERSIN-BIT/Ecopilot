package com.example.ecopilot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegisterSubmit = findViewById<Button>(R.id.btnRegisterSubmit)
        val btnBackToLogin = findViewById<Button>(R.id.btnBackToLogin)

        // 1. Al presionar "Registrarse", nos envía al Dashboard
        btnRegisterSubmit.setOnClickListener {
            Toast.makeText(this, "¡Registro exitoso!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finishAffinity() // Cierra las actividades anteriores
        }

        // 2. Al presionar "Ya tengo cuenta", vuelve al Login
        btnBackToLogin.setOnClickListener {
            finish() // Cierra esta vista y regresa a la anterior
        }
    }
}