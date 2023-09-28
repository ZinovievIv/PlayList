package com.example.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSearch = findViewById<Button>(R.id.buttonSearch)
        val buttonMedia = findViewById<Button>(R.id.buttonMedia)
        val buttonSettings = findViewById<Button>(R.id.buttonSettings)
        val buttonSearchClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()
            }
        }
        val buttonMediaClickListener: View.OnClickListener = View.OnClickListener { Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show() }
        val buttonSettingClickListener: View.OnClickListener = View.OnClickListener {Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()}

        buttonSearch.setOnClickListener(buttonSearchClickListener)
        buttonMedia.setOnClickListener(buttonMediaClickListener)
        buttonSettings.setOnClickListener(buttonSettingClickListener)
    }
}