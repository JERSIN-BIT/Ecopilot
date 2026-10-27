package com.example.ecopilot // (Asegúrate de que coincida con tu nombre de paquete real)

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnGoToRegister = findViewById<Button>(R.id.btnGoToRegister)

        // 1. Acción al hacer clic en "Iniciar Sesión" (Lleva al Dashboard principal / MainActivity)
        btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cierra el login para que al presionar "atrás" no regrese aquí
        }

        // 2. Acción al hacer clic en "¿No tienes cuenta? Regístrate" (Lleva a la pantalla de registro)
        btnGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}