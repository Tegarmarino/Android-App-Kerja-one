package com.tema.kerjaone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.tema.kerjaone.welcome.Welcome1Activity
import com.tema.kerjaone.welcome.Welcome2Activity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar!!.hide()

//        Button pindah activity
        val btn_home = findViewById<ImageView>(R.id.btn_home)
        btn_home.setOnClickListener{
            val intent = Intent(this, Welcome1Activity::class.java)
            startActivity(intent)
        }
    }
}