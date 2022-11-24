package com.example.calculator.ui.theme

sealed class CalculatorOperation(val symbol: String) {
    object Addition : CalculatorOperation("+")
    object subtract : CalculatorOperation("-")
    object multiplication : CalculatorOperation("*")
    object division : CalculatorOperation("/")
}
