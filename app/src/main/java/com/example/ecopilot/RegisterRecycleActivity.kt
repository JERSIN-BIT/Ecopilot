package com.example.ecopilot

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterRecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_recycle)

        val spMaterialType = findViewById<Spinner>(R.id.spMaterialType)
        val etWeight = findViewById<EditText>(R.id.etWeight)
        val btnSaveRecycle = findViewById<Button>(R.id.btnSaveRecycle)
        val btnCancelRecycle = findViewById<Button>(R.id.btnCancelRecycle)

        // Llenar el Spinner con los tipos de materiales reciclables
        val materials = arrayOf("Plástico (PET)", "Papel / Cartón", "Vidrio", "Metales", "Tetra Pak")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, materials)
        spMaterialType.adapter = adapter

        // Guardar transacción
        btnSaveRecycle.setOnClickListener {
            val weight = etWeight.text.toString()
            val selectedMaterial = spMaterialType.selectedItem.toString()

            if (weight.isNotEmpty()) {
                Toast.makeText(this, "Registrado: $weight kg de $selectedMaterial", Toast.LENGTH_LONG).show()
                finish() // Regresa al Dashboard
            } else {
                etWeight.error = "Ingresa la cantidad"
            }
        }

        // Cancelar y regresar
        btnCancelRecycle.setOnClickListener {
            finish()
        }
    }
}