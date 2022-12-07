package com.betul.superheroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createSuperHero(view : View)
    {
       val name=nameText.text.toString()
        val age=ageText.text.toString().toIntOrNull()
        val occupation=occupationText.text.toString()

        if (age==null){
            textView.text="enter correct age"

        }else{
            val superhero=SuperHero(name,age,occupation)

            textView.text="${superhero.name}-${superhero.age}-${superhero.occupation}"
        }


    }
}