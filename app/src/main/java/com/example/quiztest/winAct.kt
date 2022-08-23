package com.example.quiztest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_win.*

class winAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        val correct = intent.getIntExtra("correct_answers",0)
        val Wrong = intent.getIntExtra("wrong_answers" , 0)
        WCorrectA.setText("$correct")
        WwrongA.setText("$Wrong")
    }
}