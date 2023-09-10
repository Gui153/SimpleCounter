package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.add)
        val but2 = findViewById<Button>(R.id.inc)
        val coun = findViewById<TextView>(R.id.counter)
        var value = 0
        var incre = 1
        but.setOnClickListener(){
            Log.v("add 1","Clicked")
            //Toast.makeText(it.context, "Clicked", Toast.LENGTH_SHORT).show()
            value += incre
            Log.v("added 1", "${value}")
            coun.text = "$value"
            if(value >= 100){
                but2.visibility = View.VISIBLE
            }
        }
        but2.setOnClickListener(){
            Log.v("increment 1","Clicked")
            //Toast.makeText(it.context, "Clicked", Toast.LENGTH_SHORT).show()
            if(value >= 100) {
                value -= 100
                incre++
                Log.v("incremented", "${incre}")
            }
            coun.text = "$value"

            if(value < 100){
                but2.visibility = View.INVISIBLE
            }
        }

    }
}