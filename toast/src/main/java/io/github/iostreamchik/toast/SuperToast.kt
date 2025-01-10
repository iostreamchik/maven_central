package io.github.iostreamchik.toast

import android.content.Context
import android.widget.Toast

object SuperToast {

    fun superToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}