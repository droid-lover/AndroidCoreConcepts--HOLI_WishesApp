package com.nativemobilebits.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var tvOne :TextView
    lateinit var tvTwo :TextView
    lateinit var tvThree :TextView
    lateinit var llParent :LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Native Mobile Bits ~ LETS LEARN ANDROID")

        tvOne = findViewById(R.id.tvOne)
        tvTwo = findViewById(R.id.tvTwo)
        tvThree = findViewById(R.id.tvThree)
        llParent = findViewById(R.id.llParent)

        setupClickListeners()

    }

    private fun setupClickListeners() {
        tvOne.setOnClickListener {
            Toast.makeText(this@MainActivity , "First TextView Clicked", Toast.LENGTH_LONG).show()
        }

        tvTwo.setOnClickListener {
            Toast.makeText(this@MainActivity , "Second TextView Clicked", Toast.LENGTH_SHORT).show()
        }

        tvThree.setOnClickListener {
            Toast.makeText(this@MainActivity , "Third TextView Clicked", Toast.LENGTH_SHORT).show()
        }


    }


}