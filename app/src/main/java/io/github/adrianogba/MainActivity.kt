package io.github.adrianogba

import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //this tag turns off any type of screen capture on the device, screenshots and screen recording
    private val securityFlag = WindowManager.LayoutParams.FLAG_SECURE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnActivateButton = findViewById<Button>(R.id.btn_activate_security)
        btnActivateButton.setOnClickListener {
            window.setFlags(securityFlag, securityFlag)
            Toast.makeText(
                this,
                "Security activated, capture and screenshots of this activity are disabled.",
                Toast.LENGTH_LONG
            ).show()
        }

        val btnDeactivateButton = findViewById<Button>(R.id.btn_deactivate_security)
        btnDeactivateButton.setOnClickListener {
            window.clearFlags(securityFlag)
            Toast.makeText(
                this,
                "Security deactivated, capture and screenshots of this activity are enabled.",
                Toast.LENGTH_LONG
            ).show()
        }
    }

}