package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById (R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = "6"
        }

    }

    private fun rollDice() {
        // Creat new Dice object with 6 sides and roll it
        val dice = Dice (6)
        val diceRoll = dice.roll()
        // Update the screen with dice roll
        val resultTextview:TextView = findViewById(R.id.textView)
        resultTextview.text = diceRoll.toString()
    }

    class Dice(val numSides:Int){
        fun roll(): Int{
            return(1..numSides). random()
        }
    }
}