package com.tema.kerjaone.autentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tema.kerjaone.HomeActivity
import com.tema.kerjaone.R
import com.tema.kerjaone.welcome.Welcome2Activity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.hide()

//        Button pindah activity
        val btn_login = findViewById<Button>(R.id.btn_login)
        val btn_register = findViewById<Button>(R.id.btn_register)
        btn_register.setOnClickListener{
            val intent = Intent(this, Register1Activity::class.java)
            startActivity(intent)
        }

        btn_login.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}