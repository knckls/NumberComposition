package com.example.numbercomposition.domain.entity

data class GameResult (
    val winner: Boolean, //победил или нет
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
        )