package com.example.iteradmin.callnumber

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edi = findViewById<EditText>(R.id.editText)
        val call = findViewById<Button>(R.id.button)


        call.setOnClickListener{
            val call_intent = Intent(Intent.ACTION_CALL)
             call_intent.setData(Uri.parse("tel:"+edi.text.toString()))
            startActivity(call_intent)
        }
    }
}
