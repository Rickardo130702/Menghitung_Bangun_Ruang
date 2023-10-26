package com.example.testkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import android.content.DialogInterface

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val llKerucut = findViewById<LinearLayout>(R.id.llKerucut)
        val llTabung = findViewById<LinearLayout>(R.id.llTabung)
        val llBalok = findViewById<LinearLayout>(R.id.llBalok)
        val llLimas = findViewById<LinearLayout>(R.id.llLimas)
        val llKeluar = findViewById<LinearLayout>(R.id.llKeluar)

        llKerucut.setOnClickListener{
            val intent = Intent (this, KerucutActivity::class.java)
            startActivity(intent)
        }

        llTabung.setOnClickListener{
            val intent = Intent (this, TabungActivity::class.java)
            startActivity(intent)
        }

        llBalok.setOnClickListener{
            val intent = Intent (this, BalokActivity::class.java)
            startActivity(intent)
        }

        llLimas.setOnClickListener{
            val intent = Intent (this, LimasActivity::class.java)
            startActivity(intent)
        }

        llKeluar.setOnClickListener {
            showExitConfirmationDialog()
        }
    }

    private fun showExitConfirmationDialog() {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Konfirmasi")
            builder.setMessage("Apakah Anda yakin ingin keluar?")
            builder.setPositiveButton("Ya") { dialog, which ->
                finish()
            }
            builder.setNegativeButton("Tidak") { dialog, which ->
            }
            builder.setCancelable(false)
            builder.show()
        }

}