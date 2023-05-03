package com.arpak.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.arpak.backstack.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var backStackBinding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        backStackBinding = ActivityBBinding.inflate(layoutInflater)
        val view = backStackBinding.root
        setContentView(view)


        backStackBinding.buttonGoToC.setOnClickListener {
            startActivity(Intent(this@ActivityB,ActivityC::class.java))
        }


    }
}