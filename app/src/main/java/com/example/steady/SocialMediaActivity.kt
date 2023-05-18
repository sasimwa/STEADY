package com.example.steady

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import com.example.steady.R

class SocialMediaActivity : AppCompatActivity() {


    private lateinit var edttime:EditText
    private lateinit var btnTime:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)

        edttime = findViewById(R.id.edtTime)
        btnTime = findViewById(R.id.btntime)


        btnTime.setOnClickListener {






        }







    }
}