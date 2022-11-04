package com.example.numbercomposition.domain.entity

data class GameSettings(
    val maxSumValue: Int, //максимально возможное значение
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
)