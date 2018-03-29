package com.habitos.luis.habitossaludables.data

import com.habitos.luis.habitossaludables.R

/**
 * Created by kotlin on 20/03/2018.
 */
data class Habit(var nombre:String, var desc:String, var icon:Int)

// Patrón Singleton
object DataService {
    fun getHabits():List<Habit> {
        return listOf(
                Habit("Angular", "Lo peta!!!", R.drawable.angularlogo),
                Habit("React", "Está bien!", R.drawable.reactlogo),
                Habit("Vue", "Es para hipsters...", R.drawable.vuelogo)
        )
    }
}
