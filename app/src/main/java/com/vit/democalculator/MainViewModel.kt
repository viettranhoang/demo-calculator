package com.vit.democalculator

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val result = ObservableField("0")

    val cal = Calculator()

    fun onClickOperation(operation: String) {
        cal.addOperation(operation)
        result.set(cal.getResult())
    }

    fun onClickNumber(number: String) {
        cal.addNumber(number)
        result.set(cal.getResult())
    }

    fun onClickEqual() {
        cal.pressEqual = true
        result.set(cal.getResult())
    }

    fun onClickClear() {
        cal.clear()
        result.set("")
    }

}