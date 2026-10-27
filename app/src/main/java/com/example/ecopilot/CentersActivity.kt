package com.example.ecopilot

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CentersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_centers)

        val btnBackCenters = findViewById<Button>(R.id.btnBackCenters)

        btnBackCenters.setOnClickListener {
            finish()
        }
    }
}