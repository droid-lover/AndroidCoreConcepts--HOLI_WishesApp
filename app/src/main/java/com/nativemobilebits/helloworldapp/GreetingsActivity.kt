package com.nativemobilebits.helloworldapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
/**
 * Native Mobile Bits
 * https://www.youtube.com/c/NativeMobileBits
 */
class GreetingsActivity : AppCompatActivity() {

    private val TAG = "GreetingsActivity"

    lateinit var ivGreeting:ImageView
    lateinit var tvWishes :TextView

    private var username :String?=null

    private val holiImages = listOf(
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six,
        R.drawable.seven,
        R.drawable.eight,
        R.drawable.nine,
        R.drawable.ten,
        R.drawable.eleven
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)
        ivGreeting = findViewById(R.id.ivGreeting)
        tvWishes = findViewById(R.id.tvWishes)


        username = intent?.getStringExtra("username")
        Log.d(TAG,"Inside_onCreate== $username")

        setGreetingUI()
    }

    private fun setGreetingUI() {
        val randomImage = holiImages.random()
        ivGreeting.setImageResource(randomImage)

        username?.also {
            tvWishes.text = "${getString(R.string.happy_holi_wishes)} $it"
        }

    }


}