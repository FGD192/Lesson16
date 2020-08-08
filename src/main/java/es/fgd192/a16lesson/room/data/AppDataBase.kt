package es.fgd192.a16lesson.room.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ETdata::class], version = 2)
abstract class AppDataBase  : RoomDatabase() {
    abstract fun getDao(): ETdao
}