package com.example.customdialogwithalertdialog

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView

class CustomDialog(context: Context) : AlertDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inflater = LayoutInflater.from(context)
        val dialogView = inflater.inflate(R.layout.custom_dialog_layout, null)

        // Access components using dialogView
        val dialogTitle = dialogView.findViewById<TextView>(R.id.dialogTitle)
        val dialogMessage = dialogView.findViewById<TextView>(R.id.dialogMessage)
        val btnCancel = dialogView.findViewById<Button>(R.id.btnCancel)
        val btnOk = dialogView.findViewById<Button>(R.id.btnOk)

        // Customize the components
        dialogTitle.text = "Custom Dialog"
        dialogMessage.text = "This is a custom dialog example."

        // Set click listener for buttons
        btnCancel.setOnClickListener {
            dismiss()
        }

        btnOk.setOnClickListener {
            // Do something when OK button is clicked
            dismiss()
        }

        // Set the custom view to the dialog
        setView(dialogView)
    }
}
