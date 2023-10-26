package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BalokActivity : AppCompatActivity() {
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var etTinggi3: EditText
    private lateinit var btnHitung3: Button
    private lateinit var tvHasilLuas: TextView
    private lateinit var tvHasilVolume: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.balok)

        etPanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        etTinggi3 = findViewById(R.id.etTinggi3)
        btnHitung3 = findViewById(R.id.btnHitung3)
        tvHasilLuas = findViewById(R.id.tvHasilLuas)
        tvHasilVolume = findViewById(R.id.tvHasilVolume)

        btnHitung3.setOnClickListener {
            hitungBalok()
        }
    }

    private fun hitungBalok() {
        val panjangText = etPanjang.text.toString()
        val lebarText = etLebar.text.toString()
        val tinggiText = etTinggi3.text.toString()

        if (panjangText.isNotEmpty() && lebarText.isNotEmpty() &&tinggiText.isNotEmpty()){
            val panjang = panjangText.toDouble()
            val lebar = lebarText.toDouble()
            val tinggi = tinggiText.toDouble()

            val luas = 2 * (panjang * lebar * panjang * tinggi * lebar * tinggi)
            val volume = panjang * lebar * tinggi

            tvHasilLuas.text = "Luas Permukaan: $luas"
            tvHasilVolume.text = "Volume: $volume"
            tvHasilLuas.visibility = View.VISIBLE
            tvHasilVolume.visibility = View.VISIBLE
        } else {
            tvHasilLuas.text = "Masukan nilai panjang , lebar, dan tinggi balok"
            tvHasilVolume.text = ""
            tvHasilLuas.visibility = View.VISIBLE
            tvHasilVolume.visibility = View.INVISIBLE
        }
    }
}