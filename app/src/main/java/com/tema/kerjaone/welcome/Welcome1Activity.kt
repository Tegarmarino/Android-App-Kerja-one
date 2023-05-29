package com.tema.kerjaone.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tema.kerjaone.R

class Welcome1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome1)

        supportActionBar!!.hide()

//        Button pindah activity
        val btn_welcome1 = findViewById<Button>(R.id.btn_welcome1)
        btn_welcome1.setOnClickListener{
            val intent = Intent(this, Welcome2Activity::class.java)
            startActivity(intent)
        }
    }
}