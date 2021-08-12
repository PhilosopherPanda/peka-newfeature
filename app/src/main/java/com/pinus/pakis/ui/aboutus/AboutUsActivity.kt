package com.pinus.pakis.ui.aboutus

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.pinus.pakis.R
import com.pinus.pakis.databinding.ActivityAboutUsBinding
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class AboutUsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutUsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Tentang Kami"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_about_us)
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}