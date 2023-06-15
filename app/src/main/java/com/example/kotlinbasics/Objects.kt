package com.example.kotlinbasics

import android.media.MediaPlayer
import android.view.View
import android.view.View.OnClickListener

object MyObject {
    val retrofitApi by lazy { "service" }
}

class MyExampleClass() {

    val deneme = 5
    companion object {
        const val sadas = "sda"
        fun example() {}
    }
}

fun main() {
   val listener = object : OnClickListener {
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
   }
}