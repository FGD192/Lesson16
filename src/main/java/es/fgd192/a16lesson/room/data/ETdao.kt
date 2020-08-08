package es.fgd192.a16lesson.room.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ETdao {

    @Insert
    fun insertETdata(data: ETdata)

    @Query("SELECT * FROM ETdata")
    fun getData(): List<ETdata>
}