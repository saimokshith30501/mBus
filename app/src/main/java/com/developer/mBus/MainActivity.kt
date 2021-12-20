package com.developer.mBus

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.statusBarColor= ContextCompat.getColor(this,R.color.colorPrimary)
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        val appName = AnimationUtils.loadAnimation(this, R.anim.cart_anim)
        App.setAnimation(appName)
        Handler().postDelayed({
            val startActivity = Intent(this@MainActivity, Login::class.java)
            startActivity(startActivity)
            finish()
        }, 2000)
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