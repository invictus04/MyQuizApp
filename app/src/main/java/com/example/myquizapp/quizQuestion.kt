package com.example.myquizapp

import android.media.Image
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun quizQuestions(navigateToFinishScreen: () -> Unit) {
    val questionsList = Constants.getQuestions()
    var progress by remember{ mutableStateOf(1f)}
    var tvProgress by remember { mutableStateOf(1)}
    var correctAnswer by remember { mutableStateOf(0)}
    var selectedAnswer by remember { mutableStateOf(-1)}
    var tvQuestion by remember { mutableStateOf("") }
    var tvOptionOne by remember { mutableStateOf("") }
    var tvOptionTwo by remember { mutableStateOf("") }
    var tvOptionThree by remember { mutableStateOf("") }
    var tvOptionFour by remember { mutableStateOf("") }
    val maxProgress = 10
    val context = LocalContext.current

   var score by remember { mutableStateOf(0) }

    var currentPosition by remember { mutableStateOf(1)}
    val question: setOfQuestions = questionsList[currentPosition-1]
    var  ivImage = rememberAsyncImagePainter(model = question.image)
        tvQuestion = question.question
        tvOptionOne = question.optionOne
        tvOptionTwo = question.optionTwo
        tvOptionThree = question.optionThree
        tvOptionFour = question.optionFour
        correctAnswer = question.correctAnswer


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = tvQuestion,
            fontSize = 25.sp,
            textAlign = TextAlign.Center)


        Image(
            painter = ivImage,
            contentDescription = "Quiz image",
            modifier = Modifier.size(160.dp),
        )
    Row(modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically){
        LinearProgressIndicator(
            progress = progress/maxProgress,
            modifier = Modifier
                .padding(5.dp)
                .size(width = 300.dp, height = 5.dp))
        Text(text = "$tvProgress/$maxProgress",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 5.dp)
            )
        }

        Column(modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            OutlinedButton(onClick = {
                        selectedAnswer = 1
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp) ){
                Text(text = tvOptionOne,
                    fontSize = 15.sp)
            }
            OutlinedButton(onClick = {
                                     selectedAnswer = 2
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)) {
                Text(text = tvOptionTwo,
                    fontSize = 15.sp)
            }
            OutlinedButton(onClick = {
                                     selectedAnswer = 3
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)) {
                Text(text = tvOptionThree,
                    fontSize = 15.sp)
            }
            OutlinedButton(onClick = {
                                     selectedAnswer = 4
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)) {
                Text(text = tvOptionFour,
                    fontSize = 15.sp)
            }
        Button(onClick = {
                if (currentPosition < questionsList.size) {
                    currentPosition++;
                    tvProgress++;
                    progress = tvProgress.toFloat()
                    if (tvProgress > maxProgress) {
                        progress = 1f
                        tvProgress = 1
                    }
                    if (selectedAnswer == correctAnswer) score++
                    selectedAnswer -1
                } else {
                    Toast.makeText(context, "Done $score", Toast.LENGTH_SHORT).show()
                }

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp),
            shape = RectangleShape) {
            if(selectedAnswer != -1) {
                Text(text = "Submit")
            } else {
            Text(text = "GO TO NEXT QUESTION")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun quizQuestionPreview() {
    quizQuestions({})
}