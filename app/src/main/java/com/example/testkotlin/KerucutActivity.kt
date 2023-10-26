package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.PI
import kotlin.math.sqrt

class KerucutActivity : AppCompatActivity() {
    private lateinit var etRadius: EditText
    private lateinit var etTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kerucut)

        etRadius = findViewById(R.id.etRadius)
        etTinggi = findViewById(R.id.etTinggi)
        btnHitung = findViewById(R.id.btnHitung)
        tvHasil = findViewById(R.id.tvHasil)

        btnHitung.setOnClickListener{
            val radiusText = etRadius.text.toString()
            val tinggiText = etTinggi.text.toString()

            if (radiusText.isNotEmpty() && tinggiText.isNotEmpty()){
                val radius = radiusText.toDouble()
                val tinggi = tinggiText.toDouble()

                val volume = (1.0 / 3.0) * PI * radius * tinggi
                val surfaceArea = PI * radius * (radius + sqrt(radius * radius + tinggi * tinggi))

                tvHasil.text = "Volume : $volume\n" +
                               "Luas Permukaan : $surfaceArea"
            } else {
                tvHasil.text = "Masukan nilai jari-jari dan tinggi kerucut"
            }
        }
    }
}