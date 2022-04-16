package com.emon.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var counter: TextView
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = findViewById(R.id.textView)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setValues()

    }

    fun setValues(){
        counter.text = viewModel.count.toString()
    }

    fun counter(v: View){
        viewModel.increment()
        setValues()
    }

    fun decrementer(v: View){
        viewModel.decrement()
        setValues()
    }
}