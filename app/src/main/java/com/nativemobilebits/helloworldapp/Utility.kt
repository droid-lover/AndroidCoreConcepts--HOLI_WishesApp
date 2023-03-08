package com.nativemobilebits.helloworldapp

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService

/**
 * Native Mobile Bits
 * https://www.youtube.com/c/NativeMobileBits
 */
object Utility {

    fun hideKeyboard(context:Context){
        val imm: InputMethodManager? = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?
        imm?.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

}