package com.pavelwinter.kotlintrying

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Hamburger" ,"Pizza", "McDonalds")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtSelectedFood .text="Food thumb"

        btnDecide .setOnClickListener{

            // без new
            val random = Random()
            val randomFood = random .nextInt(foodList .count())
            txtSelectedFood .text =foodList[randomFood]
        }


        btnAdd .setOnClickListener{

            val newFood = editText .text .toString()
            foodList .add( newFood )
            editText .text .clear()

            println(foodList)

        }

    }
}
