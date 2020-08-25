package com.team.sunflower_ex.data

import androidx.room.TypeConverter
import java.util.*

class Converters{
    @TypeConverter fun calderToDateStamp(calendar: Calendar): Long = calendar.timeInMillis
}