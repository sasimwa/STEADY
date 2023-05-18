package com.example.steady

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import com.example.steady.R

class DrugsActivity : AppCompatActivity() {
    lateinit var mytxt_title:TextView

    private lateinit var myWeb: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drugs)
        mytxt_title = findViewById(R.id.txt_title)


        val title = intent.getStringExtra("title")
        mytxt_title.setText(title)

        myWeb = findViewById(R.id.webview)



        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://nida.nih.gov/publications/drugfacts/understanding-drug-use-addiction")



    }
}