package com.example.hmwk1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var count = 0
    val comNum = Random.nextInt(1, 1000)

    fun guessing(view: View) {



        var guess = userGuess.text.toString().toInt()

        if (guess == comNum) {
            comResponse.text = "You're correct! It took you " + count + " tries!"
        } else if (guess != comNum) {
            if (guess > comNum) {
                comResponse.text = "Try Lower!"
                count++
            } else {
                comResponse.text = "Try higher!"
                count++
            }
            userGuess.setText("")
        }
    }
}