package com.example.calculator

import android.hardware.lights.Light
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorOperation
import com.example.calculator.ui.theme.LightGray
import com.example.calculator.ui.theme.MediumGray
import com.example.calculator.ui.theme.Orange
import com.plcoding.calculatorprep.CalculatorAction
import com.plcoding.calculatorprep.CalculatorButton
import com.plcoding.calculatorprep.CalculatorState

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    ButtonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(
        Modifier.background(Color.Gray)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(ButtonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol?:"") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(symbol = "AC", modifier = Modifier
                    .background(LightGray)
                    .aspectRatio(2f)
                    .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )
                CalculatorButton(symbol = "DEL", modifier = Modifier
                    .background(LightGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(symbol = "/", modifier = Modifier
                    .background(Orange)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(
                            CalculatorAction
                                .Operation(
                                    CalculatorOperation
                                        .division
                                )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(symbol = "7", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(symbol = "8", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorButton(symbol = "9", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )
                CalculatorButton(symbol = "x", modifier = Modifier
                    .background(Orange)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(
                            CalculatorAction
                                .Operation(
                                    CalculatorOperation.multiplication
                                )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(symbol = "4", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorButton(symbol = "5", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorButton(symbol = "6", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )
                CalculatorButton(symbol = "-", modifier = Modifier
                    .background(Orange)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(
                            CalculatorAction
                                .Operation(
                                    CalculatorOperation.subtract
                                )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(symbol = "1", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(symbol = "2", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorButton(symbol = "3", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )
                CalculatorButton(symbol = "+", modifier = Modifier
                    .background(Orange)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(
                            CalculatorAction
                                .Operation(
                                    CalculatorOperation.Addition
                                )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(symbol = "0", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(2f)
                    .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }
                )
                CalculatorButton(symbol = ".", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(symbol = "=", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
            }
        }
    }

}