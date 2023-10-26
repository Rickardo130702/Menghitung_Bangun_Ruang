package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LimasActivity : AppCompatActivity() {
    private lateinit var etAlas: EditText
    private lateinit var etTinggi4: EditText
    private lateinit var etSisiTegak: EditText
    private lateinit var btnHitung4: Button
    private lateinit var tvHasilLuas2: TextView
    private lateinit var tvHasilVolume2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.limas)

        etAlas = findViewById(R.id.etAlas)
        etTinggi4 = findViewById(R.id.etTinggi4)
        etSisiTegak = findViewById(R.id.etSisiTegak)
        btnHitung4 = findViewById(R.id.btnHitung4)
        tvHasilLuas2 = findViewById(R.id.tvHasilLuas2)
        tvHasilVolume2 = findViewById(R.id.tvHasilVolume2)

        btnHitung4.setOnClickListener {
            hitungLimas()

        }
    }

    private fun hitungLimas() {
        val alasText = etAlas.text.toString()
        val tinggiText = etTinggi4.text.toString()
        val sisiTegakText = etSisiTegak.text.toString()

        if (alasText.isNotEmpty() && tinggiText.isNotEmpty() && sisiTegakText.isNotEmpty()) {
            val alas = alasText.toDouble()
            val tinggi = tinggiText.toDouble()
            val sisiTegak = sisiTegakText.toDouble()

            val luas = (alas * tinggi / 2) + (3 * alas * sisiTegak)
            val volume = (alas * tinggi * sisiTegak) / 6

            tvHasilLuas2.text = "Luas Permukaan: $luas"
            tvHasilVolume2.text = "Volume: $volume"
            tvHasilLuas2.visibility = View.VISIBLE
            tvHasilVolume2.visibility = View.VISIBLE
        } else {
            tvHasilLuas2.text = "Masukkan nilai alas, tinggi, dan sisi tegak limas"
            tvHasilVolume2.text = ""
            tvHasilLuas2.visibility = View.VISIBLE
            tvHasilVolume2.visibility = View.INVISIBLE
        }
    }
}