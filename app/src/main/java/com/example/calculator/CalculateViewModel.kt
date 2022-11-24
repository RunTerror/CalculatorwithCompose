package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculator.ui.theme.CalculatorOperation
import com.plcoding.calculatorprep.CalculatorAction
import com.plcoding.calculatorprep.CalculatorState

class CalculateViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
    private set

    fun onAction(action: CalculatorAction){
        when(action){
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDeletion()
        }

    }

    private fun performDeletion() {
        TODO("Not yet implemented")

    }

    private fun performCalculation() {
        TODO("Not yet implemented")
    }

    private fun enterOperation(operation: CalculatorOperation) {
        if(state.number1.isNotBlank()){
            state=state.copy()
        }

    }

    private fun enterDecimal() {
        TODO("Not yet implemented")
    }

    private fun enterNumber(number: Int) {

    }

}