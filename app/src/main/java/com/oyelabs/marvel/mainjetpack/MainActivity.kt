package com.oyelabs.marvel.mainjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.oyelabs.marvel.mainjetpack.ui.theme.MainJetPackTheme
import com.oyelabs.marvel.mainjetpack.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainJetPackTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        Greeting("Android")
                        CustomText(test = "this is text baby")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun CustomText(test: String) {
    Text(
        text = test,
        color = Color.Blue,
        style = Typography.h5
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainJetPackTheme {
        Column {
            Greeting("Android")
            CustomText(test = "this is text baby")
        }
    }

}