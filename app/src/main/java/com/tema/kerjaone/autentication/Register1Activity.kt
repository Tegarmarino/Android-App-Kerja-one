package com.tema.kerjaone.autentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tema.kerjaone.R
import com.tema.kerjaone.welcome.Welcome2Activity

class Register1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)

        supportActionBar!!.hide()

//        Button pindah activity
        val btn_register1 = findViewById<Button>(R.id.btn_register1)
        btn_register1.setOnClickListener{
            val intent = Intent(this, Register2Activity::class.java)
            startActivity(intent)
        }
    }
}