package com.vincent.belajarintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataLayout : AppCompatActivity() {

    companion object
    {
        const val EXTRA_NAME = "extra name"
        const val EXTRA_AGE = "extra_age"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data_layout)

        val tvDataReceived : TextView = findViewById(R.id.tv_data_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE,0)

        val text = "Name : $name, \nYourAge :$age"
        tvDataReceived.text = text
    }
}