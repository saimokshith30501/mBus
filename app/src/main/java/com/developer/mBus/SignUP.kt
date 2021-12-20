package com.developer.mBus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
           log_backToSign.setOnClickListener {
                val startActivity = Intent(this, Login::class.java)
                startActivity(startActivity)
               finish()
            }
    }
    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)

        overridePendingTransition(R.anim.from_left_in, R.anim.from_right_out)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.from_right_in, R.anim.from_left_out)
    }
}