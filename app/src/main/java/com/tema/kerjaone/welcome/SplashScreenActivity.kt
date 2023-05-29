package com.tema.kerjaone.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import com.tema.kerjaone.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        Hide action bar
        supportActionBar!!.hide()

        Handler().postDelayed({
            val intent = Intent(this, Welcome1Activity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}