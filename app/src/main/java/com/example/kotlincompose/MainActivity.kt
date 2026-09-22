package com.example.kotlincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlincompose.ui.theme.KotlinComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting( ) {

    Column(
        modifier = Modifier.padding(32.dp).fillMaxWidth()
    ) {

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = "",
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Red
            ),
            onValueChange = {},
            placeholder = {Text( text = "Oque voce esta procurando")},
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.baseline_search_24),
                    contentDescription = "Campo de busca"
                )
            }
            )
    }
}

