package com.example.numbercomposition.domain.entity

data class Question (
    val sum: Int,  //значение суммы которую надо составить
    val visibleNumber: Int, //часть от суммы, которая видна игроку
    val options: List<Int> //варианты ответов
        )