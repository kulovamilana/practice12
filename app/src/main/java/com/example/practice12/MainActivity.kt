package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun apple(view: View) {
        var photo:ImageView = findViewById(R.id.imageViewApple)
        val apple:Int = R.drawable.apple
        photo.setImageResource(apple)
    }
    fun pear(view: View) {
        var photo:ImageView = findViewById(R.id.imageViewPear)
        val pear:Int = R.drawable.pear
        photo.setImageResource(pear)
    }
    fun grape(view: View) {
        var photo:ImageView = findViewById(R.id.imageViewGrapes)
        val grapes:Int = R.drawable.grapes
        photo.setImageResource(grapes)
    }

    fun checkBoxApple(view: View) {
        var imageViewApple:ImageView=findViewById(R.id.imageViewApple)
        imageViewApple.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.apple))
        val checkBoxApple:CheckBox=findViewById(R.id.checkBox)
        if (checkBoxApple.isChecked==false)
            imageViewApple.setImageDrawable(null)
    }
    fun checkBoxPear(view: View) {
        var imageViewPear:ImageView=findViewById(R.id.imageViewPear)
        imageViewPear.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pear))
        val checkBoxPear:CheckBox=findViewById(R.id.checkBox2)
        if (checkBoxPear.isChecked==false)
            imageViewPear.setImageDrawable(null)
    }
    fun checkBoxGrapes(view: View) {
        var imageViewGrapes:ImageView=findViewById(R.id.imageViewGrapes)
        imageViewGrapes.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.grapes))
        val checkBoxGrapes:CheckBox=findViewById(R.id.checkBox3)
        if (checkBoxGrapes.isChecked==false)
            imageViewGrapes.setImageDrawable(null)
    }
}