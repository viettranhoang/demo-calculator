package com.vit.democalculator

class Calculator {

    var stack = ""
    var pressEqual = false

    fun add(x: Double, y: Double) = x + y
    fun sub(x: Double, y: Double) = x - y
    fun mul(x: Double, y: Double) = x * y
    fun div(x: Double, y: Double) = if(y != 0.0) x/y else 0.0

    fun addOperation(operation: String) {
        if (pressEqual) {
            stack = getResult() + operation
            pressEqual = false
        }
        else stack += operation
    }

    fun addNumber(number: String) {
        if (pressEqual) {
            stack = ""
            pressEqual = true
        }
        else stack += number
    }

    fun getResult() = stack //TODO Handle string -> result

    fun clear() {
        stack = ""
        pressEqual = false
    }

}