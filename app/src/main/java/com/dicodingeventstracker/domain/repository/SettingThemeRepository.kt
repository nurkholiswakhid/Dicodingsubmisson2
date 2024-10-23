package com.dicodingeventstracker.domain.repository

import kotlinx.coroutines.flow.Flow

interface SettingThemeRepository {
    fun getTheme(): Flow<Boolean>

    suspend fun setTheme(isDarkModeThemeActive:Boolean)
}