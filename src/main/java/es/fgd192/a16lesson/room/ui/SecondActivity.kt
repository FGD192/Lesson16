package es.fgd192.a16lesson.room.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import es.fgd192.a16lesson.R
import es.fgd192.a16lesson.room.MyApp
import es.fgd192.a16lesson.room.data.AppDataBase
import es.fgd192.a16lesson.room.data.ETdata
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

    private var db: AppDataBase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        setupListeners()
        db = MyApp.app?.getDB()

    }

    private fun setupListeners() {
        button.setOnClickListener {
            db?.getDao()?.insertETdata(fetchData())
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun fetchData():ETdata{
        return ETdata(
            ETone = ETone.text.toString(),
            ETtwo = ETtwo.text.toString()
        )
    }
}