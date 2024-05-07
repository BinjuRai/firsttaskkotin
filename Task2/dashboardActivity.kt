package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R.id.buttonL

class dashboardActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var buttonL: Button
    private lateinit var buttonR: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        buttonL=findViewById(R.id.buttonL)
        buttonR=findViewById(R.id.buttonR)

        buttonL.setOnClickListener(this)
        buttonR.setOnClickListener  (this)

        }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonL ->{
                val intent = Intent(this,firstPageActivity::class.java)
                startActivity(intent)
            }
            R.id.buttonR ->{
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }
    }
}}
