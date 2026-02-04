package io.github.iostreamchik.provider

import android.content.Context
import io.github.iostreamchik.toast.SuperToast

object Provider {

    fun provideToast(context: Context, message: String) {
        SuperToast.superToast(context, message)
    }
}