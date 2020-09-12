package com.example.fruitdeliveryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class LemonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lemon)


        val url_2: String =  "https://cdn.britannica.com/84/188484-050-F27B0049/lemons-tree.jpg"

        val  imgPicasso = findViewById<ImageView>(R.id.ImageViewPicasso)


        //Now image with picasso Library

        Picasso.get()
                .load(url_2)
                .placeholder(R.drawable.progress_animation)
                .error(R.drawable.try_later)
                .into(imgPicasso);
    }
}