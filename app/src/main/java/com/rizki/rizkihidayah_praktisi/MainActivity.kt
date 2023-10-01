package com.rizki.rizkihidayah_praktisi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rizki.rizkihidayah_praktisi.ui.theme.RizkiHidayah_PRAKTISITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hello(firstName = " Rizki", lastName = " Rizki Hidayah")
        }
    }
}

@Composable
fun Hello(firstName: String, lastName: String, modifier: Modifier = Modifier) {
    Column (
        Modifier
            .padding(all = 40.dp)
            .background(Color.Red) ) {
        Text("Hello $firstName")
        Text("Hello $lastName")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RizkiHidayah_PRAKTISITheme{
        Hello("Rizki", "Rizki Hidayah")
    }
}
