package com.example.thirdpartylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.skydoves.elasticviews.ElasticFinishListener
import com.skydoves.elasticviews.elasticAnimation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b = findViewById<TextView>(R.id.textView)
        val anim = b.elasticAnimation(2f, 2f, 2000, ElasticFinishListener {
            // do anything
        })
        anim.doAction()
        b.setOnClickListener { anim.doAction() }


        //https://github.com/skydoves/ElasticViews
        //https://github.com/armcha/ElasticView

    }

}