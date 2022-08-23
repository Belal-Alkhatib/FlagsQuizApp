package com.example.quiztest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.quiztest.databinding.ActivityMainBinding
import com.example.quiztest.modul.Quiz
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var correct_answers = 0
       var wrong_answers =0
        var caunt = 1
        val data2 = ArrayList<Quiz>()

        data2.add(Quiz(1, "Question 1 of 10", R.drawable.india, "India", "pakistan", "Albania", "India"))
        data2.add(Quiz(2, "Question 2 of 10", R.drawable.iran, "Austria", "Angola", "Iran", "Iran"))
        data2.add(Quiz(3, "Question 3 of 10", R.drawable.japan, "Egypt", "Japan", "China", "Japan"))
        data2.add(Quiz(4, "Question 4 of 10", R.drawable.malaysia, "Malaysia", "Norway", "Japan", "Malaysia"))
        data2.add(Quiz(5, "Question 5 of 10", R.drawable.pakistan, "Iraq", "Kazakhstan", "Pakistan", "Pakistan"))
        data2.add(Quiz(6, "Question 6 of 10", R.drawable.palestine, "Palestine", "Bahrain", "Iraq", "Palestine"))
        data2.add(Quiz(7, "Question 7 of 10", R.drawable.spain, "Mongolia", "Spain", "Norway", "Spain"))
        data2.add(Quiz(8, "Question 8 of 10", R.drawable.sweden, "Finland", "Sweden", "Italy", "Sweden"))
        data2.add(Quiz(9, "Question 9 of 10", R.drawable.tunisia, "Tunisia", "Liechtenstein", "Italy", "Tunisia"))
        data2.add(Quiz(10, "Question 10 of 10", R.drawable.france, "Maldives", "Finland", "France", "France"))

        var i = 0



        txtQuestionNum.text = data2[i].questionNum
            imgCountry.setImageResource(data2[i].image)
            btnO1.text = data2[i].option1
            btnO2.text = data2[i].option2
            btnO3.text = data2[i].option3

        binding.btnO1.setOnClickListener {
            if (caunt == 10) {
                if (correct_answers >= 5) {
                    val z = Intent(this, winAct::class.java)
                    z.putExtra("correct_answers", correct_answers)
                    z.putExtra("wrong_answers", wrong_answers)
                    startActivity(z)
                } else {
                    val y = Intent(this, FailAct::class.java)
                    y.putExtra("correct_answers", correct_answers)
                    y.putExtra("wrong_answers", wrong_answers)
                    startActivity(y)
                }
            } else{
            val b1 = data2[i].option1
            if ((b1) == data2[i].answer) {
                correct_answers++
                Toast.makeText(this, "correct !!", Toast.LENGTH_SHORT).show()
                i++
                caunt++
                binding.txtQuestionNum.text = data2[i].questionNum
                binding.imgCountry.setImageResource(data2[i].image)
                binding.btnO1.text = data2[i].option1
                binding.btnO2.text = data2[i].option2
                binding.btnO3.text = data2[i].option3
            } else {
                wrong_answers++
                Toast.makeText(this, "Wrong :(", Toast.LENGTH_SHORT).show()
                i++
                caunt++
                binding.txtQuestionNum.text = data2[i].questionNum
                binding.imgCountry.setImageResource(data2[i].image)
                binding.btnO1.text = data2[i].option1
                binding.btnO2.text = data2[i].option2
                binding.btnO3.text = data2[i].option3
                  }
                  }
       }
//******************
        binding.btnO2.setOnClickListener {
            if (caunt == 10) {
                if (correct_answers >= 5) {
                    val z = Intent(this, winAct::class.java)
                    z.putExtra("correct_answers", correct_answers)
                    z.putExtra("wrong_answers", wrong_answers)
                    startActivity(z)
                } else {
                    val y = Intent(this, FailAct::class.java)
                    y.putExtra("correct_answers", correct_answers)
                    y.putExtra("wrong_answers", wrong_answers)
                    startActivity(y)
                }
            }else{
            val b2 = data2[i].option2
            if ((b2) == data2[i].answer) {
                correct_answers++
                Toast.makeText(this, "correct !!", Toast.LENGTH_SHORT).show()
                i++
                caunt++
                binding.txtQuestionNum.text = data2[i].questionNum
                binding.imgCountry.setImageResource(data2[i].image)
                binding.btnO1.text = data2[i].option1
                binding.btnO2.text = data2[i].option2
                binding.btnO3.text = data2[i].option3
            }else{
                wrong_answers++
                Toast.makeText(this, "Wrong :(", Toast.LENGTH_SHORT).show()
                if (caunt == 10) {
                    if (correct_answers >= 5) {
                        val z = Intent(this, winAct::class.java)
                        z.putExtra("correct_answers", correct_answers)
                        z.putExtra("wrong_answers", wrong_answers)
                        startActivity(z)
                    }else{
                        val y = Intent(this, FailAct::class.java)
                        y.putExtra("correct_answers", correct_answers)
                        y.putExtra("wrong_answers", wrong_answers)
                        startActivity(y)
                         }
                }
                i++
                caunt++
                binding.txtQuestionNum.text = data2[i].questionNum
                binding.imgCountry.setImageResource(data2[i].image)
                binding.btnO1.text = data2[i].option1
                binding.btnO2.text = data2[i].option2
                binding.btnO3.text = data2[i].option3

            }
        }
   }
//****************
        binding.btnO3.setOnClickListener {
            if (caunt == 10) {
                if (correct_answers >= 5) {
                    val z = Intent(this, winAct::class.java)
                    z.putExtra("correct_answers", correct_answers)
                    z.putExtra("wrong_answers", wrong_answers)
                    startActivity(z)
                }else{
                    val y = Intent(this, FailAct::class.java)
                    y.putExtra("correct_answers", correct_answers)
                    y.putExtra("wrong_answers", wrong_answers)
                    startActivity(y)
                     }
            }else{
            val b3 = data2[i].option3
            if ((b3) == data2[i].answer) {

                correct_answers++
                Toast.makeText(this, "correct !!", Toast.LENGTH_SHORT).show()
                i++
                caunt++
                binding.txtQuestionNum.text = data2[i].questionNum
                binding.imgCountry.setImageResource(data2[i].image)
                binding.btnO1.text = data2[i].option1
                binding.btnO2.text = data2[i].option2
                binding.btnO3.text = data2[i].option3
            } else {
                wrong_answers++
                Toast.makeText(this, "Wrong :(", Toast.LENGTH_SHORT).show()
                i++
                caunt++
                binding.txtQuestionNum.text = data2[i].questionNum
                binding.imgCountry.setImageResource(data2[i].image)
                binding.btnO1.text = data2[i].option1
                binding.btnO2.text = data2[i].option2
                binding.btnO3.text = data2[i].option3
                 }
            }
   }

        }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu , menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.iSave -> Toast.makeText(this , "Save" , Toast.LENGTH_SHORT).show()
            R.id.iSettings -> Toast.makeText(this , "Settings" , Toast.LENGTH_SHORT).show()
            R.id.iAboutUs -> Toast.makeText(this , "AboutUs" , Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)
    }

        }