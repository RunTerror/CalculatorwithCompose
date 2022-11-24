package com.plcoding.calculatorprep

import com.example.calculator.ui.theme.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)