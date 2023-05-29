package com.tema.kerjaone.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tema.kerjaone.R
import com.tema.kerjaone.autentication.LoginActivity

class Welcome3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome3)

        supportActionBar!!.hide()

        val btn_welcome3 = findViewById<Button>(R.id.btn_welcome3)
        btn_welcome3.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}