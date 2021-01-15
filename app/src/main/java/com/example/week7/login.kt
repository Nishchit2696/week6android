package com.example.week7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    private lateinit var username:EditText
    private lateinit var password:EditText
    private lateinit var submit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username = findViewById(R.id.username);
        password = findViewById(R.id.Password);
        submit = findViewById(R.id.submit)
        submit.setOnClickListener {
            if(username.text.toString()=="softwarica" && password.text.toString()=="coventry"){
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Invalid Username and Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}