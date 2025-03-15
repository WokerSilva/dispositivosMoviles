package com.example.rocola

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los botones de cada carta
        val botonVerCanciones1: Button = findViewById(R.id.botonVerCanciones1)
        val botonVerCanciones2: Button = findViewById(R.id.botonVerCanciones2)
        val botonVerCanciones3: Button = findViewById(R.id.botonVerCanciones3)
        val botonVerCanciones4: Button = findViewById(R.id.botonVerCanciones4)
        val botonVerCanciones5: Button = findViewById(R.id.botonVerCanciones5)
        val botonVerCanciones6: Button = findViewById(R.id.botonVerCanciones6)

        // Funcion para el botón del album 1
        botonVerCanciones1.setOnClickListener {
            val intent = Intent(this, ListaCancionesActivity::class.java)
            startActivity(intent) // Inicia la nueva actividad
        }

        // Listeners para los otros botones (mantienen el Toast por ahora)
        botonVerCanciones2.setOnClickListener {
            Toast.makeText(this, "Mostrando canciones del albumn", Toast.LENGTH_SHORT).show()
        }
        botonVerCanciones3.setOnClickListener {
            Toast.makeText(this, "Mostrando canciones del albumn", Toast.LENGTH_SHORT).show()
        }
        botonVerCanciones4.setOnClickListener {
            Toast.makeText(this, "Mostrando canciones del albumn", Toast.LENGTH_SHORT).show()
        }
        botonVerCanciones5.setOnClickListener {
            Toast.makeText(this, "Mostrando canciones del albumn", Toast.LENGTH_SHORT).show()
        }
        botonVerCanciones6.setOnClickListener {
            Toast.makeText(this, "Mostrando canciones del albumn", Toast.LENGTH_SHORT).show()
        }
    }
}