package com.example.firstaxk

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registrationpage : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var data = arrayOf("Nepal","India","China","Korea","Bhutan","London","Spain","Pakistan","Sri Lanka",
        "Afghanishtan","Thailand","Maldives",)
    lateinit var result: TextView
    lateinit var spinner: Spinner
    lateinit var radioButtonM: RadioButton
    lateinit var radioButtonF: RadioButton
    lateinit var radioButtonO: RadioButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.TextViewCountry)
        spinner=findViewById(R.id.spinner)
        spinner.onItemSelectedListener= this
        var adapter=ArrayAdapter(this@registrationpage,android.R.layout.simple_spinner_item,data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter= adapter


//        radioButtonM=
//        radioButtonF=findViewById(R.id.radioButtonF)
//        radioButtonO=findViewById(R.id.radioButtonO)

        findViewById<RadioButton>(R.id.radioButtonDP).setOnClickListener{
//date picker here

        }
        findViewById<RadioButton>(R.id.radioButtonT).setOnClickListener {
            Toast.makeText(applicationContext,"Toast shown successfully",
                Toast.LENGTH_SHORT)
                .show()

        }

        findViewById<RadioButton>(R.id.radioButtonTP).setOnClickListener{

            //time picke rhere

        }
        findViewById<RadioButton>(R.id.radioButtonS).setOnClickListener {
//            snackbar here


        }
        findViewById<RadioButton>(R.id.radioButtonA).setOnClickListener {
            var alertDialog= AlertDialog.Builder(this@registrationpage)
            alertDialog.setTitle("Confirm")
                .setMessage("Are you sure?")
                .setCancelable(false)
                .setNegativeButton("No",DialogInterface.OnClickListener{dialogInterface,i ->

                })
                .setPositiveButton("Yes",DialogInterface.OnClickListener{ DialogInterface, i ->  })
            alertDialog.create().show()
        }











    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}