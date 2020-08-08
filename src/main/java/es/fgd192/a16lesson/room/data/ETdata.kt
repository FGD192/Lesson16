package es.fgd192.a16lesson.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ETdata(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var ETone: String = "",
    var ETtwo: String = ""
)