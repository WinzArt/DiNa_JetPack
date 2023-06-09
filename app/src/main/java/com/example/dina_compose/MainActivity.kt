package com.example.dina_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dina_compose.ui.theme.DiNa_ComposeTheme

class MainActivity : ComponentActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContent {
      DiNa_ComposeTheme(darkTheme = false) { // A surface container using the
        // 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background,
        ) {
          MyUi()
        }
      }
    }
  }
}

@Composable
fun MyUi()
{
  Column {
    ScaffoldLayout()
//    TestCode()
  }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview()
{
  DiNa_ComposeTheme(darkTheme = false) { // A surface container using the
    // 'background' color from the theme
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = MaterialTheme.colors.background,
    ) {
      MyUi()
    }
  }
}