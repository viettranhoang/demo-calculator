package com.vit.democalculator

import android.app.Activity
import android.view.WindowManager
import androidx.core.content.ContextCompat

fun Activity.setStatusBarColor(colorResource: Int) {
    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.statusBarColor = ContextCompat.getColor(this, colorResource)
}