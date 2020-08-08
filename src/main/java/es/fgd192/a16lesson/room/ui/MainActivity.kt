package es.fgd192.a16lesson.room.ui

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import es.fgd192.a16lesson.R
import es.fgd192.a16lesson.room.MyApp
import es.fgd192.a16lesson.room.data.AppDataBase
import es.fgd192.a16lesson.room.data.ETdata
import kotlinx.android.synthetic.main.second_activity.*

class MainActivity : AppCompatActivity() {
    private var db: AppDataBase? = null
    private var recyclerView: RecyclerView? = null
    val adapter = ReViAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = MyApp.app?.getDB()

        setupView()
        setupRecyclerView()
    }

    private fun setupView() {
        recyclerView = findViewById(R.id.recyclerView)
    }

    private fun setupRecyclerView() {
        recyclerView?.adapter = adapter
        val data = db?.getDao()?.getData()
        if (data!=null)
            adapter.update(data)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemAdd -> startActivity(Intent(this, SecondActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}