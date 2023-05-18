package com.example.steady

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import com.example.steady.DrugsActivity
import com.example.steady.FoodActivity
import com.google.firebase.auth.FirebaseAuthException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val mylistview = findViewById<ListView>(R.id.my_list_view)
        val names = arrayOf("SOCIAL MEDIA","DRUGS","FOOD ADDICTION")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )

        mylistview.adapter = arrayAdapter



        mylistview.setOnItemClickListener { _, _, position, _ ->

            val selectedItem = names[position]
            val intent = Intent(this, DrugsActivity::class.java)
            intent.putExtra("title", selectedItem)
            startActivity(intent) }



        mylistview.setOnItemClickListener { _, _, position, _ ->

            val selectedItem = names[position]
            val intent = Intent(this, FoodActivity::class.java)
            intent.putExtra("title", selectedItem)
            startActivity(intent) }


//        mylistview.setOnItemClickListener { adapterView, view, i, l ->
//            //Toast.makeText(this, "Item Selected"+names[i], Toast.LENGTH_SHORT).show()
//
//
//
//
//        }





    }
    }
