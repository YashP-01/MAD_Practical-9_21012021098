package com.example.mad_practical_9_21012021098

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation: AnimationDrawable
    lateinit var heartanimation: AnimationDrawable
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarmimage = findViewById<ImageView>(R.id.Alarmimage)
        alarmimage.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation = alarmimage.background as AnimationDrawable

        val heartimage = findViewById<ImageView>(R.id.Heartimage)
        heartimage.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation = heartimage.background as AnimationDrawable

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            alarmanimation.start(); heartanimation.start()
        }
        else{
            alarmanimation.stop(); heartanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }



}