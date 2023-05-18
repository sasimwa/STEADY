package com.example.steady

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var edt_email: EditText
    lateinit var edt_password: EditText
    lateinit var backtoreg: Button
    lateinit var login_btn: Button
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_email = findViewById(R.id.edtEmail)
        edt_password = findViewById(R.id.edtPassword)
        login_btn = findViewById(R.id.btnLogin)
        backtoreg = findViewById(R.id.btnRegister)
        auth= FirebaseAuth.getInstance()

        backtoreg.setOnClickListener {
            var gotoreg = Intent(this, RegisterActivity::class.java)
            startActivity(gotoreg)
        }


        login_btn.setOnClickListener{
            var email = edt_email.text.toString().trim()
            var password = edt_password.text.toString().trim()
            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()
            } else{
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this){
                    if (it.isSuccessful){
                        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                        var gotomain = Intent(this, MainActivity::class.java)
                        startActivity(gotomain)
                        finish()
                    } else{
                        Toast.makeText(this, "Failed to login", Toast.LENGTH_SHORT).show()
                    }


                }
            }
        }

    }
}