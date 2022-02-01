package com.shafayat.jetpackcomposeapp

import android.content.Context
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
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.shafayat.jetpackcomposeapp.ui.HorizontalDottedProgress

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
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Android Logo",
                            style = TextStyle(
                                fontSize = 17.sp
                            )
                        )
                        Text(
                            text = "$4.99",
                            style = TextStyle(
                                color= Color(0xFF85bb65),
                                fontSize = 15.sp
                            ),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }

                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "Premium Logo",
                        style = TextStyle(
                            color= Color(0xFF85bb65),
                            fontSize = 17.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(
                        onClick = { },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "Order Now")
                    }
                    CircularProgressIndicator()
                    val customView = HorizontalDottedProgress(LocalContext.current)
                    AndroidView(factory = { customView })
                }
            }
        }
    }
}