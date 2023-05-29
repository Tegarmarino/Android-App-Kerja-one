package com.tema.kerjaone.autentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tema.kerjaone.R
import com.tema.kerjaone.welcome.Welcome2Activity

class Register2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        supportActionBar!!.hide()

//        Button pindah activity
        val btn_register2 = findViewById<Button>(R.id.btn_register2)
        btn_register2.setOnClickListener{
            val intent = Intent(this, Register3Activity::class.java)
            startActivity(intent)
        }
    }
}