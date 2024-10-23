package com.dicodingeventstracker.data.local

import com.dicodingeventstracker.data.local.datastore.SettingThemePreferences
import com.dicodingeventstracker.data.local.room.EventDao
import com.dicodingeventstracker.data.local.room.EventEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val settingThemePreferences: SettingThemePreferences,
    private val eventDao: EventDao
){
    fun getTheme()= settingThemePreferences.getTheme()

    suspend fun setTheme(isDarkModeThemeActive:Boolean)= settingThemePreferences.setTheme(isDarkModeThemeActive)

    suspend fun insertFavoriteEvent(eventEntity: EventEntity) = eventDao.insertFavoriteEvent(eventEntity)

    fun showFavoriteEvent(): Flow<List<EventEntity>> = eventDao.readFavoriteEvents()

    suspend fun deleteFavoriteEvent(eventEntity: EventEntity)= eventDao.deleteFavoriteEvent(eventEntity)

    //suspend fun deleteAllFavoriteEvent()= eventDao.deleteAllFavoriteEvents()
}