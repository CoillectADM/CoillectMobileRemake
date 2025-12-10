package com.example.coillectremake.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider


enum class FieldTypes {
    Text, Email, Password
}


@Composable

fun TextField(
    // State para leitura
    state: String,
    // onChange
    onChangeState: (String) -> Unit,
    // Tipos de campos
    type: FieldTypes,
    // Mensagem de erro,Validade
    validationState: Pair<String, Boolean>
): Unit {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Column {
            when (type) {
                FieldTypes.Text -> {
                    BasicTextField(
                        value = state,
                        onValueChange = onChangeState,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                            .border(
                                1.dp,
                                if (validationState.second) Color.Gray else Color.Red,
                                RoundedCornerShape(8.dp)
                            ),
                        singleLine = true,
                    )
                }

                FieldTypes.Email -> {
                    BasicTextField(
                        value = state,
                        onValueChange = onChangeState,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                            .border(
                                1.dp,
                                if (validationState.second) Color.Gray else Color.Red,
                                RoundedCornerShape(8.dp)
                            ),
                        singleLine = true,

                        )
                }

                FieldTypes.Password -> {
                    var passwordVisible by remember { mutableStateOf(false) }
                    BasicTextField(
                        value = state,
                        onValueChange = onChangeState,
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                            .border(
                                1.dp,
                                if (validationState.second) Color.Gray else Color.Red,
                                RoundedCornerShape(8.dp)
                            ),
                        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        decorationBox = { innerTextField: @Composable () -> Unit ->
                            Box(Modifier.fillMaxWidth()) {
                                innerTextField()
                                IconButton(
                                    onClick = { passwordVisible = !passwordVisible },
                                    modifier = Modifier.align(Alignment.CenterEnd)
                                ) {
                                    Icon(
                                        imageVector = if (passwordVisible) Icons.Filled.VisibilityOff
                                        else Icons.Filled.Visibility, contentDescription = null
                                    )
                                }
                            }


                        },
                    )

                }
            }

        }

        if (!validationState.second) {
            Text(
                text = validationState.first,
                color = Color.Red,
                modifier = Modifier.padding(start = 12.dp)
            )
        }
    }
}


