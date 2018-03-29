package com.habitos.luis.habitossaludables

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.habitos.luis.habitossaludables.adapter.HabitAdapter
import com.habitos.luis.habitossaludables.data.DataService
import kotlinx.android.synthetic.main.list_activity.*

class MainActivity : LogActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        lista.setHasFixedSize(true)
        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = HabitAdapter(DataService.getHabits()) {
            habit ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("icon", habit.icon)
            intent.putExtra("nombre", habit.nombre)
            intent.putExtra("desc", habit.desc)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
//        return super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val habits = DataService.getHabits()
        val intent = Intent(this, DetailActivity::class.java)
        if (item?.itemId == R.id.opcion1) {
            intent.putExtra("icon", habits[0].icon)
            intent.putExtra("nombre", habits[0].nombre)
            intent.putExtra("desc", habits[0].desc)
        } else if (item?.itemId == R.id.opcion2) {
            intent.putExtra("icon", habits[1].icon)
            intent.putExtra("nombre", habits[1].nombre)
            intent.putExtra("desc", habits[1].desc)

        } else if (item?.itemId == R.id.opcion3) {
            intent.putExtra("icon", habits[2].icon)
            intent.putExtra("nombre", habits[2].nombre)
            intent.putExtra("desc", habits[2].desc)

        }
        startActivity(intent)
        return true
    }
}
