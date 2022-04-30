package com.bsoftwarefoundation.counting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Tambah_button : Button = findViewById(R.id.Tambah_button)
        val Hapus_button : Button = findViewById(R.id.Hapus_button)
        val Angka_count : TextView = findViewById(R.id.Num_count)


        Tambah_button.setOnClickListener{
            Toast.makeText(this,"You call tambah button",Toast.LENGTH_SHORT).show()
            var increment_data : Int = ++count
            Angka_count.setText(Integer.toString(increment_data))
        }

        Hapus_button.setOnClickListener {
            count = 0
            Angka_count.setText(Integer.toString(count))
        }

    }

}

