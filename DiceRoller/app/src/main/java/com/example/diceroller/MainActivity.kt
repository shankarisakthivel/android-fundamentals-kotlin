package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.R.id.roll_button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.count_button)
        rollButton.setOnClickListener{roll_dice()}
        countUpButton.setOnClickListener{count_up()}
    }

    private fun roll_dice(){
       // Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
        var resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun count_up(){
        // Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
        var resultText: TextView = findViewById(R.id.result_text)
        var value :Int = Integer.parseInt(resultText.text as String)
        if(!value.equals(6))
        {
            value += 1
        }
        resultText.text = "$value"
    }
}
