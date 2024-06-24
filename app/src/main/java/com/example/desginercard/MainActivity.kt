package com.example.desginercard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desginercard.ui.theme.DesginerCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DesginerCardTheme {
                Alldetails()
            }
        }
    }
}

@Composable
fun Alldetails() {
    Column(Modifier.fillMaxWidth().fillMaxHeight()) {
        Row(Modifier.weight(1f, fill = true)) {
            Adddetails(
                name = "Debojyoti Dey",
                details = "Android Developer",
                backgroundcolor = Color(0xFFE4FFDD),
                image1 = painterResource(id = R.drawable.android_robot_head6361)
            )
        }
        Row(Modifier.weight(1f, fill = true)) {
            AddIcons(phone = "8953214567", email = "debojyotidey@gmail.com",)
        }
    }
}

@Composable
fun Adddetails(
    name: String,
    details: String,
    backgroundcolor: Color,
    image1: Painter,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(backgroundcolor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image1,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = name,
            modifier = Modifier.padding(18.dp),
            fontSize = 27.sp
        )
        Text(
            text = details,
            modifier = Modifier.padding(18.dp),
            fontSize = 16.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun AddIcons(phone: String, email: String,bg: Color = Color(0xFFE4FFDD), modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(bg),
            Arrangement.Center,
           horizontalAlignment =  Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.round_call_24),
            contentDescription = "Call",
        )
        Text(
            text = phone,
            modifier = Modifier.padding(18.dp)
        )
        Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
        Text(
            text = email,
            modifier = Modifier.padding(18.dp)
        )
        FloatingActionButton(onClick = { TODO() }) {
            Text(text = "Portfolio", modifier = Modifier.padding(12.dp))
    }
}
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DesginerCardTheme {
        Alldetails()
    }
}
