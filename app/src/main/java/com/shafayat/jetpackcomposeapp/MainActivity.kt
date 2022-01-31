package com.shafayat.jetpackcomposeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Android Logo",
                        style = TextStyle(
                            fontSize = 17.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "$4.99",
                        style = TextStyle(
                            color= Color(0xFF85bb65),
                            fontSize = 17.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(onClick = { }) {
                        Text(text = "Compose Button")
                    }
                }
            }
        }
    }
}