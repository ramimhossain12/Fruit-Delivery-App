package com.example.fruitdeliveryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class GuavaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guava)



        val url_1: String = "https://i0.wp.com/images-prod.healthline.com/hlcmsresource/images/AN_images/benefits-of-guavas-1296x728-feature.jpg?w=1155&h=1528"

        val  imgGlide = findViewById<ImageView>(R.id.ImageViewGlied)



        //Now image with Glide Library

        Glide
                .with(this)
                .load(url_1)
                //.centerCrop()
                .placeholder(R.drawable.progress_animation)
                .error(R.drawable.try_later)
                .into(imgGlide)



    }
}