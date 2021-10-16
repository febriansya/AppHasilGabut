package com.bulleh.sahabatnabiapp.detail

import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bulleh.sahabatnabiapp.R
import com.bumptech.glide.Glide

class DetailSahabatActivity : AppCompatActivity() {

    private lateinit var tv_nama:TextView
    private lateinit var tv_history:TextView
    private lateinit var Imv:ImageView




    companion object{
        const val EXTRA_NAME  = "extra_name"
        const val EXTRA_HISTORY  = "extra_history"
        const val EXTRA_IMAGE  = "extra_image"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sahabat)


        tv_nama = findViewById(R.id.name)
        tv_history = findViewById(R.id.history)
        Imv = findViewById(R.id.poto)

        val nama = intent.getStringExtra(EXTRA_NAME)
        val history = intent.getStringExtra(EXTRA_HISTORY)
        val pooto = intent.getIntExtra(EXTRA_IMAGE,0)

        tv_nama.text = nama
        tv_history.text = history
        Imv.setImageDrawable(getDrawable(pooto))


    }
}

