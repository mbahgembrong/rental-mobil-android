package com.salsabilla.rental_mobil.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.salsabilla.rental_mobil.R
import com.salsabilla.rental_mobil.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent).also { finish() }
        }, 2000)
    }
    fun initView(){
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}