package com.example.myapplication

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityLoginBinding
import java.net.PasswordAuthentication




class LoginActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityLoginBinding
    lateinit var sharedPreferenced: SharedPreferences
    var email: String?=null
    var password: String?=null
    var remember:Boolean=false



    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Email", "on Create")
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)

        var view = loginBinding.root
        setContentView(view)

        loginBinding.buttonL.setOnClickListener {
            sharedPreferenced=getSharedPreferences("userData", MODE_PRIVATE)
            email=sharedPreferenced.getString("email",null)
            password=sharedPreferenced.getString("password","")
            remember=sharedPreferenced.getBoolean("remember ",false)
            var intent= Intent(this@LoginActivity,dashboardActivity::class.java)
//            var text:String=


            loginBinding.EmailAddress.setText(email)
            loginBinding.Password.setText(password)
            loginBinding.rememberMe.isChecked=remember

            Toast.makeText(applicationContext, "Login successfull", Toast.LENGTH_LONG).show()
        }
        sharedPreferenced=getSharedPreferences("userData", MODE_PRIVATE)


        loginBinding.buttonR.setOnClickListener {
            email=loginBinding.EmailAddress.text.toString()
            password=loginBinding.Password.toString()
            remember=loginBinding.rememberMe.isChecked

            var editor = sharedPreferenced.edit()
            editor.putString("Email",email)
            editor.putString("Password",password)
            editor.putBoolean("remember",remember)


            Toast.makeText(applicationContext, "Data Saved", Toast.LENGTH_LONG).show()


        }



    }}



