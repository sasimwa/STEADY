package com.example.steady

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import com.example.steady.R

class FoodActivity : AppCompatActivity() {
    lateinit var txtheader:TextView

    private lateinit var myweb: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        txtheader = findViewById(R.id.txtHeader)


        val title = intent.getStringExtra("title")
        txtheader.setText(title)

        myweb = findViewById(R.id.view)



        val webSettings = myweb.settings
        webSettings.javaScriptEnabled = true
        myweb.loadUrl("https://www.healthyfood.com/")


    }
}