package com.michaelflisar.toolbox.classes

import android.content.Context
import android.widget.Toast

/*
 * don't copy this, it's just for demo purposes, this is not the way to do it!
 */
object ToastHelper {

    private var toast: Toast? = null

    fun show(context: Context, text: String) {
        toast?.cancel()
        toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        toast?.show()
    }
}

fun Context.demoToast(text: String) {
    ToastHelper.show(this, text)
}