package com.example.ecopilot

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val btnBackHistory = findViewById<Button>(R.id.btnBackHistory)

        btnBackHistory.setOnClickListener {
            finish()
        }
    }
}