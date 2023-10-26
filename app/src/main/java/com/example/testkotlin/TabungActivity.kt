package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.PI

class TabungActivity : AppCompatActivity() {
    private lateinit var etRadius2: EditText
    private lateinit var etTinggi2: EditText
    private lateinit var btnHitung2: Button
    private lateinit var hasilLuas: TextView
    private lateinit var hasilVolume: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tabung)

        etRadius2 = findViewById(R.id.etRadius2)
        etTinggi2 = findViewById(R.id.etTinggi2)
        btnHitung2 = findViewById(R.id.btnHitung2)
        hasilLuas = findViewById(R.id.hasilLuas)
        hasilVolume = findViewById(R.id.hasilVolume)

        btnHitung2.setOnClickListener{
            hitungTabung()
        }
    }

    private fun hitungTabung() {
        val radiusText = etRadius2.text.toString()
        val tinggiText = etTinggi2.text.toString()

        if (radiusText.isNotEmpty() && tinggiText.isNotEmpty()){
            val radius = radiusText.toDouble()
            val tinggi = tinggiText.toDouble()

            val luasPermukaan = 2 * PI * radius * (radius + tinggi)
            val volume = PI * radius * radius * tinggi

            hasilLuas.text = "Luas Permukaan : $luasPermukaan"
            hasilVolume.text = "Volume : $volume"
            hasilLuas.visibility = View.VISIBLE
            hasilVolume.visibility = View.VISIBLE
        } else {
            hasilLuas.text = "Masukan NIlai jari - jari dan tinggi tabung"
            hasilVolume.text = ""
            hasilLuas.visibility = View.VISIBLE
            hasilVolume.visibility = View.INVISIBLE
        }
    }
}