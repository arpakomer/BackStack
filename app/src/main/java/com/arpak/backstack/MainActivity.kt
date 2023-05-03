package com.arpak.backstack


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arpak.backstack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var backStackBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        backStackBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = backStackBinding.root
        setContentView(view)


        backStackBinding.buttonGoToB.setOnClickListener {
                //If not send data
            startActivity(Intent(this@MainActivity,ActivityB::class.java))
        }
    }
}