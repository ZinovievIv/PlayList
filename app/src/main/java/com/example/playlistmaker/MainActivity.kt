package com.example.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSearch = findViewById<Button>(R.id.buttonSearch)
        val buttonMedia = findViewById<Button>(R.id.buttonMedia)
        val buttonSettings = findViewById<Button>(R.id.buttonSettings)
        val buttonSearchClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку 1!", Toast.LENGTH_SHORT).show()
            }
        }
        val buttonMediaClickListener: View.OnClickListener = View.OnClickListener { Toast.makeText(this@MainActivity, "Нажали на кнопку 2!", Toast.LENGTH_SHORT).show() }

        buttonSearch.setOnClickListener(buttonSearchClickListener)
        buttonMedia.setOnClickListener(buttonMediaClickListener)
        buttonSettings.setOnClickListener(this@MainActivity)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonSearch -> {
                Toast.makeText(this@MainActivity,"Нажата кнопка Поиск", Toast.LENGTH_SHORT).show()
            }
            R.id.buttonSettings -> {
                Toast.makeText(this@MainActivity,"Нажата кнопка Настройки", Toast.LENGTH_SHORT).show()
            }
            R.id.buttonMedia -> {
                Toast.makeText(this@MainActivity,"Нажата кнопка Библиотека", Toast.LENGTH_SHORT).show()
            }

        }
    }
}