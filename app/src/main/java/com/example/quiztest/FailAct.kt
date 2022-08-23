package com.example.quiztest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fail.*
import kotlinx.android.synthetic.main.activity_win.*

class FailAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail)

        val correctF = intent.getIntExtra("correct_answers",0)
        val wrongF = intent.getIntExtra("wrong_answers" , 0)
        FCorrectA.setText("$correctF")
        FwrongA.setText("$wrongF")
    }
}