package com.dc.cicdtraningpoc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)
        val signup = findViewById<TextView>(R.id.signup)

        login.setOnClickListener {
            if (username.text.toString() == "test@example.com" && password.text.toString() == "password") {
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
            } else {
                // Handle incorrect login
            }
        }

        signup.setOnClickListener {
            // Handle sign up
        }
    }
}