package com.dicodingeventstracker.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.dicodingeventstracker.data.local.datastore.SettingThemePreferences
import com.dicodingeventstracker.data.local.datastore.SettingThemePreferencesImpl

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    fun provideSettingThemePreferences(context: Context):SettingThemePreferences{
        return SettingThemePreferencesImpl.getInstance(context)
    }
}