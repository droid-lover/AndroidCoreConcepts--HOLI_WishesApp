package com.nativemobilebits.helloworldapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
/**
 * Native Mobile Bits
 * https://www.youtube.com/c/NativeMobileBits
 */
class HomeActivity : AppCompatActivity() {

    private val TAG = HomeActivity::class.java.simpleName

    private lateinit var etUserName :EditText
    private lateinit var btnSubmit :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        etUserName = findViewById(R.id.etUserName)
        btnSubmit = findViewById(R.id.btnSubmit)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        btnSubmit.setOnClickListener {
            etUserName.clearFocus()
            Utility.hideKeyboard(this@HomeActivity)
            val name = etUserName.text?.toString()
            Log.d(TAG,"user entered = $name")

            if(name.isNullOrEmpty()){
                showError()
            }else{
                redirectToGreetingsScreen(name)
            }
        }
    }

    private fun redirectToGreetingsScreen(name: String) {
        val intent = Intent(this@HomeActivity, GreetingsActivity::class.java).apply {
            putExtra("username",name)
        }
        startActivity(intent)
    }

    private fun showError() {
        Toast.makeText(this@HomeActivity,getString(R.string.error_msg),
        Toast.LENGTH_SHORT).show()
        etUserName.error = getString(R.string.error_msg)
    }
}