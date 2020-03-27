package com.nandroidex.faceviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        fvFace.setImageResource(R.drawable.rock)
//        fvFace.setImageResource(R.drawable.rock)
//        fvFace.setImageDrawable(ActivityCompat.getDrawable(this, R.drawable.rock))
//        fvFace.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.rock))

        Glide.with(this).load(R.drawable.rock).into(ivImageCC)
        Glide.with(this).load(R.drawable.rock).into(fvFace)
    }

    override fun onDestroy() {
        fvFace.onDestroy()
        super.onDestroy()
    }
}