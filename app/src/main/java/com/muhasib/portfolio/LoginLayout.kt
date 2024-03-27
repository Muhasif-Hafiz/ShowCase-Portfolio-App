package com.muhasib.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginLayout : AppCompatActivity() {


    lateinit var etEmail :EditText
    lateinit var etPassword :EditText
    lateinit var btnLogin : Button
    lateinit var txtForgot :TextView
    lateinit var txtSignup :TextView
    val validEmailOrPassword="muhasibhafeez91@gmail.com"
    val validPassword="12345"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_layout)


        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        txtForgot=findViewById(R.id.txtForgot)
        txtSignup=findViewById(R.id.txtSignup)


        btnLogin.setOnClickListener {
            val emailOrPhone=etEmail.text.toString()
            val password=etPassword.text.toString()

       if(emailOrPhone==validEmailOrPassword && password==validPassword){
           val intent=Intent(this@LoginLayout,MainActivity::class.java)
           startActivity(intent)
       }else{

           Toast.makeText(this@LoginLayout,"Invalid Credentials", Toast.LENGTH_SHORT).show()
       }


        }


    }
    override fun onPause() {
        super.onPause()
        finish()
    }
}