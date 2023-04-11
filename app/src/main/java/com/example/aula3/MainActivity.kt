package com.example.aula3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aula3.ui.theme.Aula3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    cabecalho("Anna Clara MOta Pedrosa Da Silva","Chef" )
                }
            }
        }
    }
}

@Composable
fun cabecalho(nomeCompleto: String, cargo: String) {
    Text(text = "Hello $nomeCompleto!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Aula3Theme {
        cabecalho("Anna","Chef")
    }
}