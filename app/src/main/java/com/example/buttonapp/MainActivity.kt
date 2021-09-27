package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num = 0
    lateinit var TextView1:TextView
    lateinit var Button1:Button
    lateinit var Button2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextView1 = findViewById(R.id.textView1)
        Button1 = findViewById(R.id.button1)
        Button2 = findViewById(R.id.button2)

        Button1.setOnClickListener{
            updateNumber(false)
        }
        Button2.setOnClickListener{
            updateNumber(true)
        }
    }
    fun updateNumber(add:Boolean){
        if (add){

            num++
        }else{

            num--
        }
        TextView1.text = num.toString()
    }
}