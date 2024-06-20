package com.example.myquizapp

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun questionScreen() {
   val questionsList = Constants.getQuestions()
//    Log.i("QuestionList size is", "${questionsList.size}")
}

@Preview
@Composable
private fun questionScreenPreview() {
    questionScreen()
}