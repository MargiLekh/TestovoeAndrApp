package com.example.testovoeandrapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun countDigits(view: View){
        val counterStr = textView.text.toString()
        var count: Int = Integer.parseInt(counterStr)
        count++
        textView.text = count.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState?.run{
            putString("SavedCounter", textView.text.toString())
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textView.text = savedInstanceState?.getString("SavedCounter")
    }
}