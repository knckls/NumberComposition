package com.example.numbercomposition.domain.usecases

import com.example.numbercomposition.domain.entity.GameSettings
import com.example.numbercomposition.domain.entity.Level
import com.example.numbercomposition.domain.repository.GameRepository

//загружает настройки игры в зависимости от уровня
class GetGameSettingsUseCase  (
    private val repository: GameRepository
) {

    operator fun invoke(level: Level) : GameSettings {
        return repository.getGameSettings(level)
    }
}