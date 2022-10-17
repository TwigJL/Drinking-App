package com.example.drinkinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SplashScreen : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        auth = FirebaseAuth.getInstance()

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val someDelay = Thread{
            Thread.sleep(1800)
            if(auth.currentUser == null){
                val intent = Intent(this, LoginScreen::class.java)
                startActivity(intent)
                finish()
            }else{
                val intent = Intent(this, InitialScreen::class.java)
                startActivity(intent)
                finish()
            }
        }
        someDelay.start()
    }
}