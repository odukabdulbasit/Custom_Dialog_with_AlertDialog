package com.example.customdialogwithalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowDialog = findViewById<Button>(R.id.btnShowDialog)
        // Set a click listener to show the custom dialog when a button is clicked
        btnShowDialog.setOnClickListener {
            val customDialog = CustomDialog(this)
            customDialog.show()
        }

    }
}