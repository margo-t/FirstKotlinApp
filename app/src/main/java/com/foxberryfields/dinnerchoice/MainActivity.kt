 package com.foxberryfields.dinnerchoice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

 class MainActivity : AppCompatActivity() {

     val foodList = arrayListOf("Chinese", "Italian", "Pad Thai", "Tim Hortons")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            selectedfoodtext.text = foodList[randomFood]
        }

        addfoodButton.setOnClickListener {
            val newFood = addFood.text.toString()
            foodList.add(newFood)
            addFood.text.clear()
        }
    }
}
