
package com.example.infinixlivestream

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.EditText

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.WHITE)
        }

        val heading = TextView(this).apply {
            text = "Infinix Live Stream"
            textSize = 26f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
        }

        val info = TextView(this).apply {
            text = "Stream camera and microphone between two phones"
            textSize = 16f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
        }

        val room = EditText(this).apply {
            hint = "Room name (e.g. room1)"
            setSingleLine(true)
        }

        val tokenUrl = EditText(this).apply {
            hint = "Token server URL"
            setSingleLine(true)
        }

        val status = TextView(this).apply {
            text = "Not connected"
            textSize = 16f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
        }

        val publisher = Button(this).apply {
            text = "Publisher mode"
            setOnClickListener {
                status.text = "Publisher selected. LiveKit connection not configured yet."
            }
        }

        val viewer = Button(this).apply {
            text = "Viewer mode"
            setOnClickListener {
                status.text = "Viewer selected. LiveKit connection not configured yet."
            }
        }

        val stop = Button(this).apply {
            text = "Stop"
            setOnClickListener {
                status.text = "Stopped"
            }
        }

        layout.addView(heading)
        layout.addView(info)
        layout.addView(room)
        layout.addView(tokenUrl)
        layout.addView(publisher)
        layout.addView(viewer)
        layout.addView(stop)
        layout.addView(status)

        setContentView(layout)
    }
}
