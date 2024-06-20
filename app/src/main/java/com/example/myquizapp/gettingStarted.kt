package com.example.myquizapp

import android.widget.Button
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun startingApp(navigateToQuestion: () -> Unit) {
    val btnStart: Button
    var etName = remember {
        mutableStateOf(" ")
    }
    val context = LocalContext.current
    val navController = rememberNavController()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_bg),
            contentDescription = "quiz background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                text = "Quiz App!",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 25.sp
                ),
                modifier = Modifier.padding(10.dp)
            )

            ElevatedCard(
                modifier = Modifier.size(width = 350.dp, height = 225.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                )
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Welcome",
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier.padding(4.dp)
                    )
                    Text(
                        text = "Please Enter Your Name",
                        modifier = Modifier.padding(5.dp),
                        color = colorResource(id = R.color.light_grey)
                    )
                    OutlinedTextField(
                        value = etName.value,
                        onValueChange = {etName.value = it},
                        textStyle = TextStyle(
                            color = colorResource(id = R.color.light_grey)
                        ),
                        modifier = Modifier
                            .size(width = 320.dp, height = 60.dp)
                            .padding(top = 8.dp, bottom = 5.dp)

                    )
                    Button(
                        onClick = {
                                  if(etName.value.isEmpty()) {
                                      Toast.makeText(context,"Please Enter your name", Toast.LENGTH_LONG).show()
                                  } else {
                                    navigateToQuestion()
                                  }
                        },
                        modifier = Modifier
                            .size(width = 320.dp, height = 50.dp)
                            .padding(vertical = 7.dp),
                        shape = RectangleShape
                    ) {
                        Text(text = "START")
                    }

                }       

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MyQuizPreview() {
    MyQuiz()
}