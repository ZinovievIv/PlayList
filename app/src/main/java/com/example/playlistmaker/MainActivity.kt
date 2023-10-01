package com.example.playlistmaker

import android.content.Intent
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
                val searchButton = findViewById<Button>(R.id.buttonSearch)
                searchButton.setOnClickListener {
                    val searchIntent = Intent(this@MainActivity, SearchActivity::class.java)
                    startActivity(searchIntent)
                }
            }
        }
        val buttonMediaClickListener: View.OnClickListener = View.OnClickListener {
            val mediaLibraryButton = findViewById<Button>(R.id.buttonMedia)
            mediaLibraryButton.setOnClickListener {
                val mediaLibraryIntent = Intent(this@MainActivity, MediaLibraryActivity::class.java)
                startActivity(mediaLibraryIntent)
            }
        }

        buttonSearch.setOnClickListener(buttonSearchClickListener)
        buttonMedia.setOnClickListener(buttonMediaClickListener)
        buttonSettings.setOnClickListener(this@MainActivity)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonSettings -> {
                val settingsButton = findViewById<Button>(R.id.buttonSettings)
                settingsButton.setOnClickListener {
                    val settingsButtonIntent = Intent(this@MainActivity, SettingsActivity::class.java)
                    startActivity(settingsButtonIntent)
                }
            }
        }
    }
}