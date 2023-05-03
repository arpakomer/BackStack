package com.arpak.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {


        val intent = Intent(this,ActivityB::class.java)
        //Back Stack with a fine detail between the pages
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)





        startActivity(intent)
    }

}