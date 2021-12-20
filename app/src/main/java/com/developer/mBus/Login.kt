package com.developer.mBus


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.statusBarColor= ContextCompat.getColor(this,R.color.white)
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        log_backToRegister.setOnClickListener {
            val startActivity = Intent(this, SignUP::class.java)
            startActivity(startActivity)
            finish()
        }
        log_loginBt.setOnClickListener {

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