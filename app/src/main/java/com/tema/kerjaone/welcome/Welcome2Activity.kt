package com.tema.kerjaone.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tema.kerjaone.R

class Welcome2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)

        supportActionBar!!.hide()

        val btn_welcome2 = findViewById<Button>(R.id.btn_welcome2)
        btn_welcome2.setOnClickListener{
            val intent = Intent(this, Welcome3Activity::class.java)
            startActivity(intent)
        }
    }
}