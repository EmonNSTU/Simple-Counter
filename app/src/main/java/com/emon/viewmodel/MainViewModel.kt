package com.emon.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count: Int = 0

    fun increment(){
        count++
    }

    fun decrement(){

        if (count > 0){
            count--
        }
    }

}