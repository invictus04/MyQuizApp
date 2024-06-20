package com.example.myquizapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun result() {
    Box( modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter) {
        Image(
            painter = painterResource(id = R.drawable.ic_bg),
            contentDescription = "quiz background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Result",
                modifier = Modifier.padding(20.dp),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                letterSpacing = 1.5.sp)
        Image(painter = painterResource(id = R.drawable.ic_trophy),
            contentDescription = null,
            modifier = Modifier.size(350.dp))
            Text(text = "Hey, Congratulations!",
                modifier = Modifier.padding(5.dp),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 31.sp,
                letterSpacing = 1.5.sp)
            Text(text = "Name",
                modifier = Modifier.padding(5.dp),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                letterSpacing = 1.5.sp)
            Text(text = "Your Score is 0 out of 9.",
                modifier = Modifier.padding(5.dp),
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                letterSpacing = 1.5.sp)
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)) {
                Text(text = "FINISH",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp,
                    style = TextStyle(color = Color.Black)
                    )
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
private fun resultPreview() {
    result()
}