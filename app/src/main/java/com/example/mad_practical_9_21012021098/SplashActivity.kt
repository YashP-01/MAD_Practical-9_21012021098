package com.example.mad_practical_9_21012021098

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener

class SplashActivity : AppCompatActivity(),AnimationListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {


    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}