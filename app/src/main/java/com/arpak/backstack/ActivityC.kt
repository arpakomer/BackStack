package com.arpak.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arpak.backstack.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var backStackBindingC: ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        backStackBindingC = ActivityCBinding.inflate(layoutInflater)
        val view = backStackBindingC.root
        setContentView(view)


        backStackBindingC.buttonGoToD.setOnClickListener {
            startActivity(Intent(this@ActivityC,ActivityD::class.java))

            /**
             *          ---- finish() method ----
             *          Deletes the previous activity from the back stack.
             *       frozen activity can also continue from where it left off.
             *
             */

            finish()
        }
    }
}